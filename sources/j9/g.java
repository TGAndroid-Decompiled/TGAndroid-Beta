package j9;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.Closeable;
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
import vh.v2;
public final class g {
    public static final Charset f9328b = Charset.forName("UTF-8");
    public final n9.b f9329a;

    public g(n9.b bVar) {
        this.f9329a = bVar;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str2 = null;
            if (!jSONObject.isNull(next)) {
                str2 = jSONObject.optString(next, null);
            }
            hashMap.put(next, str2);
        }
        return hashMap;
    }

    public static ArrayList b(String str) {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getString(i10);
            try {
                arrayList.add(n.a(string));
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e);
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                jSONArray.put(new JSONObject(n.f9345a.e(list.get(i10))));
            } catch (JSONException e) {
                Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", e);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), null);
        }
    }

    public final Map c(String str, boolean z4) {
        File b10;
        FileInputStream fileInputStream;
        Exception e;
        n9.b bVar = this.f9329a;
        if (z4) {
            b10 = bVar.b(str, "internal-keys");
        } else {
            b10 = bVar.b(str, "keys");
        }
        if (b10.exists()) {
            ?? length = b10.length();
            if (length != 0) {
                Closeable closeable = null;
                try {
                    try {
                        fileInputStream = new FileInputStream(b10);
                        try {
                            HashMap a2 = a(i9.h.j(fileInputStream));
                            i9.h.c(fileInputStream, "Failed to close user metadata file.");
                            return a2;
                        } catch (Exception e6) {
                            e = e6;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            f(b10);
                            i9.h.c(fileInputStream, "Failed to close user metadata file.");
                            return Collections.EMPTY_MAP;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        closeable = length;
                        i9.h.c(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                } catch (Exception e10) {
                    fileInputStream = null;
                    e = e10;
                } catch (Throwable th3) {
                    th = th3;
                    i9.h.c(closeable, "Failed to close user metadata file.");
                    throw th;
                }
            }
        }
        f(b10);
        return Collections.EMPTY_MAP;
    }

    public final String d(String str) {
        FileInputStream fileInputStream;
        String str2;
        File b10 = this.f9329a.b(str, "user-data");
        Closeable closeable = null;
        if (b10.exists()) {
            ?? r32 = (b10.length() > 0L ? 1 : (b10.length() == 0L ? 0 : -1));
            try {
                if (r32 != 0) {
                    try {
                        fileInputStream = new FileInputStream(b10);
                        try {
                            JSONObject jSONObject = new JSONObject(i9.h.j(fileInputStream));
                            if (!jSONObject.isNull("userId")) {
                                str2 = jSONObject.optString("userId", null);
                            } else {
                                str2 = null;
                            }
                            String str3 = "Loaded userId " + str2 + " for session " + str;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str3, null);
                            }
                            i9.h.c(fileInputStream, "Failed to close user metadata file.");
                            return str2;
                        } catch (Exception e) {
                            e = e;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            f(b10);
                            i9.h.c(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e6) {
                        e = e6;
                        fileInputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        i9.h.c(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                closeable = r32;
            }
        }
        String e10 = v2.e("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", e10, null);
        }
        f(b10);
        return null;
    }

    public final void g(String str, Map map, boolean z4) {
        File b10;
        String jSONObject;
        BufferedWriter bufferedWriter;
        n9.b bVar = this.f9329a;
        if (z4) {
            b10 = bVar.b(str, "internal-keys");
        } else {
            b10 = bVar.b(str, "keys");
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                jSONObject = new JSONObject(map).toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b10), f9328b));
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bufferedWriter.write(jSONObject);
            bufferedWriter.flush();
            i9.h.c(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e6) {
            e = e6;
            bufferedWriter2 = bufferedWriter;
            Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
            f(b10);
            i9.h.c(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter2 = bufferedWriter;
            i9.h.c(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    public final void h(String str, List list) {
        String e;
        BufferedWriter bufferedWriter;
        File b10 = this.f9329a.b(str, "rollouts-state");
        if (list.isEmpty()) {
            f(b10);
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                e = e(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b10), f9328b));
            } catch (Exception e6) {
                e = e6;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bufferedWriter.write(e);
            bufferedWriter.flush();
            i9.h.c(bufferedWriter, "Failed to close rollouts state file.");
        } catch (Exception e10) {
            e = e10;
            bufferedWriter2 = bufferedWriter;
            Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
            f(b10);
            i9.h.c(bufferedWriter2, "Failed to close rollouts state file.");
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter2 = bufferedWriter;
            i9.h.c(bufferedWriter2, "Failed to close rollouts state file.");
            throw th;
        }
    }

    public final void i(String str, String str2) {
        String obj;
        BufferedWriter bufferedWriter;
        File b10 = this.f9329a.b(str, "user-data");
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("userId", str2);
                obj = jSONObject.toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b10), f9328b));
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bufferedWriter.write(obj);
            bufferedWriter.flush();
            i9.h.c(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e6) {
            e = e6;
            bufferedWriter2 = bufferedWriter;
            Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
            i9.h.c(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter2 = bufferedWriter;
            i9.h.c(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }
}
