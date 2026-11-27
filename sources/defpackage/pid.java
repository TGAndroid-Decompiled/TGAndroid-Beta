package defpackage;

import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class pid {
    public static final he6 i = new he6("SessionTransController", null);
    public final ld1 a;
    public baa f;
    public t91 g;
    public haa h;
    public final Set b = DesugarCollections.synchronizedSet(new HashSet());
    public byte e = 0;
    public final b99 c = new b99(Looper.getMainLooper(), (byte) 3);
    public final bid d = new bid(this, (byte) 0);

    public pid(ld1 ld1Var) {
        this.a = ld1Var;
    }

    public final v99 a() {
        baa baaVar = this.f;
        he6 he6Var = i;
        if (baaVar == null) {
            he6Var.b("skip transferring as SessionManager is null", new Object[0]);
            return null;
        }
        md1 c = baaVar.c();
        if (c == null) {
            he6Var.b("skip transferring as CastSession is null", new Object[0]);
            return null;
        }
        xve.e("Must be called from the main thread.");
        return c.j;
    }

    public final void b(int i2) {
        boolean z;
        t91 t91Var = this.g;
        if (t91Var != null) {
            t91Var.d = true;
            v91 v91Var = t91Var.b;
            if (v91Var != null && v91Var.b.cancel(true)) {
                t91Var.a = null;
                t91Var.b = null;
                t91Var.c = null;
            }
        }
        i.b("notify failed transfer with type = %d, reason = %d", Integer.valueOf(this.e), Integer.valueOf(i2));
        Iterator it = new HashSet(this.b).iterator();
        while (it.hasNext()) {
            pre preVar = (pre) it.next();
            byte b = this.e;
            switch (preVar.a) {
                case 0:
                    vwe.j.b("onTransferFailed with type = %d and reason = %d", Integer.valueOf(b), Integer.valueOf(i2));
                    vwe vweVar = (vwe) preVar.b;
                    vweVar.c();
                    n8f b2 = vweVar.c.b(vweVar.g);
                    b8f m = c8f.m(b2.d());
                    m.c();
                    c8f.v((c8f) m.b, b);
                    m.c();
                    c8f.w((c8f) m.b, i2);
                    b2.e((c8f) m.a());
                    vweVar.a.a((p8f) b2.a(), 232);
                    vweVar.i = false;
                    break;
                default:
                    pe8 pe8Var = new pe8(11);
                    pe8Var.b = Integer.valueOf(i2);
                    am2 am2Var = (am2) preVar.b;
                    if (((ibd) am2Var.c).c == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    pe8Var.c = Boolean.valueOf(z);
                    am2.R(am2Var, new nmf(pe8Var));
                    break;
            }
        }
        c();
    }

    public final void c() {
        this.c.removeCallbacks(this.d);
        this.e = (byte) 0;
        this.h = null;
    }
}
