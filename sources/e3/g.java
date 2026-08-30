package e3;

import android.util.Log;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import k9.b0;
import k9.k0;
import m1.j;
import org.json.JSONObject;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.qk0;
import vh.v2;
public final class g {
    public Object f5095a;
    public Object f5096b;
    public Object f5097c;
    public Object d;
    public Object e;
    public Object f5098f;
    public Object f5099g;
    public Object h;
    public Object f5100i;

    public static void f(String str, JSONObject jSONObject) {
        StringBuilder l10 = e2.c.l(str);
        l10.append(jSONObject.toString());
        String sb = l10.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", sb, null);
        }
    }

    public b0 a() {
        String str;
        if (((Integer) this.f5095a) == null) {
            str = " pid";
        } else {
            str = "";
        }
        if (((String) this.f5096b) == null) {
            str = str.concat(" processName");
        }
        if (((Integer) this.f5097c) == null) {
            str = v2.k(str, " reasonCode");
        }
        if (((Integer) this.d) == null) {
            str = v2.k(str, " importance");
        }
        if (((Long) this.e) == null) {
            str = v2.k(str, " pss");
        }
        if (((Long) this.f5098f) == null) {
            str = v2.k(str, " rss");
        }
        if (((Long) this.f5099g) == null) {
            str = v2.k(str, " timestamp");
        }
        if (str.isEmpty()) {
            return new b0(((Integer) this.f5095a).intValue(), (String) this.f5096b, ((Integer) this.f5097c).intValue(), ((Integer) this.d).intValue(), ((Long) this.e).longValue(), ((Long) this.f5098f).longValue(), ((Long) this.f5099g).longValue(), (String) this.h, (List) this.f5100i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public k0 b() {
        String str;
        if (((Integer) this.f5095a) == null) {
            str = " arch";
        } else {
            str = "";
        }
        if (((String) this.f5096b) == null) {
            str = str.concat(" model");
        }
        if (((Integer) this.f5097c) == null) {
            str = v2.k(str, " cores");
        }
        if (((Long) this.d) == null) {
            str = v2.k(str, " ram");
        }
        if (((Long) this.e) == null) {
            str = v2.k(str, " diskSpace");
        }
        if (((Boolean) this.f5098f) == null) {
            str = v2.k(str, " simulator");
        }
        if (((Integer) this.f5099g) == null) {
            str = v2.k(str, " state");
        }
        if (((String) this.h) == null) {
            str = v2.k(str, " manufacturer");
        }
        if (((String) this.f5100i) == null) {
            str = v2.k(str, " modelClass");
        }
        if (str.isEmpty()) {
            return new k0(((Integer) this.f5095a).intValue(), (String) this.f5096b, ((Integer) this.f5097c).intValue(), ((Long) this.d).longValue(), ((Long) this.e).longValue(), ((Boolean) this.f5098f).booleanValue(), ((Integer) this.f5099g).intValue(), (String) this.h, (String) this.f5100i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public p9.a c(int i10) {
        p9.a aVar = null;
        try {
            if (!j.a(2, i10)) {
                JSONObject U = ((f1) this.e).U();
                if (U != null) {
                    p9.a f10 = ((qk0) this.f5097c).f(U);
                    f("Loaded cached settings: ", U);
                    ((db.a) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!j.a(3, i10) && f10.f41063c < currentTimeMillis) {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                            return null;
                        }
                    } else {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return f10;
                        } catch (Exception e) {
                            e = e;
                            aVar = f10;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return aVar;
                        }
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e6) {
            e = e6;
        }
    }

    public p9.a d() {
        return (p9.a) ((AtomicReference) this.h).get();
    }

    public void e(y2.i r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: e3.g.e(y2.i, int):void");
    }
}
