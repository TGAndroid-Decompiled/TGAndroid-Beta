package ea;

import a1.g;
import a4.l;
import android.util.Log;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import k6.h;
import m1.j;
import org.json.JSONObject;
import t7.u;
import z9.b0;
import z9.k0;
public final class d {
    public Object f6466a;
    public Object f6467b;
    public Object f6468c;
    public Object d;
    public Object e;
    public Object f6469f;
    public Object f6470g;
    public Object h;
    public Object f6471i;

    public static void f(String str, JSONObject jSONObject) {
        StringBuilder t10 = g.t(str);
        t10.append(jSONObject.toString());
        String sb2 = t10.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", sb2, null);
        }
    }

    public b0 a() {
        String str;
        if (((Integer) this.f6466a) == null) {
            str = " pid";
        } else {
            str = "";
        }
        if (((String) this.f6467b) == null) {
            str = str.concat(" processName");
        }
        if (((Integer) this.f6468c) == null) {
            str = sc.e.A(str, " reasonCode");
        }
        if (((Integer) this.d) == null) {
            str = sc.e.A(str, " importance");
        }
        if (((Long) this.e) == null) {
            str = sc.e.A(str, " pss");
        }
        if (((Long) this.f6469f) == null) {
            str = sc.e.A(str, " rss");
        }
        if (((Long) this.f6470g) == null) {
            str = sc.e.A(str, " timestamp");
        }
        if (str.isEmpty()) {
            return new b0(((Integer) this.f6466a).intValue(), (String) this.f6467b, ((Integer) this.f6468c).intValue(), ((Integer) this.d).intValue(), ((Long) this.e).longValue(), ((Long) this.f6469f).longValue(), ((Long) this.f6470g).longValue(), (String) this.h, (List) this.f6471i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public k0 b() {
        String str;
        if (((Integer) this.f6466a) == null) {
            str = " arch";
        } else {
            str = "";
        }
        if (((String) this.f6467b) == null) {
            str = str.concat(" model");
        }
        if (((Integer) this.f6468c) == null) {
            str = sc.e.A(str, " cores");
        }
        if (((Long) this.d) == null) {
            str = sc.e.A(str, " ram");
        }
        if (((Long) this.e) == null) {
            str = sc.e.A(str, " diskSpace");
        }
        if (((Boolean) this.f6469f) == null) {
            str = sc.e.A(str, " simulator");
        }
        if (((Integer) this.f6470g) == null) {
            str = sc.e.A(str, " state");
        }
        if (((String) this.h) == null) {
            str = sc.e.A(str, " manufacturer");
        }
        if (((String) this.f6471i) == null) {
            str = sc.e.A(str, " modelClass");
        }
        if (str.isEmpty()) {
            return new k0(((Integer) this.f6466a).intValue(), (String) this.f6467b, ((Integer) this.f6468c).intValue(), ((Long) this.d).longValue(), ((Long) this.e).longValue(), ((Boolean) this.f6469f).booleanValue(), ((Integer) this.f6470g).intValue(), (String) this.h, (String) this.f6471i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public c c(int i10) {
        c cVar = null;
        try {
            if (!j.b(2, i10)) {
                JSONObject A = ((h) this.e).A();
                if (A != null) {
                    c z10 = ((l) this.f6468c).z(A);
                    f("Loaded cached settings: ", A);
                    ((u) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!j.b(3, i10) && z10.f6464c < currentTimeMillis) {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                            return null;
                        }
                    } else {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return z10;
                        } catch (Exception e) {
                            e = e;
                            cVar = z10;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return cVar;
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

    public c d() {
        return (c) ((AtomicReference) this.h).get();
    }

    public void e(l5.i r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: ea.d.e(l5.i, int):void");
    }
}
