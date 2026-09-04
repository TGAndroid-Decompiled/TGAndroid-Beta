package da;

import a6.i;
import android.util.Log;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import m1.j;
import org.json.JSONObject;
import org.telegram.ui.Cells.p6;
import y9.b0;
import y9.k0;
public final class b {
    public Object f6651a;
    public Object f6652b;
    public Object f6653c;
    public Object d;
    public Object f6654e;
    public Object f6655f;
    public Object f6656g;
    public Object h;
    public Object f6657i;

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
        if (((Integer) this.f6651a) == null) {
            str = " pid";
        } else {
            str = "";
        }
        if (((String) this.f6652b) == null) {
            str = str.concat(" processName");
        }
        if (((Integer) this.f6653c) == null) {
            str = p6.t(str, " reasonCode");
        }
        if (((Integer) this.d) == null) {
            str = p6.t(str, " importance");
        }
        if (((Long) this.f6654e) == null) {
            str = p6.t(str, " pss");
        }
        if (((Long) this.f6655f) == null) {
            str = p6.t(str, " rss");
        }
        if (((Long) this.f6656g) == null) {
            str = p6.t(str, " timestamp");
        }
        if (str.isEmpty()) {
            return new b0(((Integer) this.f6651a).intValue(), (String) this.f6652b, ((Integer) this.f6653c).intValue(), ((Integer) this.d).intValue(), ((Long) this.f6654e).longValue(), ((Long) this.f6655f).longValue(), ((Long) this.f6656g).longValue(), (String) this.h, (List) this.f6657i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public k0 b() {
        String str;
        if (((Integer) this.f6651a) == null) {
            str = " arch";
        } else {
            str = "";
        }
        if (((String) this.f6652b) == null) {
            str = str.concat(" model");
        }
        if (((Integer) this.f6653c) == null) {
            str = p6.t(str, " cores");
        }
        if (((Long) this.d) == null) {
            str = p6.t(str, " ram");
        }
        if (((Long) this.f6654e) == null) {
            str = p6.t(str, " diskSpace");
        }
        if (((Boolean) this.f6655f) == null) {
            str = p6.t(str, " simulator");
        }
        if (((Integer) this.f6656g) == null) {
            str = p6.t(str, " state");
        }
        if (((String) this.h) == null) {
            str = p6.t(str, " manufacturer");
        }
        if (((String) this.f6657i) == null) {
            str = p6.t(str, " modelClass");
        }
        if (str.isEmpty()) {
            return new k0(((Integer) this.f6651a).intValue(), (String) this.f6652b, ((Integer) this.f6653c).intValue(), ((Long) this.d).longValue(), ((Long) this.f6654e).longValue(), ((Boolean) this.f6655f).booleanValue(), ((Integer) this.f6656g).intValue(), (String) this.h, (String) this.f6657i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public a c(int i10) {
        a aVar = null;
        try {
            if (!j.b(2, i10)) {
                JSONObject B = ((i) this.f6654e).B();
                if (B != null) {
                    a O = ((xa.c) this.f6653c).O(B);
                    f("Loaded cached settings: ", B);
                    ((ob.a) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!j.b(3, i10) && O.f6648c < currentTimeMillis) {
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
                        } catch (Exception e7) {
                            e = e7;
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
