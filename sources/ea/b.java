package ea;

import a1.g;
import a6.m;
import android.util.Log;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import m1.j;
import org.json.JSONObject;
import t7.u;
import z9.b0;
import z9.k0;
public final class b {
    public Object f8547a;
    public Object f8548b;
    public Object f8549c;
    public Object d;
    public Object e;
    public Object f8550f;
    public Object f8551g;
    public Object h;
    public Object f8552i;

    public static void f(String str, JSONObject jSONObject) {
        StringBuilder u10 = g.u(str);
        u10.append(jSONObject.toString());
        String sb2 = u10.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", sb2, null);
        }
    }

    public b0 a() {
        String str;
        if (((Integer) this.f8547a) == null) {
            str = " pid";
        } else {
            str = "";
        }
        if (((String) this.f8548b) == null) {
            str = str.concat(" processName");
        }
        if (((Integer) this.f8549c) == null) {
            str = r.c.u(str, " reasonCode");
        }
        if (((Integer) this.d) == null) {
            str = r.c.u(str, " importance");
        }
        if (((Long) this.e) == null) {
            str = r.c.u(str, " pss");
        }
        if (((Long) this.f8550f) == null) {
            str = r.c.u(str, " rss");
        }
        if (((Long) this.f8551g) == null) {
            str = r.c.u(str, " timestamp");
        }
        if (str.isEmpty()) {
            return new b0(((Integer) this.f8547a).intValue(), (String) this.f8548b, ((Integer) this.f8549c).intValue(), ((Integer) this.d).intValue(), ((Long) this.e).longValue(), ((Long) this.f8550f).longValue(), ((Long) this.f8551g).longValue(), (String) this.h, (List) this.f8552i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public k0 b() {
        String str;
        if (((Integer) this.f8547a) == null) {
            str = " arch";
        } else {
            str = "";
        }
        if (((String) this.f8548b) == null) {
            str = str.concat(" model");
        }
        if (((Integer) this.f8549c) == null) {
            str = r.c.u(str, " cores");
        }
        if (((Long) this.d) == null) {
            str = r.c.u(str, " ram");
        }
        if (((Long) this.e) == null) {
            str = r.c.u(str, " diskSpace");
        }
        if (((Boolean) this.f8550f) == null) {
            str = r.c.u(str, " simulator");
        }
        if (((Integer) this.f8551g) == null) {
            str = r.c.u(str, " state");
        }
        if (((String) this.h) == null) {
            str = r.c.u(str, " manufacturer");
        }
        if (((String) this.f8552i) == null) {
            str = r.c.u(str, " modelClass");
        }
        if (str.isEmpty()) {
            return new k0(((Integer) this.f8547a).intValue(), (String) this.f8548b, ((Integer) this.f8549c).intValue(), ((Long) this.d).longValue(), ((Long) this.e).longValue(), ((Boolean) this.f8550f).booleanValue(), ((Integer) this.f8551g).intValue(), (String) this.h, (String) this.f8552i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public a c(int i10) {
        a aVar = null;
        try {
            if (!j.b(2, i10)) {
                JSONObject w9 = ((m) this.e).w();
                if (w9 != null) {
                    a M = ((ag.b) this.f8549c).M(w9);
                    f("Loaded cached settings: ", w9);
                    ((u) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!j.b(3, i10) && M.f8545c < currentTimeMillis) {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                            return null;
                        }
                    } else {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return M;
                        } catch (Exception e) {
                            e = e;
                            aVar = M;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return aVar;
                        }
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e7) {
            e = e7;
        }
    }

    public a d() {
        return (a) ((AtomicReference) this.h).get();
    }

    public void e(l5.i r48, int r49) {
        throw new UnsupportedOperationException("Method not decompiled: ea.b.e(l5.i, int):void");
    }
}
