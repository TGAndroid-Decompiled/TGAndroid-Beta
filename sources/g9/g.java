package g9;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class g {

    public static final Charset f6807b = Charset.forName("UTF-8");

    public final k9.c f6808a;

    public g(k9.c cVar) {
        this.f6808a = cVar;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = null;
            if (!jSONObject.isNull(next)) {
                strOptString = jSONObject.optString(next, null);
            }
            map.put(next, strOptString);
        }
        return map;
    }

    public static ArrayList b(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getString(i10);
            try {
                arrayList.add(n.a(string));
            } catch (Exception e9) {
                Log.w("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e9);
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                jSONArray.put(new JSONObject(n.f6825a.h(list.get(i10))));
            } catch (JSONException e9) {
                Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", e9);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), null);
        }
    }

    public final Map c(String str, boolean z10) throws Throwable {
        FileInputStream fileInputStream;
        Exception e9;
        k9.c cVar = this.f6808a;
        File fileB = z10 ? cVar.b(str, "internal-keys") : cVar.b(str, "keys");
        if (fileB.exists()) {
            ?? length = fileB.length();
            if (length != 0) {
                ?? r10 = 0;
                try {
                    try {
                        fileInputStream = new FileInputStream(fileB);
                        try {
                            HashMap mapA = a(f9.h.j(fileInputStream));
                            f9.h.c(fileInputStream, "Failed to close user metadata file.");
                            return mapA;
                        } catch (Exception e10) {
                            e9 = e10;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e9);
                            f(fileB);
                            f9.h.c(fileInputStream, "Failed to close user metadata file.");
                            return Collections.EMPTY_MAP;
                        }
                    } catch (Throwable th) {
                        th = th;
                        r10 = length;
                        f9.h.c(r10, "Failed to close user metadata file.");
                        throw th;
                    }
                } catch (Exception e11) {
                    fileInputStream = null;
                    e9 = e11;
                } catch (Throwable th2) {
                    th = th2;
                    f9.h.c(r10, "Failed to close user metadata file.");
                    throw th;
                }
            }
        }
        f(fileB);
        return Collections.EMPTY_MAP;
    }

    public final String d(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileB = this.f6808a.b(str, "user-data");
        ?? r10 = 0;
        if (fileB.exists()) {
            ?? r11 = (fileB.length() > 0L ? 1 : (fileB.length() == 0L ? 0 : -1));
            try {
                if (r11 != 0) {
                    try {
                        fileInputStream = new FileInputStream(fileB);
                        try {
                            JSONObject jSONObject = new JSONObject(f9.h.j(fileInputStream));
                            String strOptString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                            String str2 = "Loaded userId " + strOptString + " for session " + str;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str2, null);
                            }
                            f9.h.c(fileInputStream, "Failed to close user metadata file.");
                            return strOptString;
                        } catch (Exception e9) {
                            e = e9;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            f(fileB);
                            f9.h.c(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        f9.h.c(r10, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r10 = r11;
            }
        }
        String strE = s3.c.e("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strE, null);
        }
        f(fileB);
        return null;
    }

    public final void g(String str, Map map, boolean z10) throws Throwable {
        k9.c cVar = this.f6808a;
        File fileB = z10 ? cVar.b(str, "internal-keys") : cVar.b(str, "keys");
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String string = new JSONObject(map).toString();
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileB), f6807b));
                try {
                    bufferedWriter2.write(string);
                    bufferedWriter2.flush();
                    f9.h.c(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e9) {
                    e = e9;
                    bufferedWriter = bufferedWriter2;
                    Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
                    f(fileB);
                    f9.h.c(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    f9.h.c(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void h(String str, List list) throws Throwable {
        File fileB = this.f6808a.b(str, "rollouts-state");
        if (list.isEmpty()) {
            f(fileB);
            return;
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strE = e(list);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileB), f6807b));
                try {
                    bufferedWriter2.write(strE);
                    bufferedWriter2.flush();
                    f9.h.c(bufferedWriter2, "Failed to close rollouts state file.");
                } catch (Exception e9) {
                    e = e9;
                    bufferedWriter = bufferedWriter2;
                    Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
                    f(fileB);
                    f9.h.c(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    f9.h.c(bufferedWriter, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void i(String str, String str2) throws Throwable {
        File fileB = this.f6808a.b(str, "user-data");
        BufferedWriter bufferedWriter = null;
        try {
            try {
                f fVar = new f();
                fVar.put("userId", str2);
                String string = fVar.toString();
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileB), f6807b));
                try {
                    bufferedWriter2.write(string);
                    bufferedWriter2.flush();
                    f9.h.c(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e9) {
                    e = e9;
                    bufferedWriter = bufferedWriter2;
                    Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
                    f9.h.c(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    f9.h.c(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
