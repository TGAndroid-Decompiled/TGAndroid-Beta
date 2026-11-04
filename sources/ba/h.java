package ba;

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
public final class h {
    public static final Charset f3183b = Charset.forName("UTF-8");
    public final fa.f f3184a;

    public h(fa.f fVar) {
        this.f3184a = fVar;
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
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            String string = jSONArray.getString(i3);
            try {
                arrayList.add(p.a(string));
            } catch (Exception e10) {
                Log.w("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e10);
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i3 = 0; i3 < list.size(); i3++) {
            try {
                jSONArray.put(new JSONObject(p.f3204a.d2(list.get(i3))));
            } catch (JSONException e10) {
                Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", e10);
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
            Log.i("FirebaseCrashlytics", com.google.android.recaptcha.internal.a.k("Deleted corrupt file: ", file.getAbsolutePath(), "\nReason: ", str), null);
        }
    }

    public final Map c(String str, boolean z10) {
        File b10;
        Throwable th2;
        FileInputStream fileInputStream;
        Exception e10;
        fa.f fVar = this.f3184a;
        if (z10) {
            b10 = fVar.b(str, "internal-keys");
        } else {
            b10 = fVar.b(str, "keys");
        }
        if (b10.exists() && b10.length() != 0) {
            try {
                try {
                    fileInputStream = new FileInputStream(b10);
                    try {
                        HashMap a10 = a(z9.g.j(fileInputStream));
                        z9.g.b(fileInputStream, "Failed to close user metadata file.");
                        return a10;
                    } catch (Exception e11) {
                        e10 = e11;
                        Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e10);
                        f(b10);
                        z9.g.b(fileInputStream, "Failed to close user metadata file.");
                        return Collections.EMPTY_MAP;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    z9.g.b(r1, "Failed to close user metadata file.");
                    throw th2;
                }
            } catch (Exception e12) {
                fileInputStream = null;
                e10 = e12;
            } catch (Throwable th4) {
                ?? r12 = 0;
                th2 = th4;
                z9.g.b(r12, "Failed to close user metadata file.");
                throw th2;
            }
        } else {
            g(b10, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
    }

    public final String d(String str) {
        FileInputStream fileInputStream;
        String str2;
        File b10 = this.f3184a.b(str, "user-data");
        Closeable closeable = null;
        if (b10.exists()) {
            ?? r32 = (b10.length() > 0L ? 1 : (b10.length() == 0L ? 0 : -1));
            try {
                if (r32 != 0) {
                    try {
                        fileInputStream = new FileInputStream(b10);
                        try {
                            JSONObject jSONObject = new JSONObject(z9.g.j(fileInputStream));
                            if (!jSONObject.isNull("userId")) {
                                str2 = jSONObject.optString("userId", null);
                            } else {
                                str2 = null;
                            }
                            String str3 = "Loaded userId " + str2 + " for session " + str;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str3, null);
                            }
                            z9.g.b(fileInputStream, "Failed to close user metadata file.");
                            return str2;
                        } catch (Exception e10) {
                            e = e10;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            f(b10);
                            z9.g.b(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        fileInputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        z9.g.b(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                closeable = r32;
            }
        }
        String f10 = t4.c.f("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", f10, null);
        }
        f(b10);
        return null;
    }

    public final void h(String str, Map map, boolean z10) {
        File b10;
        String jSONObject;
        BufferedWriter bufferedWriter;
        fa.f fVar = this.f3184a;
        if (z10) {
            b10 = fVar.b(str, "internal-keys");
        } else {
            b10 = fVar.b(str, "keys");
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                jSONObject = new JSONObject(map).toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b10), f3183b));
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bufferedWriter.write(jSONObject);
            bufferedWriter.flush();
            z9.g.b(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e11) {
            e = e11;
            bufferedWriter2 = bufferedWriter;
            Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
            f(b10);
            z9.g.b(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter2 = bufferedWriter;
            z9.g.b(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    public final void i(String str, String str2) {
        String obj;
        BufferedWriter bufferedWriter;
        File b10 = this.f3184a.b(str, "user-data");
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("userId", str2);
                obj = jSONObject.toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b10), f3183b));
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bufferedWriter.write(obj);
            bufferedWriter.flush();
            z9.g.b(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e11) {
            e = e11;
            bufferedWriter2 = bufferedWriter;
            Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
            z9.g.b(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter2 = bufferedWriter;
            z9.g.b(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }
}
