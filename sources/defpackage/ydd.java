package defpackage;

import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class ydd {
    public static final dc6 i = new dc6("SessionTransController", null);
    public final dd1 a;
    public j6a f;
    public k91 g;
    public p6a h;
    public final Set b = DesugarCollections.synchronizedSet(new HashSet());
    public byte e = 0;
    public final o59 c = new o59(Looper.getMainLooper(), (byte) 3);
    public final idd d = new idd(this, (byte) 0);

    public ydd(dd1 dd1Var) {
        this.a = dd1Var;
    }

    public final i69 a() {
        j6a j6aVar = this.f;
        dc6 dc6Var = i;
        if (j6aVar == null) {
            dc6Var.b("skip transferring as SessionManager is null", new Object[0]);
            return null;
        }
        ed1 c = j6aVar.c();
        if (c == null) {
            dc6Var.b("skip transferring as CastSession is null", new Object[0]);
            return null;
        }
        fre.e("Must be called from the main thread.");
        return c.j;
    }

    public final void b(int i2) {
        boolean z;
        k91 k91Var = this.g;
        if (k91Var != null) {
            k91Var.d = true;
            m91 m91Var = k91Var.b;
            if (m91Var != null && m91Var.b.cancel(true)) {
                k91Var.a = null;
                k91Var.b = null;
                k91Var.c = null;
            }
        }
        i.b("notify failed transfer with type = %d, reason = %d", Integer.valueOf(this.e), Integer.valueOf(i2));
        Iterator it = new HashSet(this.b).iterator();
        while (it.hasNext()) {
            yme ymeVar = (yme) it.next();
            byte b = this.e;
            switch (ymeVar.a) {
                case 0:
                    ese.j.b("onTransferFailed with type = %d and reason = %d", Integer.valueOf(b), Integer.valueOf(i2));
                    ese eseVar = (ese) ymeVar.b;
                    eseVar.c();
                    w3f b2 = eseVar.c.b(eseVar.g);
                    k3f m = l3f.m(b2.d());
                    m.c();
                    l3f.v((l3f) m.b, b);
                    m.c();
                    l3f.w((l3f) m.b, i2);
                    b2.e((l3f) m.a());
                    eseVar.a.a((y3f) b2.a(), 232);
                    eseVar.i = false;
                    break;
                default:
                    ab8 ab8Var = new ab8(11);
                    ab8Var.b = Integer.valueOf(i2);
                    gl2 gl2Var = (gl2) ymeVar.b;
                    if (((p6d) gl2Var.c).c == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ab8Var.c = Boolean.valueOf(z);
                    gl2.S(gl2Var, new xhf(ab8Var));
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
