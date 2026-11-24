package defpackage;

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
public final class jf7 {
    public static final Charset b = Charset.forName("UTF-8");
    public final jd4 a;

    public jf7(jd4 jd4Var) {
        this.a = jd4Var;
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
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                arrayList.add(ml9.a(string));
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e);
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(ml9.a.s(list.get(i))));
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

    public static void g(File file, String str) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", td4.r("Deleted corrupt file: ", file.getAbsolutePath(), "\nReason: ", str), null);
        }
    }

    public final Map c(String str, boolean z) {
        File b2;
        FileInputStream fileInputStream;
        Exception e;
        jd4 jd4Var = this.a;
        if (z) {
            b2 = jd4Var.b(str, "internal-keys");
        } else {
            b2 = jd4Var.b(str, "keys");
        }
        if (b2.exists() && b2.length() != 0) {
            FileInputStream fileInputStream2 = null;
            try {
                fileInputStream = new FileInputStream(b2);
                try {
                    try {
                        HashMap a = a(bo2.l(fileInputStream));
                        bo2.b(fileInputStream, "Failed to close user metadata file.");
                        return a;
                    } catch (Exception e2) {
                        e = e2;
                        Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                        f(b2);
                        bo2.b(fileInputStream, "Failed to close user metadata file.");
                        return Collections.EMPTY_MAP;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    bo2.b(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e3) {
                fileInputStream = null;
                e = e3;
            } catch (Throwable th2) {
                th = th2;
                bo2.b(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } else {
            g(b2, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
    }

    public final String d(String str) {
        FileInputStream fileInputStream;
        String str2;
        File b2 = this.a.b(str, "user-data");
        Closeable closeable = null;
        if (b2.exists()) {
            ?? r2 = (b2.length() > 0L ? 1 : (b2.length() == 0L ? 0 : -1));
            try {
                if (r2 != 0) {
                    try {
                        fileInputStream = new FileInputStream(b2);
                        try {
                            JSONObject jSONObject = new JSONObject(bo2.l(fileInputStream));
                            if (!jSONObject.isNull("userId")) {
                                str2 = jSONObject.optString("userId", null);
                            } else {
                                str2 = null;
                            }
                            String str3 = "Loaded userId " + str2 + " for session " + str;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str3, null);
                            }
                            bo2.b(fileInputStream, "Failed to close user metadata file.");
                            return str2;
                        } catch (Exception e) {
                            e = e;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            f(b2);
                            bo2.b(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        bo2.b(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = r2;
            }
        }
        String h = b10.h("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", h, null);
        }
        f(b2);
        return null;
    }

    public final void h(String str, Map map, boolean z) {
        File b2;
        BufferedWriter bufferedWriter;
        Exception e;
        jd4 jd4Var = this.a;
        if (z) {
            b2 = jd4Var.b(str, "internal-keys");
        } else {
            b2 = jd4Var.b(str, "keys");
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            String jSONObject = new JSONObject(map).toString();
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b2), b));
            try {
                try {
                    bufferedWriter.write(jSONObject);
                    bufferedWriter.flush();
                } catch (Exception e2) {
                    e = e2;
                    Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
                    f(b2);
                    bo2.b(bufferedWriter, "Failed to close key/value metadata file.");
                }
            } catch (Throwable th) {
                th = th;
                bufferedWriter2 = bufferedWriter;
                bo2.b(bufferedWriter2, "Failed to close key/value metadata file.");
                throw th;
            }
        } catch (Exception e3) {
            bufferedWriter = null;
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            bo2.b(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
        bo2.b(bufferedWriter, "Failed to close key/value metadata file.");
    }

    public final void i(String str, String str2) {
        String obj;
        BufferedWriter bufferedWriter;
        File b2 = this.a.b(str, "user-data");
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("userId", str2);
                obj = jSONObject.toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b2), b));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            bufferedWriter.write(obj);
            bufferedWriter.flush();
            bo2.b(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e2) {
            e = e2;
            bufferedWriter2 = bufferedWriter;
            Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
            bo2.b(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            bo2.b(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }
}
