package ia;

import android.util.Log;
import com.google.android.gms.internal.vision.e2;
import hi.l0;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import p1.g;
import w7.s;
public final class c {
    public Object f15873a;
    public Object f15874b;
    public Object f15875c;
    public Object d;
    public Object f15876e;
    public Object f15877f;
    public Object f15878g;
    public Object h;
    public Object f15879i;

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
                JSONObject U = ((l0) this.f15876e).U();
                if (U != null) {
                    b S = ((d) this.f15875c).S(U);
                    d("Loaded cached settings: ", U);
                    ((s) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!g.b(3, i7) && S.f15870c < currentTimeMillis) {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                            return null;
                        }
                    } else {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return S;
                        } catch (Exception e10) {
                            e = e10;
                            bVar = S;
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
