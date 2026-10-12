package da;

import a1.g;
import a4.l;
import a6.m;
import android.util.Log;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import m1.j;
import org.json.JSONObject;
import sc.v;
import t7.t;
import y9.b0;
import y9.k0;
public final class c {
    public Object f8229a;
    public Object f8230b;
    public Object f8231c;
    public Object d;
    public Object f8232e;
    public Object f8233f;
    public Object f8234g;
    public Object h;
    public Object f8235i;

    public static void f(String str, JSONObject jSONObject) {
        StringBuilder v = g.v(str);
        v.append(jSONObject.toString());
        String sb2 = v.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", sb2, null);
        }
    }

    public b0 a() {
        String str;
        if (((Integer) this.f8229a) == null) {
            str = " pid";
        } else {
            str = "";
        }
        if (((String) this.f8230b) == null) {
            str = str.concat(" processName");
        }
        if (((Integer) this.f8231c) == null) {
            str = v.v(str, " reasonCode");
        }
        if (((Integer) this.d) == null) {
            str = v.v(str, " importance");
        }
        if (((Long) this.f8232e) == null) {
            str = v.v(str, " pss");
        }
        if (((Long) this.f8233f) == null) {
            str = v.v(str, " rss");
        }
        if (((Long) this.f8234g) == null) {
            str = v.v(str, " timestamp");
        }
        if (str.isEmpty()) {
            return new b0(((Integer) this.f8229a).intValue(), (String) this.f8230b, ((Integer) this.f8231c).intValue(), ((Integer) this.d).intValue(), ((Long) this.f8232e).longValue(), ((Long) this.f8233f).longValue(), ((Long) this.f8234g).longValue(), (String) this.h, (List) this.f8235i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public k0 b() {
        String str;
        if (((Integer) this.f8229a) == null) {
            str = " arch";
        } else {
            str = "";
        }
        if (((String) this.f8230b) == null) {
            str = str.concat(" model");
        }
        if (((Integer) this.f8231c) == null) {
            str = v.v(str, " cores");
        }
        if (((Long) this.d) == null) {
            str = v.v(str, " ram");
        }
        if (((Long) this.f8232e) == null) {
            str = v.v(str, " diskSpace");
        }
        if (((Boolean) this.f8233f) == null) {
            str = v.v(str, " simulator");
        }
        if (((Integer) this.f8234g) == null) {
            str = v.v(str, " state");
        }
        if (((String) this.h) == null) {
            str = v.v(str, " manufacturer");
        }
        if (((String) this.f8235i) == null) {
            str = v.v(str, " modelClass");
        }
        if (str.isEmpty()) {
            return new k0(((Integer) this.f8229a).intValue(), (String) this.f8230b, ((Integer) this.f8231c).intValue(), ((Long) this.d).longValue(), ((Long) this.f8232e).longValue(), ((Boolean) this.f8233f).booleanValue(), ((Integer) this.f8234g).intValue(), (String) this.h, (String) this.f8235i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public b c(int i10) {
        b bVar = null;
        try {
            if (!j.b(2, i10)) {
                JSONObject f02 = ((m) this.f8232e).f0();
                if (f02 != null) {
                    b l02 = ((l) this.f8231c).l0(f02);
                    f("Loaded cached settings: ", f02);
                    ((t) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!j.b(3, i10) && l02.f8226c < currentTimeMillis) {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                            return null;
                        }
                    } else {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return l02;
                        } catch (Exception e7) {
                            e = e7;
                            bVar = l02;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return bVar;
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

    public b d() {
        return (b) ((AtomicReference) this.h).get();
    }

    public void e(l5.i r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: da.c.e(l5.i, int):void");
    }
}
