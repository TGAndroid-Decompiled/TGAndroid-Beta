package ea;

import a1.g;
import a4.l;
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
    public Object f8666a;
    public Object f8667b;
    public Object f8668c;
    public Object d;
    public Object e;
    public Object f8669f;
    public Object f8670g;
    public Object h;
    public Object f8671i;

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
        if (((Integer) this.f8666a) == null) {
            str = " pid";
        } else {
            str = "";
        }
        if (((String) this.f8667b) == null) {
            str = str.concat(" processName");
        }
        if (((Integer) this.f8668c) == null) {
            str = t8.b.u(str, " reasonCode");
        }
        if (((Integer) this.d) == null) {
            str = t8.b.u(str, " importance");
        }
        if (((Long) this.e) == null) {
            str = t8.b.u(str, " pss");
        }
        if (((Long) this.f8669f) == null) {
            str = t8.b.u(str, " rss");
        }
        if (((Long) this.f8670g) == null) {
            str = t8.b.u(str, " timestamp");
        }
        if (str.isEmpty()) {
            return new b0(((Integer) this.f8666a).intValue(), (String) this.f8667b, ((Integer) this.f8668c).intValue(), ((Integer) this.d).intValue(), ((Long) this.e).longValue(), ((Long) this.f8669f).longValue(), ((Long) this.f8670g).longValue(), (String) this.h, (List) this.f8671i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public k0 b() {
        String str;
        if (((Integer) this.f8666a) == null) {
            str = " arch";
        } else {
            str = "";
        }
        if (((String) this.f8667b) == null) {
            str = str.concat(" model");
        }
        if (((Integer) this.f8668c) == null) {
            str = t8.b.u(str, " cores");
        }
        if (((Long) this.d) == null) {
            str = t8.b.u(str, " ram");
        }
        if (((Long) this.e) == null) {
            str = t8.b.u(str, " diskSpace");
        }
        if (((Boolean) this.f8669f) == null) {
            str = t8.b.u(str, " simulator");
        }
        if (((Integer) this.f8670g) == null) {
            str = t8.b.u(str, " state");
        }
        if (((String) this.h) == null) {
            str = t8.b.u(str, " manufacturer");
        }
        if (((String) this.f8671i) == null) {
            str = t8.b.u(str, " modelClass");
        }
        if (str.isEmpty()) {
            return new k0(((Integer) this.f8666a).intValue(), (String) this.f8667b, ((Integer) this.f8668c).intValue(), ((Long) this.d).longValue(), ((Long) this.e).longValue(), ((Boolean) this.f8669f).booleanValue(), ((Integer) this.f8670g).intValue(), (String) this.h, (String) this.f8671i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public a c(int i10) {
        a aVar = null;
        try {
            if (!j.b(2, i10)) {
                JSONObject V = ((m) this.e).V();
                if (V != null) {
                    a O = ((l) this.f8668c).O(V);
                    f("Loaded cached settings: ", V);
                    ((u) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!j.b(3, i10) && O.f8664c < currentTimeMillis) {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                            return null;
                        }
                    } else {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return O;
                        } catch (Exception e) {
                            e = e;
                            aVar = O;
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

    public void e(l5.i r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: ea.b.e(l5.i, int):void");
    }
}
