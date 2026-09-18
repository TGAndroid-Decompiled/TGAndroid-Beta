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
    public Object f7580a;
    public Object f7581b;
    public Object f7582c;
    public Object d;
    public Object e;
    public Object f7583f;
    public Object f7584g;
    public Object h;
    public Object f7585i;

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
        if (((Integer) this.f7580a) == null) {
            str = " pid";
        } else {
            str = "";
        }
        if (((String) this.f7581b) == null) {
            str = str.concat(" processName");
        }
        if (((Integer) this.f7582c) == null) {
            str = t8.b.v(str, " reasonCode");
        }
        if (((Integer) this.d) == null) {
            str = t8.b.v(str, " importance");
        }
        if (((Long) this.e) == null) {
            str = t8.b.v(str, " pss");
        }
        if (((Long) this.f7583f) == null) {
            str = t8.b.v(str, " rss");
        }
        if (((Long) this.f7584g) == null) {
            str = t8.b.v(str, " timestamp");
        }
        if (str.isEmpty()) {
            return new b0(((Integer) this.f7580a).intValue(), (String) this.f7581b, ((Integer) this.f7582c).intValue(), ((Integer) this.d).intValue(), ((Long) this.e).longValue(), ((Long) this.f7583f).longValue(), ((Long) this.f7584g).longValue(), (String) this.h, (List) this.f7585i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public k0 b() {
        String str;
        if (((Integer) this.f7580a) == null) {
            str = " arch";
        } else {
            str = "";
        }
        if (((String) this.f7581b) == null) {
            str = str.concat(" model");
        }
        if (((Integer) this.f7582c) == null) {
            str = t8.b.v(str, " cores");
        }
        if (((Long) this.d) == null) {
            str = t8.b.v(str, " ram");
        }
        if (((Long) this.e) == null) {
            str = t8.b.v(str, " diskSpace");
        }
        if (((Boolean) this.f7583f) == null) {
            str = t8.b.v(str, " simulator");
        }
        if (((Integer) this.f7584g) == null) {
            str = t8.b.v(str, " state");
        }
        if (((String) this.h) == null) {
            str = t8.b.v(str, " manufacturer");
        }
        if (((String) this.f7585i) == null) {
            str = t8.b.v(str, " modelClass");
        }
        if (str.isEmpty()) {
            return new k0(((Integer) this.f7580a).intValue(), (String) this.f7581b, ((Integer) this.f7582c).intValue(), ((Long) this.d).longValue(), ((Long) this.e).longValue(), ((Boolean) this.f7583f).booleanValue(), ((Integer) this.f7584g).intValue(), (String) this.h, (String) this.f7585i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public a c(int i10) {
        a aVar = null;
        try {
            if (!j.b(2, i10)) {
                JSONObject z02 = ((m) this.e).z0();
                if (z02 != null) {
                    a R = ((i) this.f7582c).R(z02);
                    f("Loaded cached settings: ", z02);
                    ((na.d) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!j.b(3, i10) && R.f7578c < currentTimeMillis) {
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
