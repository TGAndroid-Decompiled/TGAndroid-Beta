package defpackage;

import android.util.Log;
import java.util.Map;
public final class yja {
    public final bba a;
    public final z9a b;
    public final y9a c;
    public final srb d;
    public final o73 e;
    public final ko8 f;
    public final mx2 g;
    public o9a h;
    public boolean i;
    public boolean j;
    public String k;

    public yja(bba bbaVar, z9a z9aVar, y9a y9aVar, srb srbVar, o73 o73Var, ko8 ko8Var, mx2 mx2Var) {
        bbaVar.getClass();
        z9aVar.getClass();
        y9aVar.getClass();
        srbVar.getClass();
        o73Var.getClass();
        ko8Var.getClass();
        mx2Var.getClass();
        this.a = bbaVar;
        this.b = z9aVar;
        this.c = y9aVar;
        this.d = srbVar;
        this.e = o73Var;
        this.f = ko8Var;
        this.g = mx2Var;
        this.k = "";
        fud.b(xde.a(mx2Var), new uja(this, null, (byte) 0));
    }

    public final void a() {
        this.i = false;
        if (this.h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f.a());
        fud.b(xde.a(this.g), new uja(this, null, (byte) 1));
    }

    public final void b() {
        this.i = true;
        o9a o9aVar = this.h;
        if (o9aVar == null) {
            this.j = true;
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
        } else if (o9aVar != null) {
            Log.d("FirebaseSessions", "App foregrounded on " + this.f.a());
            if (!d(o9aVar) && !c(o9aVar)) {
                return;
            }
            fud.b(xde.a(this.g), new fj4(this, o9aVar, null, (byte) 1));
        } else {
            ur5.e("localSessionData");
            throw null;
        }
    }

    public final boolean c(o9a o9aVar) {
        Map map = o9aVar.c;
        boolean z = true;
        ko8 ko8Var = this.f;
        if (map != null) {
            ko8Var.getClass();
            io8 io8Var = (io8) map.get(ko8Var.a());
            if (io8Var != null && io8Var.a == ko8Var.c && ur5.a(io8Var.b, (String) ko8Var.d.getValue())) {
                z = false;
            }
            if (z) {
                Log.d("FirebaseSessions", "Process " + ko8Var.a() + " is stale");
            }
            return z;
        }
        Log.d("FirebaseSessions", "No process data for " + ko8Var.a());
        return true;
    }

    public final boolean d(defpackage.o9a r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yja.d(o9a):boolean");
    }

    public final java.lang.Object e(java.lang.String r6, defpackage.vja r7, defpackage.zw2 r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yja.e(java.lang.String, vja, zw2):java.lang.Object");
    }
}
