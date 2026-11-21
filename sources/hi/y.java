package hi;

import android.content.Context;
import android.graphics.Point;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.aj;
import org.telegram.messenger.fj;
import org.telegram.ui.dg0;
import org.telegram.ui.eg0;
public final class y extends v4.i0 {
    public final int f15771c;
    public final Context d;
    public final Object f15772e;
    public final KeyEvent.Callback f15773f;

    public y(KeyEvent.Callback callback, Context context, Object obj, int i7) {
        this.f15771c = i7;
        this.f15773f = callback;
        this.d = context;
        this.f15772e = obj;
    }

    @Override
    public final int b() {
        switch (this.f15771c) {
            case 0:
                return v.a().size();
            default:
                return ((eg0) this.f15773f).N.size();
        }
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        switch (this.f15771c) {
            case 0:
                z zVar = (z) f1Var.f59161a;
                v vVar = (v) v.a().get(i7);
                if (i7 == zVar.f15824s) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zVar.setDrawable(new w(vVar, false));
                zVar.b(vVar.equals(((a0) this.f15773f).f14203b), z10);
                zVar.f15824s = i7;
                return;
            default:
                eg0 eg0Var = (eg0) this.f15773f;
                ArrayList arrayList = eg0Var.N;
                boolean z11 = true;
                fj fjVar = (fj) arrayList.get((b() - 1) - i7);
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) f1Var.f59161a;
                aj l10 = eg0Var.l(fjVar);
                int i10 = 0;
                if (l10 == null) {
                    z11 = false;
                }
                r1Var.setInvalidatesParent(z11);
                r1Var.y3(fjVar, l10, false, false, false, false);
                if (!eg0Var.P.i() && arrayList.size() >= 10) {
                    i10 = arrayList.size() % 10;
                }
                if (i7 == i10 && !fjVar.n5()) {
                    eg0Var.Q = r1Var;
                    Point point = org.telegram.messenger.g0.f24146q;
                    r1Var.A3(point.x, point.y);
                    eg0Var.R = fjVar.e1();
                    return;
                }
                return;
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        switch (this.f15771c) {
            case 0:
                db dbVar = new db(this.d);
                dbVar.setLayoutParams(new v4.q0(org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(56.0f)));
                dbVar.setBackground(org.telegram.ui.ActionBar.m6.h0(553648127, 1, -1));
                return new v4.f1(dbVar);
            default:
                eg0 eg0Var = (eg0) this.f15773f;
                dg0 dg0Var = new dg0(eg0Var, this.d, eg0Var.f47263c, (org.telegram.ui.ActionBar.h6) this.f15772e);
                dg0Var.setDelegate(new nb.a(19));
                return new v4.f1(dg0Var);
        }
    }

    @Override
    public void y(v4.f1 f1Var) {
        switch (this.f15771c) {
            case 0:
                z zVar = (z) f1Var.f59161a;
                ((n2) this.f15772e).a(zVar);
                int i7 = zVar.f15824s;
                if (i7 >= 0 && i7 < v.a().size()) {
                    v vVar = (v) v.a().get(zVar.f15824s);
                    zVar.setDrawable(new w(vVar, false));
                    zVar.b(vVar.equals(((a0) this.f15773f).f14203b), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void z(v4.f1 f1Var) {
        switch (this.f15771c) {
            case 0:
                ((n2) this.f15772e).d.remove((z) f1Var.f59161a);
                return;
            default:
                return;
        }
    }
}
