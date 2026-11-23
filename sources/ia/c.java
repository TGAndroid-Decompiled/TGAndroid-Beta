package ia;

import android.util.Log;
import com.google.android.gms.internal.vision.e2;
import hi.u0;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import p1.g;
import w7.s;
public final class c {
    public Object f16279a;
    public Object f16280b;
    public Object f16281c;
    public Object d;
    public Object f16282e;
    public Object f16283f;
    public Object f16284g;
    public Object h;
    public Object f16285i;

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
                JSONObject a10 = ((ze.b) this.f16282e).a();
                if (a10 != null) {
                    b D0 = ((u0) this.f16281c).D0(a10);
                    d("Loaded cached settings: ", a10);
                    ((s) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!g.b(3, i7) && D0.f16276c < currentTimeMillis) {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                            return null;
                        }
                    } else {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return D0;
                        } catch (Exception e10) {
                            e = e10;
                            bVar = D0;
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
