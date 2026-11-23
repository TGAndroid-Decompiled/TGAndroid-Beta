package hi;

import android.content.Context;
import android.graphics.Point;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.aj;
import org.telegram.messenger.fj;
import org.telegram.ui.cg0;
import org.telegram.ui.dg0;
public final class f0 extends v4.i0 {
    public final int f14415c;
    public final Context d;
    public final Object f14416e;
    public final KeyEvent.Callback f14417f;

    public f0(KeyEvent.Callback callback, Context context, Object obj, int i7) {
        this.f14415c = i7;
        this.f14417f = callback;
        this.d = context;
        this.f14416e = obj;
    }

    @Override
    public final int b() {
        switch (this.f14415c) {
            case 0:
                return c0.a().size();
            default:
                return ((dg0) this.f14417f).N.size();
        }
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        switch (this.f14415c) {
            case 0:
                g0 g0Var = (g0) f1Var.f59245a;
                c0 c0Var = (c0) c0.a().get(i7);
                if (i7 == g0Var.f14516s) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g0Var.setDrawable(new d0(c0Var, false));
                g0Var.b(c0Var.equals(((h0) this.f14417f).f14568b), z10);
                g0Var.f14516s = i7;
                return;
            default:
                dg0 dg0Var = (dg0) this.f14417f;
                ArrayList arrayList = dg0Var.N;
                boolean z11 = true;
                fj fjVar = (fj) arrayList.get((b() - 1) - i7);
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) f1Var.f59245a;
                aj l10 = dg0Var.l(fjVar);
                int i10 = 0;
                if (l10 == null) {
                    z11 = false;
                }
                r1Var.setInvalidatesParent(z11);
                r1Var.y3(fjVar, l10, false, false, false, false);
                if (!dg0Var.P.i() && arrayList.size() >= 10) {
                    i10 = arrayList.size() % 10;
                }
                if (i7 == i10 && !fjVar.n5()) {
                    dg0Var.Q = r1Var;
                    Point point = org.telegram.messenger.g0.f24226q;
                    r1Var.A3(point.x, point.y);
                    dg0Var.R = fjVar.e1();
                    return;
                }
                return;
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        switch (this.f14415c) {
            case 0:
                yb ybVar = new yb(this.d);
                ybVar.setLayoutParams(new v4.q0(org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(56.0f)));
                ybVar.setBackground(org.telegram.ui.ActionBar.n6.h0(553648127, 1, -1));
                return new v4.f1(ybVar);
            default:
                dg0 dg0Var = (dg0) this.f14417f;
                cg0 cg0Var = new cg0(dg0Var, this.d, dg0Var.f47095c, (org.telegram.ui.ActionBar.i6) this.f14416e);
                cg0Var.setDelegate(new nb.a(19));
                return new v4.f1(cg0Var);
        }
    }

    @Override
    public void y(v4.f1 f1Var) {
        switch (this.f14415c) {
            case 0:
                g0 g0Var = (g0) f1Var.f59245a;
                ((w2) this.f14416e).a(g0Var);
                int i7 = g0Var.f14516s;
                if (i7 >= 0 && i7 < c0.a().size()) {
                    c0 c0Var = (c0) c0.a().get(g0Var.f14516s);
                    g0Var.setDrawable(new d0(c0Var, false));
                    g0Var.b(c0Var.equals(((h0) this.f14417f).f14568b), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void z(v4.f1 f1Var) {
        switch (this.f14415c) {
            case 0:
                ((w2) this.f14416e).d.remove((g0) f1Var.f59245a);
                return;
            default:
                return;
        }
    }
}
