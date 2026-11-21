package ia;

import android.util.Log;
import com.google.android.gms.internal.vision.e2;
import h9.g1;
import hi.t5;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import p1.g;
import w7.s;
public final class c {
    public Object f16213a;
    public Object f16214b;
    public Object f16215c;
    public Object d;
    public Object f16216e;
    public Object f16217f;
    public Object f16218g;
    public Object h;
    public Object f16219i;

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
                JSONObject K = ((g1) this.f16216e).K();
                if (K != null) {
                    b s5 = ((t5) this.f16215c).s(K);
                    d("Loaded cached settings: ", K);
                    ((s) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!g.b(3, i7) && s5.f16210c < currentTimeMillis) {
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
