package aa;

import android.util.Log;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import org.telegram.ui.Components.b10;
public final class b0 {
    public Object f1031a;
    public Object f1032b;
    public Object f1033c;
    public Object d;
    public Object e;
    public Object f1034f;
    public Object f1035g;
    public Object h;
    public Object f1036i;

    public static void f(String str, JSONObject jSONObject) {
        StringBuilder u10 = a1.g.u(str);
        u10.append(jSONObject.toString());
        String sb2 = u10.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", sb2, null);
        }
    }

    public c0 a() {
        String str;
        if (((Integer) this.f1031a) == null) {
            str = " pid";
        } else {
            str = "";
        }
        if (((String) this.f1032b) == null) {
            str = str.concat(" processName");
        }
        if (((Integer) this.f1033c) == null) {
            str = b10.u(str, " reasonCode");
        }
        if (((Integer) this.f1034f) == null) {
            str = b10.u(str, " importance");
        }
        if (((Long) this.d) == null) {
            str = b10.u(str, " pss");
        }
        if (((Long) this.e) == null) {
            str = b10.u(str, " rss");
        }
        if (((Long) this.h) == null) {
            str = b10.u(str, " timestamp");
        }
        if (str.isEmpty()) {
            return new c0(((Integer) this.f1031a).intValue(), (String) this.f1032b, ((Integer) this.f1033c).intValue(), ((Integer) this.f1034f).intValue(), ((Long) this.d).longValue(), ((Long) this.e).longValue(), ((Long) this.h).longValue(), (String) this.f1035g, (List) this.f1036i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public l0 b() {
        String str;
        if (((Integer) this.f1031a) == null) {
            str = " arch";
        } else {
            str = "";
        }
        if (((String) this.f1032b) == null) {
            str = str.concat(" model");
        }
        if (((Integer) this.f1033c) == null) {
            str = b10.u(str, " cores");
        }
        if (((Long) this.d) == null) {
            str = b10.u(str, " ram");
        }
        if (((Long) this.e) == null) {
            str = b10.u(str, " diskSpace");
        }
        if (((Boolean) this.h) == null) {
            str = b10.u(str, " simulator");
        }
        if (((Integer) this.f1034f) == null) {
            str = b10.u(str, " state");
        }
        if (((String) this.f1035g) == null) {
            str = b10.u(str, " manufacturer");
        }
        if (((String) this.f1036i) == null) {
            str = b10.u(str, " modelClass");
        }
        if (str.isEmpty()) {
            return new l0(((Integer) this.f1031a).intValue(), (String) this.f1032b, ((Integer) this.f1033c).intValue(), ((Long) this.d).longValue(), ((Long) this.e).longValue(), ((Boolean) this.h).booleanValue(), ((Integer) this.f1034f).intValue(), (String) this.f1035g, (String) this.f1036i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public fa.a c(int i10) {
        fa.a aVar = null;
        try {
            if (!m1.j.b(2, i10)) {
                JSONObject H = ((a4.l) this.f1035g).H();
                if (H != null) {
                    fa.a b02 = ((b6.i) this.f1034f).b0(H);
                    f("Loaded cached settings: ", H);
                    ((sb.b) this.f1032b).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!m1.j.b(3, i10) && b02.f10372c < currentTimeMillis) {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                            return null;
                        }
                    } else {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return b02;
                        } catch (Exception e) {
                            e = e;
                            aVar = b02;
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

    public fa.a d() {
        return (fa.a) ((AtomicReference) this.h).get();
    }

    public void e(m5.i r45, int r46) {
        throw new UnsupportedOperationException("Method not decompiled: aa.b0.e(m5.i, int):void");
    }
}
