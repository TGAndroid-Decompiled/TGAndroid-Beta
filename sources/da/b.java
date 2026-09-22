package da;

import a4.m;
import a6.i;
import android.util.Log;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import m1.j;
import org.json.JSONObject;
import y9.b0;
import y9.k0;
public final class b {
    public Object f7578a;
    public Object f7579b;
    public Object f7580c;
    public Object d;
    public Object e;
    public Object f7581f;
    public Object f7582g;
    public Object h;
    public Object f7583i;

    public static void f(String str, JSONObject jSONObject) {
        StringBuilder v = a4.a.v(str);
        v.append(jSONObject.toString());
        String sb2 = v.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", sb2, null);
        }
    }

    public b0 a() {
        String str;
        if (((Integer) this.f7578a) == null) {
            str = " pid";
        } else {
            str = "";
        }
        if (((String) this.f7579b) == null) {
            str = str.concat(" processName");
        }
        if (((Integer) this.f7580c) == null) {
            str = w.c.g(str, " reasonCode");
        }
        if (((Integer) this.d) == null) {
            str = w.c.g(str, " importance");
        }
        if (((Long) this.e) == null) {
            str = w.c.g(str, " pss");
        }
        if (((Long) this.f7581f) == null) {
            str = w.c.g(str, " rss");
        }
        if (((Long) this.f7582g) == null) {
            str = w.c.g(str, " timestamp");
        }
        if (str.isEmpty()) {
            return new b0(((Integer) this.f7578a).intValue(), (String) this.f7579b, ((Integer) this.f7580c).intValue(), ((Integer) this.d).intValue(), ((Long) this.e).longValue(), ((Long) this.f7581f).longValue(), ((Long) this.f7582g).longValue(), (String) this.h, (List) this.f7583i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public k0 b() {
        String str;
        if (((Integer) this.f7578a) == null) {
            str = " arch";
        } else {
            str = "";
        }
        if (((String) this.f7579b) == null) {
            str = str.concat(" model");
        }
        if (((Integer) this.f7580c) == null) {
            str = w.c.g(str, " cores");
        }
        if (((Long) this.d) == null) {
            str = w.c.g(str, " ram");
        }
        if (((Long) this.e) == null) {
            str = w.c.g(str, " diskSpace");
        }
        if (((Boolean) this.f7581f) == null) {
            str = w.c.g(str, " simulator");
        }
        if (((Integer) this.f7582g) == null) {
            str = w.c.g(str, " state");
        }
        if (((String) this.h) == null) {
            str = w.c.g(str, " manufacturer");
        }
        if (((String) this.f7583i) == null) {
            str = w.c.g(str, " modelClass");
        }
        if (str.isEmpty()) {
            return new k0(((Integer) this.f7578a).intValue(), (String) this.f7579b, ((Integer) this.f7580c).intValue(), ((Long) this.d).longValue(), ((Long) this.e).longValue(), ((Boolean) this.f7581f).booleanValue(), ((Integer) this.f7582g).intValue(), (String) this.h, (String) this.f7583i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public a c(int i10) {
        a aVar = null;
        try {
            if (!j.b(2, i10)) {
                JSONObject B0 = ((m) this.e).B0();
                if (B0 != null) {
                    a Q = ((i) this.f7580c).Q(B0);
                    f("Loaded cached settings: ", B0);
                    ((na.d) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!j.b(3, i10) && Q.f7576c < currentTimeMillis) {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                            return null;
                        }
                    } else {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return Q;
                        } catch (Exception e) {
                            e = e;
                            aVar = Q;
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

    public void e(l5.i r45, int r46) {
        throw new UnsupportedOperationException("Method not decompiled: da.b.e(l5.i, int):void");
    }
}
