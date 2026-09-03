package e3;

import android.util.Log;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import k9.b0;
import k9.k0;
import m1.j;
import org.json.JSONObject;
import org.telegram.ui.Components.zz;
import vh.w2;
public final class g {
    public Object f5101a;
    public Object f5102b;
    public Object f5103c;
    public Object d;
    public Object e;
    public Object f5104f;
    public Object f5105g;
    public Object h;
    public Object f5106i;

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
        if (((Integer) this.f5101a) == null) {
            str = " pid";
        } else {
            str = "";
        }
        if (((String) this.f5102b) == null) {
            str = str.concat(" processName");
        }
        if (((Integer) this.f5103c) == null) {
            str = w2.k(str, " reasonCode");
        }
        if (((Integer) this.d) == null) {
            str = w2.k(str, " importance");
        }
        if (((Long) this.e) == null) {
            str = w2.k(str, " pss");
        }
        if (((Long) this.f5104f) == null) {
            str = w2.k(str, " rss");
        }
        if (((Long) this.f5105g) == null) {
            str = w2.k(str, " timestamp");
        }
        if (str.isEmpty()) {
            return new b0(((Integer) this.f5101a).intValue(), (String) this.f5102b, ((Integer) this.f5103c).intValue(), ((Integer) this.d).intValue(), ((Long) this.e).longValue(), ((Long) this.f5104f).longValue(), ((Long) this.f5105g).longValue(), (String) this.h, (List) this.f5106i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public k0 b() {
        String str;
        if (((Integer) this.f5101a) == null) {
            str = " arch";
        } else {
            str = "";
        }
        if (((String) this.f5102b) == null) {
            str = str.concat(" model");
        }
        if (((Integer) this.f5103c) == null) {
            str = w2.k(str, " cores");
        }
        if (((Long) this.d) == null) {
            str = w2.k(str, " ram");
        }
        if (((Long) this.e) == null) {
            str = w2.k(str, " diskSpace");
        }
        if (((Boolean) this.f5104f) == null) {
            str = w2.k(str, " simulator");
        }
        if (((Integer) this.f5105g) == null) {
            str = w2.k(str, " state");
        }
        if (((String) this.h) == null) {
            str = w2.k(str, " manufacturer");
        }
        if (((String) this.f5106i) == null) {
            str = w2.k(str, " modelClass");
        }
        if (str.isEmpty()) {
            return new k0(((Integer) this.f5101a).intValue(), (String) this.f5102b, ((Integer) this.f5103c).intValue(), ((Long) this.d).longValue(), ((Long) this.e).longValue(), ((Boolean) this.f5104f).booleanValue(), ((Integer) this.f5105g).intValue(), (String) this.h, (String) this.f5106i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public p9.b c(int i10) {
        p9.b bVar = null;
        try {
            if (!j.b(2, i10)) {
                JSONObject H = ((zz) this.e).H();
                if (H != null) {
                    p9.b s6 = ((o3.c) this.f5103c).s(H);
                    f("Loaded cached settings: ", H);
                    ((cb.b) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!j.b(3, i10) && s6.f41086c < currentTimeMillis) {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                            return null;
                        }
                    } else {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return s6;
                        } catch (Exception e) {
                            e = e;
                            bVar = s6;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return bVar;
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

    public p9.b d() {
        return (p9.b) ((AtomicReference) this.h).get();
    }

    public void e(y2.i r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: e3.g.e(y2.i, int):void");
    }
}
