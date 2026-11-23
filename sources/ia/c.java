package ia;

import android.util.Log;
import com.google.android.gms.internal.vision.e2;
import h9.g1;
import hi.u5;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import p1.g;
import w7.s;
public final class c {
    public Object f16182a;
    public Object f16183b;
    public Object f16184c;
    public Object d;
    public Object f16185e;
    public Object f16186f;
    public Object f16187g;
    public Object h;
    public Object f16188i;

    public static void d(String str, JSONObject jSONObject) {
        StringBuilder m10 = e2.m(str);
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
                JSONObject K = ((g1) this.f16185e).K();
                if (K != null) {
                    b s5 = ((u5) this.f16184c).s(K);
                    d("Loaded cached settings: ", K);
                    ((s) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!g.b(3, i7) && s5.f16179c < currentTimeMillis) {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                            return null;
                        }
                    } else {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return s5;
                        } catch (Exception e10) {
                            e = e10;
                            bVar = s5;
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

    public void c(o5.i r48, int r49) {
        throw new UnsupportedOperationException("Method not decompiled: ia.c.c(o5.i, int):void");
    }
}
