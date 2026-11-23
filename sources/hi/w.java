package hi;

import android.content.Context;
import android.graphics.Point;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.bj;
import org.telegram.messenger.gj;
import org.telegram.ui.dg0;
import org.telegram.ui.eg0;
public final class w extends v4.h0 {
    public final int f15572c;
    public final Context d;
    public final Object f15573e;
    public final KeyEvent.Callback f15574f;

    public w(KeyEvent.Callback callback, Context context, Object obj, int i7) {
        this.f15572c = i7;
        this.f15574f = callback;
        this.d = context;
        this.f15573e = obj;
    }

    @Override
    public final int b() {
        switch (this.f15572c) {
            case 0:
                return t.a().size();
            default:
                return ((eg0) this.f15574f).N.size();
        }
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        switch (this.f15572c) {
            case 0:
                x xVar = (x) e1Var.f59111a;
                t tVar = (t) t.a().get(i7);
                if (i7 == xVar.f15654s) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xVar.setDrawable(new u(tVar, false));
                xVar.b(tVar.equals(((y) this.f15574f).f15702b), z10);
                xVar.f15654s = i7;
                return;
            default:
                eg0 eg0Var = (eg0) this.f15574f;
                ArrayList arrayList = eg0Var.N;
                boolean z11 = true;
                gj gjVar = (gj) arrayList.get((b() - 1) - i7);
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) e1Var.f59111a;
                bj l10 = eg0Var.l(gjVar);
                int i10 = 0;
                if (l10 == null) {
                    z11 = false;
                }
                r1Var.setInvalidatesParent(z11);
                r1Var.y3(gjVar, l10, false, false, false, false);
                if (!eg0Var.P.i() && arrayList.size() >= 10) {
                    i10 = arrayList.size() % 10;
                }
                if (i7 == i10 && !gjVar.n5()) {
                    eg0Var.Q = r1Var;
                    Point point = org.telegram.messenger.g0.f24010q;
                    r1Var.A3(point.x, point.y);
                    eg0Var.R = gjVar.e1();
                    return;
                }
                return;
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        switch (this.f15572c) {
            case 0:
                eb ebVar = new eb(this.d);
                ebVar.setLayoutParams(new v4.p0(org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(56.0f)));
                ebVar.setBackground(org.telegram.ui.ActionBar.m6.h0(553648127, 1, -1));
                return new v4.e1(ebVar);
            default:
                eg0 eg0Var = (eg0) this.f15574f;
                dg0 dg0Var = new dg0(eg0Var, this.d, eg0Var.f47236c, (org.telegram.ui.ActionBar.h6) this.f15573e);
                dg0Var.setDelegate(new nb.a(19));
                return new v4.e1(dg0Var);
        }
    }

    @Override
    public void y(v4.e1 e1Var) {
        switch (this.f15572c) {
            case 0:
                x xVar = (x) e1Var.f59111a;
                ((n2) this.f15573e).a(xVar);
                int i7 = xVar.f15654s;
                if (i7 >= 0 && i7 < t.a().size()) {
                    t tVar = (t) t.a().get(xVar.f15654s);
                    xVar.setDrawable(new u(tVar, false));
                    xVar.b(tVar.equals(((y) this.f15574f).f15702b), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void z(v4.e1 e1Var) {
        switch (this.f15572c) {
            case 0:
                ((n2) this.f15573e).d.remove((x) e1Var.f59111a);
                return;
            default:
                return;
        }
    }
}
