package da;

import a1.g;
import a4.l;
import android.util.Log;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import m1.j;
import org.json.JSONObject;
import sc.v;
import y9.b0;
import y9.k0;
public final class c {
    public Object f8232a;
    public Object f8233b;
    public Object f8234c;
    public Object d;
    public Object f8235e;
    public Object f8236f;
    public Object f8237g;
    public Object h;
    public Object f8238i;

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
        if (((Integer) this.f8232a) == null) {
            str = " pid";
        } else {
            str = "";
        }
        if (((String) this.f8233b) == null) {
            str = str.concat(" processName");
        }
        if (((Integer) this.f8234c) == null) {
            str = v.v(str, " reasonCode");
        }
        if (((Integer) this.d) == null) {
            str = v.v(str, " importance");
        }
        if (((Long) this.f8235e) == null) {
            str = v.v(str, " pss");
        }
        if (((Long) this.f8236f) == null) {
            str = v.v(str, " rss");
        }
        if (((Long) this.f8237g) == null) {
            str = v.v(str, " timestamp");
        }
        if (str.isEmpty()) {
            return new b0(((Integer) this.f8232a).intValue(), (String) this.f8233b, ((Integer) this.f8234c).intValue(), ((Integer) this.d).intValue(), ((Long) this.f8235e).longValue(), ((Long) this.f8236f).longValue(), ((Long) this.f8237g).longValue(), (String) this.h, (List) this.f8238i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public k0 b() {
        String str;
        if (((Integer) this.f8232a) == null) {
            str = " arch";
        } else {
            str = "";
        }
        if (((String) this.f8233b) == null) {
            str = str.concat(" model");
        }
        if (((Integer) this.f8234c) == null) {
            str = v.v(str, " cores");
        }
        if (((Long) this.d) == null) {
            str = v.v(str, " ram");
        }
        if (((Long) this.f8235e) == null) {
            str = v.v(str, " diskSpace");
        }
        if (((Boolean) this.f8236f) == null) {
            str = v.v(str, " simulator");
        }
        if (((Integer) this.f8237g) == null) {
            str = v.v(str, " state");
        }
        if (((String) this.h) == null) {
            str = v.v(str, " manufacturer");
        }
        if (((String) this.f8238i) == null) {
            str = v.v(str, " modelClass");
        }
        if (str.isEmpty()) {
            return new k0(((Integer) this.f8232a).intValue(), (String) this.f8233b, ((Integer) this.f8234c).intValue(), ((Long) this.d).longValue(), ((Long) this.f8235e).longValue(), ((Boolean) this.f8236f).booleanValue(), ((Integer) this.f8237g).intValue(), (String) this.h, (String) this.f8238i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public b c(int i10) {
        b bVar = null;
        try {
            if (!j.b(2, i10)) {
                JSONObject b02 = ((pb.c) this.f8235e).b0();
                if (b02 != null) {
                    b U = ((l) this.f8234c).U(b02);
                    f("Loaded cached settings: ", b02);
                    ((rb.a) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!j.b(3, i10) && U.f8229c < currentTimeMillis) {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                            return null;
                        }
                    } else {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return U;
                        } catch (Exception e7) {
                            e = e7;
                            bVar = U;
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

    public void e(l5.i r45, int r46) {
        throw new UnsupportedOperationException("Method not decompiled: da.c.e(l5.i, int):void");
    }
}
