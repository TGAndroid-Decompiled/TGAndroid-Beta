package defpackage;

import android.util.Log;
import java.util.Map;
public final class fga {
    public final k7a a;
    public final h6a b;
    public final g6a c;
    public final snb d;
    public final v63 e;
    public final xk8 f;
    public final sw2 g;
    public w5a h;
    public boolean i;
    public boolean j;
    public String k;

    public fga(k7a k7aVar, h6a h6aVar, g6a g6aVar, snb snbVar, v63 v63Var, xk8 xk8Var, sw2 sw2Var) {
        k7aVar.getClass();
        h6aVar.getClass();
        g6aVar.getClass();
        snbVar.getClass();
        v63Var.getClass();
        xk8Var.getClass();
        sw2Var.getClass();
        this.a = k7aVar;
        this.b = h6aVar;
        this.c = g6aVar;
        this.d = snbVar;
        this.e = v63Var;
        this.f = xk8Var;
        this.g = sw2Var;
        this.k = "";
        ppd.b(h9e.a(sw2Var), new bga(this, null, (byte) 0));
    }

    public final void a() {
        this.i = false;
        if (this.h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f.a());
        ppd.b(h9e.a(this.g), new bga(this, null, (byte) 1));
    }

    public final void b() {
        this.i = true;
        w5a w5aVar = this.h;
        if (w5aVar == null) {
            this.j = true;
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
        } else if (w5aVar != null) {
            Log.d("FirebaseSessions", "App foregrounded on " + this.f.a());
            if (!d(w5aVar) && !c(w5aVar)) {
                return;
            }
            ppd.b(h9e.a(this.g), new eh4(this, w5aVar, null, (byte) 1));
        } else {
            rp5.e("localSessionData");
            throw null;
        }
    }

    public final boolean c(w5a w5aVar) {
        Map map = w5aVar.c;
        boolean z = true;
        xk8 xk8Var = this.f;
        if (map != null) {
            xk8Var.getClass();
            vk8 vk8Var = (vk8) map.get(xk8Var.a());
            if (vk8Var != null && vk8Var.a == xk8Var.c && rp5.a(vk8Var.b, (String) xk8Var.d.getValue())) {
                z = false;
            }
            if (z) {
                Log.d("FirebaseSessions", "Process " + xk8Var.a() + " is stale");
            }
            return z;
        }
        Log.d("FirebaseSessions", "No process data for " + xk8Var.a());
        return true;
    }

    public final boolean d(defpackage.w5a r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fga.d(w5a):boolean");
    }

    public final java.lang.Object e(java.lang.String r6, defpackage.cga r7, defpackage.fw2 r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fga.e(java.lang.String, cga, fw2):java.lang.Object");
    }
}
