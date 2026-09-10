package da;

import android.util.Log;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import m1.j;
import org.json.JSONObject;
import org.telegram.ui.Cells.r6;
import y9.b0;
import y9.k0;
public final class b {
    public Object f6352a;
    public Object f6353b;
    public Object f6354c;
    public Object d;
    public Object e;
    public Object f6355f;
    public Object f6356g;
    public Object h;
    public Object f6357i;

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
        if (((Integer) this.f6352a) == null) {
            str = " pid";
        } else {
            str = "";
        }
        if (((String) this.f6353b) == null) {
            str = str.concat(" processName");
        }
        if (((Integer) this.f6354c) == null) {
            str = r6.t(str, " reasonCode");
        }
        if (((Integer) this.d) == null) {
            str = r6.t(str, " importance");
        }
        if (((Long) this.e) == null) {
            str = r6.t(str, " pss");
        }
        if (((Long) this.f6355f) == null) {
            str = r6.t(str, " rss");
        }
        if (((Long) this.f6356g) == null) {
            str = r6.t(str, " timestamp");
        }
        if (str.isEmpty()) {
            return new b0(((Integer) this.f6352a).intValue(), (String) this.f6353b, ((Integer) this.f6354c).intValue(), ((Integer) this.d).intValue(), ((Long) this.e).longValue(), ((Long) this.f6355f).longValue(), ((Long) this.f6356g).longValue(), (String) this.h, (List) this.f6357i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public k0 b() {
        String str;
        if (((Integer) this.f6352a) == null) {
            str = " arch";
        } else {
            str = "";
        }
        if (((String) this.f6353b) == null) {
            str = str.concat(" model");
        }
        if (((Integer) this.f6354c) == null) {
            str = r6.t(str, " cores");
        }
        if (((Long) this.d) == null) {
            str = r6.t(str, " ram");
        }
        if (((Long) this.e) == null) {
            str = r6.t(str, " diskSpace");
        }
        if (((Boolean) this.f6355f) == null) {
            str = r6.t(str, " simulator");
        }
        if (((Integer) this.f6356g) == null) {
            str = r6.t(str, " state");
        }
        if (((String) this.h) == null) {
            str = r6.t(str, " manufacturer");
        }
        if (((String) this.f6357i) == null) {
            str = r6.t(str, " modelClass");
        }
        if (str.isEmpty()) {
            return new k0(((Integer) this.f6352a).intValue(), (String) this.f6353b, ((Integer) this.f6354c).intValue(), ((Long) this.d).longValue(), ((Long) this.e).longValue(), ((Boolean) this.f6355f).booleanValue(), ((Integer) this.f6356g).intValue(), (String) this.h, (String) this.f6357i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public a c(int i10) {
        a aVar = null;
        try {
            if (!j.b(2, i10)) {
                JSONObject B0 = ((xa.c) this.e).B0();
                if (B0 != null) {
                    a x10 = ((pb.c) this.f6354c).x(B0);
                    f("Loaded cached settings: ", B0);
                    ((na.d) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!j.b(3, i10) && x10.f6350c < currentTimeMillis) {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                            return null;
                        }
                    } else {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return x10;
                        } catch (Exception e) {
                            e = e;
                            aVar = x10;
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
