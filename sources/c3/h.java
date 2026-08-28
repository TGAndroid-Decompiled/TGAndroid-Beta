package c3;

import android.util.Log;
import g9.b0;
import g9.k0;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import k5.i;
import m1.j;
import org.json.JSONObject;
public final class h {
    public Object f2300a;
    public Object f2301b;
    public Object f2302c;
    public Object d;
    public Object f2303e;
    public Object f2304f;
    public Object f2305g;
    public Object h;
    public Object f2306i;

    public static void f(String str, JSONObject jSONObject) {
        StringBuilder n10 = e2.c.n(str);
        n10.append(jSONObject.toString());
        String sb2 = n10.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", sb2, null);
        }
    }

    public b0 a() {
        String str;
        if (((Integer) this.f2300a) == null) {
            str = " pid";
        } else {
            str = "";
        }
        if (((String) this.f2301b) == null) {
            str = str.concat(" processName");
        }
        if (((Integer) this.f2302c) == null) {
            str = ta.b.j(str, " reasonCode");
        }
        if (((Integer) this.d) == null) {
            str = ta.b.j(str, " importance");
        }
        if (((Long) this.f2303e) == null) {
            str = ta.b.j(str, " pss");
        }
        if (((Long) this.f2304f) == null) {
            str = ta.b.j(str, " rss");
        }
        if (((Long) this.f2305g) == null) {
            str = ta.b.j(str, " timestamp");
        }
        if (str.isEmpty()) {
            return new b0(((Integer) this.f2300a).intValue(), (String) this.f2301b, ((Integer) this.f2302c).intValue(), ((Integer) this.d).intValue(), ((Long) this.f2303e).longValue(), ((Long) this.f2304f).longValue(), ((Long) this.f2305g).longValue(), (String) this.h, (List) this.f2306i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public k0 b() {
        String str;
        if (((Integer) this.f2300a) == null) {
            str = " arch";
        } else {
            str = "";
        }
        if (((String) this.f2301b) == null) {
            str = str.concat(" model");
        }
        if (((Integer) this.f2302c) == null) {
            str = ta.b.j(str, " cores");
        }
        if (((Long) this.d) == null) {
            str = ta.b.j(str, " ram");
        }
        if (((Long) this.f2303e) == null) {
            str = ta.b.j(str, " diskSpace");
        }
        if (((Boolean) this.f2304f) == null) {
            str = ta.b.j(str, " simulator");
        }
        if (((Integer) this.f2305g) == null) {
            str = ta.b.j(str, " state");
        }
        if (((String) this.h) == null) {
            str = ta.b.j(str, " manufacturer");
        }
        if (((String) this.f2306i) == null) {
            str = ta.b.j(str, " modelClass");
        }
        if (str.isEmpty()) {
            return new k0(((Integer) this.f2300a).intValue(), (String) this.f2301b, ((Integer) this.f2302c).intValue(), ((Long) this.d).longValue(), ((Long) this.f2303e).longValue(), ((Boolean) this.f2304f).booleanValue(), ((Integer) this.f2305g).intValue(), (String) this.h, (String) this.f2306i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public l9.a c(int i9) {
        l9.a aVar = null;
        try {
            if (!j.a(2, i9)) {
                JSONObject Q = ((android.support.v4.media.c) this.f2303e).Q();
                if (Q != null) {
                    l9.a N = ((i) this.f2302c).N(Q);
                    f("Loaded cached settings: ", Q);
                    ((ya.b) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!j.a(3, i9) && N.f16699c < currentTimeMillis) {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                            return null;
                        }
                    } else {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return N;
                        } catch (Exception e10) {
                            e = e10;
                            aVar = N;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return aVar;
                        }
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e11) {
            e = e11;
        }
    }

    public l9.a d() {
        return (l9.a) ((AtomicReference) this.h).get();
    }

    public void e(w2.i r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: c3.h.e(w2.i, int):void");
    }
}
