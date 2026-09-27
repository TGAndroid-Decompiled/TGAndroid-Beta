package da;

import a4.m;
import a6.i;
import android.util.Log;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import m1.j;
import org.json.JSONObject;
import v7.k0;
import y9.b0;
public final class b {
    public Object f7565a;
    public Object f7566b;
    public Object f7567c;
    public Object d;
    public Object e;
    public Object f7568f;
    public Object f7569g;
    public Object h;
    public Object f7570i;

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
        if (((Integer) this.f7565a) == null) {
            str = " pid";
        } else {
            str = "";
        }
        if (((String) this.f7566b) == null) {
            str = str.concat(" processName");
        }
        if (((Integer) this.f7567c) == null) {
            str = k0.s(str, " reasonCode");
        }
        if (((Integer) this.d) == null) {
            str = k0.s(str, " importance");
        }
        if (((Long) this.e) == null) {
            str = k0.s(str, " pss");
        }
        if (((Long) this.f7568f) == null) {
            str = k0.s(str, " rss");
        }
        if (((Long) this.f7569g) == null) {
            str = k0.s(str, " timestamp");
        }
        if (str.isEmpty()) {
            return new b0(((Integer) this.f7565a).intValue(), (String) this.f7566b, ((Integer) this.f7567c).intValue(), ((Integer) this.d).intValue(), ((Long) this.e).longValue(), ((Long) this.f7568f).longValue(), ((Long) this.f7569g).longValue(), (String) this.h, (List) this.f7570i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public y9.k0 b() {
        String str;
        if (((Integer) this.f7565a) == null) {
            str = " arch";
        } else {
            str = "";
        }
        if (((String) this.f7566b) == null) {
            str = str.concat(" model");
        }
        if (((Integer) this.f7567c) == null) {
            str = k0.s(str, " cores");
        }
        if (((Long) this.d) == null) {
            str = k0.s(str, " ram");
        }
        if (((Long) this.e) == null) {
            str = k0.s(str, " diskSpace");
        }
        if (((Boolean) this.f7568f) == null) {
            str = k0.s(str, " simulator");
        }
        if (((Integer) this.f7569g) == null) {
            str = k0.s(str, " state");
        }
        if (((String) this.h) == null) {
            str = k0.s(str, " manufacturer");
        }
        if (((String) this.f7570i) == null) {
            str = k0.s(str, " modelClass");
        }
        if (str.isEmpty()) {
            return new y9.k0(((Integer) this.f7565a).intValue(), (String) this.f7566b, ((Integer) this.f7567c).intValue(), ((Long) this.d).longValue(), ((Long) this.e).longValue(), ((Boolean) this.f7568f).booleanValue(), ((Integer) this.f7569g).intValue(), (String) this.h, (String) this.f7570i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public a c(int i10) {
        a aVar = null;
        try {
            if (!j.b(2, i10)) {
                JSONObject y02 = ((m) this.e).y0();
                if (y02 != null) {
                    a R = ((i) this.f7567c).R(y02);
                    f("Loaded cached settings: ", y02);
                    ((na.d) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!j.b(3, i10) && R.f7563c < currentTimeMillis) {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                            return null;
                        }
                    } else {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return R;
                        } catch (Exception e) {
                            e = e;
                            aVar = R;
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
        throw new UnsupportedOperationException("Method not decompiled: da.b.e(l5.i, int):void");
    }
}
