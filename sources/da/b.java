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
    public Object f8179a;
    public Object f8180b;
    public Object f8181c;
    public Object d;
    public Object f8182e;
    public Object f8183f;
    public Object f8184g;
    public Object h;
    public Object f8185i;

    public static void f(String str, JSONObject jSONObject) {
        StringBuilder u10 = a4.a.u(str);
        u10.append(jSONObject.toString());
        String sb2 = u10.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", sb2, null);
        }
    }

    public b0 a() {
        String str;
        if (((Integer) this.f8179a) == null) {
            str = " pid";
        } else {
            str = "";
        }
        if (((String) this.f8180b) == null) {
            str = str.concat(" processName");
        }
        if (((Integer) this.f8181c) == null) {
            str = t8.b.v(str, " reasonCode");
        }
        if (((Integer) this.d) == null) {
            str = t8.b.v(str, " importance");
        }
        if (((Long) this.f8182e) == null) {
            str = t8.b.v(str, " pss");
        }
        if (((Long) this.f8183f) == null) {
            str = t8.b.v(str, " rss");
        }
        if (((Long) this.f8184g) == null) {
            str = t8.b.v(str, " timestamp");
        }
        if (str.isEmpty()) {
            return new b0(((Integer) this.f8179a).intValue(), (String) this.f8180b, ((Integer) this.f8181c).intValue(), ((Integer) this.d).intValue(), ((Long) this.f8182e).longValue(), ((Long) this.f8183f).longValue(), ((Long) this.f8184g).longValue(), (String) this.h, (List) this.f8185i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public k0 b() {
        String str;
        if (((Integer) this.f8179a) == null) {
            str = " arch";
        } else {
            str = "";
        }
        if (((String) this.f8180b) == null) {
            str = str.concat(" model");
        }
        if (((Integer) this.f8181c) == null) {
            str = t8.b.v(str, " cores");
        }
        if (((Long) this.d) == null) {
            str = t8.b.v(str, " ram");
        }
        if (((Long) this.f8182e) == null) {
            str = t8.b.v(str, " diskSpace");
        }
        if (((Boolean) this.f8183f) == null) {
            str = t8.b.v(str, " simulator");
        }
        if (((Integer) this.f8184g) == null) {
            str = t8.b.v(str, " state");
        }
        if (((String) this.h) == null) {
            str = t8.b.v(str, " manufacturer");
        }
        if (((String) this.f8185i) == null) {
            str = t8.b.v(str, " modelClass");
        }
        if (str.isEmpty()) {
            return new k0(((Integer) this.f8179a).intValue(), (String) this.f8180b, ((Integer) this.f8181c).intValue(), ((Long) this.d).longValue(), ((Long) this.f8182e).longValue(), ((Boolean) this.f8183f).booleanValue(), ((Integer) this.f8184g).intValue(), (String) this.h, (String) this.f8185i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public a c(int i10) {
        a aVar = null;
        try {
            if (!j.b(2, i10)) {
                JSONObject A0 = ((m) this.f8182e).A0();
                if (A0 != null) {
                    a P = ((i) this.f8181c).P(A0);
                    f("Loaded cached settings: ", A0);
                    ((na.d) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!j.b(3, i10) && P.f8176c < currentTimeMillis) {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                            return null;
                        }
                    } else {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return P;
                        } catch (Exception e7) {
                            e = e7;
                            aVar = P;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return aVar;
                        }
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e10) {
            e = e10;
        }
    }

    public a d() {
        return (a) ((AtomicReference) this.h).get();
    }

    public void e(l5.i r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: da.b.e(l5.i, int):void");
    }
}
