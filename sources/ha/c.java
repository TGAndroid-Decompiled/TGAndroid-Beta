package ha;

import android.util.Log;
import gi.v5;
import java.util.concurrent.atomic.AtomicReference;
import o1.g;
import org.json.JSONObject;
public final class c {
    public Object f14372a;
    public Object f14373b;
    public Object f14374c;
    public Object d;
    public Object f14375e;
    public Object f14376f;
    public Object f14377g;
    public Object h;
    public Object f14378i;

    public static void d(String str, JSONObject jSONObject) {
        StringBuilder l10 = com.google.android.recaptcha.internal.a.l(str);
        l10.append(jSONObject.toString());
        String sb2 = l10.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", sb2, null);
        }
    }

    public b a(int i3) {
        b bVar = null;
        try {
            if (!g.b(2, i3)) {
                JSONObject n02 = ((android.support.v4.media.c) this.f14375e).n0();
                if (n02 != null) {
                    b k02 = ((v5) this.f14374c).k0(n02);
                    d("Loaded cached settings: ", n02);
                    ((nb.a) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!g.b(3, i3) && k02.f14369c < currentTimeMillis) {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                            return null;
                        }
                    } else {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return k02;
                        } catch (Exception e10) {
                            e = e10;
                            bVar = k02;
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

    public void c(n5.i r47, int r48) {
        throw new UnsupportedOperationException("Method not decompiled: ha.c.c(n5.i, int):void");
    }
}
