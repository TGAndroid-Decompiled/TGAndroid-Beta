package e3;

import ag.o1;
import android.util.Log;
import i9.b0;
import i9.k0;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import m1.j;
import org.json.JSONObject;
public final class f {
    public Object f5812a;
    public Object f5813b;
    public Object f5814c;
    public Object d;
    public Object f5815e;
    public Object f5816f;
    public Object f5817g;
    public Object h;
    public Object f5818i;

    public static void f(String str, JSONObject jSONObject) {
        StringBuilder n10 = com.google.android.recaptcha.internal.a.n(str);
        n10.append(jSONObject.toString());
        String sb2 = n10.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", sb2, null);
        }
    }

    public b0 a() {
        String str;
        if (((Integer) this.f5812a) == null) {
            str = " pid";
        } else {
            str = "";
        }
        if (((String) this.f5813b) == null) {
            str = str.concat(" processName");
        }
        if (((Integer) this.f5814c) == null) {
            str = u3.c.k(str, " reasonCode");
        }
        if (((Integer) this.d) == null) {
            str = u3.c.k(str, " importance");
        }
        if (((Long) this.f5815e) == null) {
            str = u3.c.k(str, " pss");
        }
        if (((Long) this.f5816f) == null) {
            str = u3.c.k(str, " rss");
        }
        if (((Long) this.f5817g) == null) {
            str = u3.c.k(str, " timestamp");
        }
        if (str.isEmpty()) {
            return new b0(((Integer) this.f5812a).intValue(), (String) this.f5813b, ((Integer) this.f5814c).intValue(), ((Integer) this.d).intValue(), ((Long) this.f5815e).longValue(), ((Long) this.f5816f).longValue(), ((Long) this.f5817g).longValue(), (String) this.h, (List) this.f5818i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public k0 b() {
        String str;
        if (((Integer) this.f5812a) == null) {
            str = " arch";
        } else {
            str = "";
        }
        if (((String) this.f5813b) == null) {
            str = str.concat(" model");
        }
        if (((Integer) this.f5814c) == null) {
            str = u3.c.k(str, " cores");
        }
        if (((Long) this.d) == null) {
            str = u3.c.k(str, " ram");
        }
        if (((Long) this.f5815e) == null) {
            str = u3.c.k(str, " diskSpace");
        }
        if (((Boolean) this.f5816f) == null) {
            str = u3.c.k(str, " simulator");
        }
        if (((Integer) this.f5817g) == null) {
            str = u3.c.k(str, " state");
        }
        if (((String) this.h) == null) {
            str = u3.c.k(str, " manufacturer");
        }
        if (((String) this.f5818i) == null) {
            str = u3.c.k(str, " modelClass");
        }
        if (str.isEmpty()) {
            return new k0(((Integer) this.f5812a).intValue(), (String) this.f5813b, ((Integer) this.f5814c).intValue(), ((Long) this.d).longValue(), ((Long) this.f5815e).longValue(), ((Boolean) this.f5816f).booleanValue(), ((Integer) this.f5817g).intValue(), (String) this.h, (String) this.f5818i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public n9.a c(int i10) {
        n9.a aVar = null;
        try {
            if (!j.a(2, i10)) {
                JSONObject G = ((za.c) this.f5815e).G();
                if (G != null) {
                    n9.a j10 = ((o1) this.f5814c).j(G);
                    f("Loaded cached settings: ", G);
                    ((ya.a) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!j.a(3, i10) && j10.f17166c < currentTimeMillis) {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                            return null;
                        }
                    } else {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return j10;
                        } catch (Exception e10) {
                            e = e10;
                            aVar = j10;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return aVar;
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

    public n9.a d() {
        return (n9.a) ((AtomicReference) this.h).get();
    }

    public void e(y2.i r45, int r46) {
        throw new UnsupportedOperationException("Method not decompiled: e3.f.e(y2.i, int):void");
    }
}
