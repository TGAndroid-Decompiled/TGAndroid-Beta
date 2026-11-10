package ia;

import android.util.Log;
import h9.f1;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import p1.g;
import w7.s;
public final class c {
    public Object f15420a;
    public Object f15421b;
    public Object f15422c;
    public Object d;
    public Object f15423e;
    public Object f15424f;
    public Object f15425g;
    public Object h;
    public Object f15426i;

    public static void d(String str, JSONObject jSONObject) {
        StringBuilder m10 = com.google.android.recaptcha.internal.a.m(str);
        m10.append(jSONObject.toString());
        String sb2 = m10.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", sb2, null);
        }
    }

    public b a(int i7) {
        b bVar = null;
        try {
            if (!g.b(2, i7)) {
                JSONObject V1 = ((f1) this.f15423e).V1();
                if (V1 != null) {
                    b y10 = ((gf.g) this.f15422c).y(V1);
                    d("Loaded cached settings: ", V1);
                    ((s) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!g.b(3, i7) && y10.f15417c < currentTimeMillis) {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                            return null;
                        }
                    } else {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return y10;
                        } catch (Exception e10) {
                            e = e10;
                            bVar = y10;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return bVar;
                        }
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e11) {
            e = e11;
        }
    }

    public b b() {
        return (b) ((AtomicReference) this.h).get();
    }

    public void c(o5.i r47, int r48) {
        throw new UnsupportedOperationException("Method not decompiled: ia.c.c(o5.i, int):void");
    }
}
