package defpackage;

import android.util.Log;
import java.util.Map;
public final class hia {
    public final l9a a;
    public final j8a b;
    public final i8a c;
    public final tpb d;
    public final h83 e;
    public final zm8 f;
    public final cy2 g;
    public y7a h;
    public boolean i;
    public boolean j;
    public String k;

    public hia(l9a l9aVar, j8a j8aVar, i8a i8aVar, tpb tpbVar, h83 h83Var, zm8 zm8Var, cy2 cy2Var) {
        l9aVar.getClass();
        j8aVar.getClass();
        i8aVar.getClass();
        tpbVar.getClass();
        h83Var.getClass();
        zm8Var.getClass();
        cy2Var.getClass();
        this.a = l9aVar;
        this.b = j8aVar;
        this.c = i8aVar;
        this.d = tpbVar;
        this.e = h83Var;
        this.f = zm8Var;
        this.g = cy2Var;
        this.k = "";
        srd.b(ibe.a(cy2Var), new dia(this, null, (byte) 0));
    }

    public final void a() {
        this.i = false;
        if (this.h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f.a());
        srd.b(ibe.a(this.g), new dia(this, null, (byte) 1));
    }

    public final void b() {
        this.i = true;
        y7a y7aVar = this.h;
        if (y7aVar == null) {
            this.j = true;
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
        } else if (y7aVar != null) {
            Log.d("FirebaseSessions", "App foregrounded on " + this.f.a());
            if (!d(y7aVar) && !c(y7aVar)) {
                return;
            }
            srd.b(ibe.a(this.g), new gj4(this, y7aVar, null, (byte) 1));
        } else {
            rr5.e("localSessionData");
            throw null;
        }
    }

    public final boolean c(y7a y7aVar) {
        Map map = y7aVar.c;
        boolean z = true;
        zm8 zm8Var = this.f;
        if (map != null) {
            zm8Var.getClass();
            xm8 xm8Var = (xm8) map.get(zm8Var.a());
            if (xm8Var != null && xm8Var.a == zm8Var.c && rr5.a(xm8Var.b, (String) zm8Var.d.getValue())) {
                z = false;
            }
            if (z) {
                Log.d("FirebaseSessions", "Process " + zm8Var.a() + " is stale");
            }
            return z;
        }
        Log.d("FirebaseSessions", "No process data for " + zm8Var.a());
        return true;
    }

    public final boolean d(defpackage.y7a r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hia.d(y7a):boolean");
    }

    public final java.lang.Object e(java.lang.String r6, defpackage.eia r7, defpackage.px2 r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hia.e(java.lang.String, eia, px2):java.lang.Object");
    }
}
