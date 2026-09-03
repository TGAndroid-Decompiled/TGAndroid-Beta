package e3;

import android.util.Log;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import k9.b0;
import k9.k0;
import m1.j;
import org.json.JSONObject;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.web.e0;
public final class g {
    public Object f4931a;
    public Object f4932b;
    public Object f4933c;
    public Object d;
    public Object f4934e;
    public Object f4935f;
    public Object f4936g;
    public Object h;
    public Object f4937i;

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
        if (((Integer) this.f4931a) == null) {
            str = " pid";
        } else {
            str = "";
        }
        if (((String) this.f4932b) == null) {
            str = str.concat(" processName");
        }
        if (((Integer) this.f4933c) == null) {
            str = w.c.e(str, " reasonCode");
        }
        if (((Integer) this.d) == null) {
            str = w.c.e(str, " importance");
        }
        if (((Long) this.f4934e) == null) {
            str = w.c.e(str, " pss");
        }
        if (((Long) this.f4935f) == null) {
            str = w.c.e(str, " rss");
        }
        if (((Long) this.f4936g) == null) {
            str = w.c.e(str, " timestamp");
        }
        if (str.isEmpty()) {
            return new b0(((Integer) this.f4931a).intValue(), (String) this.f4932b, ((Integer) this.f4933c).intValue(), ((Integer) this.d).intValue(), ((Long) this.f4934e).longValue(), ((Long) this.f4935f).longValue(), ((Long) this.f4936g).longValue(), (String) this.h, (List) this.f4937i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public k0 b() {
        String str;
        if (((Integer) this.f4931a) == null) {
            str = " arch";
        } else {
            str = "";
        }
        if (((String) this.f4932b) == null) {
            str = str.concat(" model");
        }
        if (((Integer) this.f4933c) == null) {
            str = w.c.e(str, " cores");
        }
        if (((Long) this.d) == null) {
            str = w.c.e(str, " ram");
        }
        if (((Long) this.f4934e) == null) {
            str = w.c.e(str, " diskSpace");
        }
        if (((Boolean) this.f4935f) == null) {
            str = w.c.e(str, " simulator");
        }
        if (((Integer) this.f4936g) == null) {
            str = w.c.e(str, " state");
        }
        if (((String) this.h) == null) {
            str = w.c.e(str, " manufacturer");
        }
        if (((String) this.f4937i) == null) {
            str = w.c.e(str, " modelClass");
        }
        if (str.isEmpty()) {
            return new k0(((Integer) this.f4931a).intValue(), (String) this.f4932b, ((Integer) this.f4933c).intValue(), ((Long) this.d).longValue(), ((Long) this.f4934e).longValue(), ((Boolean) this.f4935f).booleanValue(), ((Integer) this.f4936g).intValue(), (String) this.h, (String) this.f4937i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public p9.a c(int i10) {
        p9.a aVar = null;
        try {
            if (!j.b(2, i10)) {
                JSONObject O = ((f1) this.f4934e).O();
                if (O != null) {
                    p9.a i11 = ((e0) this.f4933c).i(O);
                    f("Loaded cached settings: ", O);
                    ((db.a) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!j.b(3, i10) && i11.f44250c < currentTimeMillis) {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                            return null;
                        }
                    } else {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return i11;
                        } catch (Exception e6) {
                            e = e6;
                            aVar = i11;
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

    public p9.a d() {
        return (p9.a) ((AtomicReference) this.h).get();
    }

    public void e(y2.i r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: e3.g.e(y2.i, int):void");
    }
}
