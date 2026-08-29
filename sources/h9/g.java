package h9;

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
public final class g {
    public static final Charset f7954b = Charset.forName("UTF-8");
    public final l9.b f7955a;

    public g(l9.b bVar) {
        this.f7955a = bVar;
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
            } catch (Exception e10) {
                Log.w("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e10);
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                jSONArray.put(new JSONObject(n.f7972a.y(list.get(i10))));
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

    public final Map c(String str, boolean z10) {
        File b10;
        FileInputStream fileInputStream;
        Exception e10;
        l9.b bVar = this.f7955a;
        if (z10) {
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
                            HashMap a2 = a(g9.h.j(fileInputStream));
                            g9.h.c(fileInputStream, "Failed to close user metadata file.");
                            return a2;
                        } catch (Exception e11) {
                            e10 = e11;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e10);
                            f(b10);
                            g9.h.c(fileInputStream, "Failed to close user metadata file.");
                            return Collections.EMPTY_MAP;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        closeable = length;
                        g9.h.c(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                } catch (Exception e12) {
                    fileInputStream = null;
                    e10 = e12;
                } catch (Throwable th3) {
                    th = th3;
                    g9.h.c(closeable, "Failed to close user metadata file.");
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
        File b10 = this.f7955a.b(str, "user-data");
        Closeable closeable = null;
        if (b10.exists()) {
            ?? r32 = (b10.length() > 0L ? 1 : (b10.length() == 0L ? 0 : -1));
            try {
                if (r32 != 0) {
                    try {
                        fileInputStream = new FileInputStream(b10);
                        try {
                            JSONObject jSONObject = new JSONObject(g9.h.j(fileInputStream));
                            if (!jSONObject.isNull("userId")) {
                                str2 = jSONObject.optString("userId", null);
                            } else {
                                str2 = null;
                            }
                            String str3 = "Loaded userId " + str2 + " for session " + str;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str3, null);
                            }
                            g9.h.c(fileInputStream, "Failed to close user metadata file.");
                            return str2;
                        } catch (Exception e10) {
                            e = e10;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            f(b10);
                            g9.h.c(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        fileInputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        g9.h.c(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                closeable = r32;
            }
        }
        String e12 = u3.c.e("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", e12, null);
        }
        f(b10);
        return null;
    }

    public final void g(String str, Map map, boolean z10) {
        File b10;
        String jSONObject;
        BufferedWriter bufferedWriter;
        l9.b bVar = this.f7955a;
        if (z10) {
            b10 = bVar.b(str, "internal-keys");
        } else {
            b10 = bVar.b(str, "keys");
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                jSONObject = new JSONObject(map).toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b10), f7954b));
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bufferedWriter.write(jSONObject);
            bufferedWriter.flush();
            g9.h.c(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e11) {
            e = e11;
            bufferedWriter2 = bufferedWriter;
            Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
            f(b10);
            g9.h.c(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter2 = bufferedWriter;
            g9.h.c(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    public final void h(String str, List list) {
        String e10;
        BufferedWriter bufferedWriter;
        File b10 = this.f7955a.b(str, "rollouts-state");
        if (list.isEmpty()) {
            f(b10);
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                e10 = e(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b10), f7954b));
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bufferedWriter.write(e10);
            bufferedWriter.flush();
            g9.h.c(bufferedWriter, "Failed to close rollouts state file.");
        } catch (Exception e12) {
            e = e12;
            bufferedWriter2 = bufferedWriter;
            Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
            f(b10);
            g9.h.c(bufferedWriter2, "Failed to close rollouts state file.");
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter2 = bufferedWriter;
            g9.h.c(bufferedWriter2, "Failed to close rollouts state file.");
            throw th;
        }
    }

    public final void i(String str, String str2) {
        String obj;
        BufferedWriter bufferedWriter;
        File b10 = this.f7955a.b(str, "user-data");
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("userId", str2);
                obj = jSONObject.toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b10), f7954b));
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bufferedWriter.write(obj);
            bufferedWriter.flush();
            g9.h.c(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e11) {
            e = e11;
            bufferedWriter2 = bufferedWriter;
            Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
            g9.h.c(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter2 = bufferedWriter;
            g9.h.c(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }
}
