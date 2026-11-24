package defpackage;

import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class zfd {
    public static final ce6 i = new ce6("SessionTransController", null);
    public final le1 a;
    public l8a f;
    public ta1 g;
    public r8a h;
    public final Set b = DesugarCollections.synchronizedSet(new HashSet());
    public byte e = 0;
    public final q79 c = new q79(Looper.getMainLooper(), (byte) 3);
    public final kfd d = new kfd(this, (byte) 0);

    public zfd(le1 le1Var) {
        this.a = le1Var;
    }

    public final k89 a() {
        l8a l8aVar = this.f;
        ce6 ce6Var = i;
        if (l8aVar == null) {
            ce6Var.b("skip transferring as SessionManager is null", new Object[0]);
            return null;
        }
        me1 c = l8aVar.c();
        if (c == null) {
            ce6Var.b("skip transferring as CastSession is null", new Object[0]);
            return null;
        }
        ite.e("Must be called from the main thread.");
        return c.j;
    }

    public final void b(int i2) {
        boolean z;
        ta1 ta1Var = this.g;
        if (ta1Var != null) {
            ta1Var.d = true;
            va1 va1Var = ta1Var.b;
            if (va1Var != null && va1Var.b.cancel(true)) {
                ta1Var.a = null;
                ta1Var.b = null;
                ta1Var.c = null;
            }
        }
        i.b("notify failed transfer with type = %d, reason = %d", Integer.valueOf(this.e), Integer.valueOf(i2));
        Iterator it = new HashSet(this.b).iterator();
        while (it.hasNext()) {
            bpe bpeVar = (bpe) it.next();
            byte b = this.e;
            switch (bpeVar.a) {
                case 0:
                    hue.j.b("onTransferFailed with type = %d and reason = %d", Integer.valueOf(b), Integer.valueOf(i2));
                    hue hueVar = (hue) bpeVar.b;
                    hueVar.c();
                    y5f b2 = hueVar.c.b(hueVar.g);
                    m5f m = n5f.m(b2.d());
                    m.c();
                    n5f.v((n5f) m.b, b);
                    m.c();
                    n5f.w((n5f) m.b, i2);
                    b2.e((n5f) m.a());
                    hueVar.a.a((a6f) b2.a(), 232);
                    hueVar.i = false;
                    break;
                default:
                    dd8 dd8Var = new dd8(11);
                    dd8Var.b = Integer.valueOf(i2);
                    sm2 sm2Var = (sm2) bpeVar.b;
                    if (((r8d) sm2Var.c).c == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    dd8Var.c = Boolean.valueOf(z);
                    sm2.R(sm2Var, new yjf(dd8Var));
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
