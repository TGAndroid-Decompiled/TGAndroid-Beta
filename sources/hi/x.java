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
public final class x extends v4.i0 {
    public final int f15706c;
    public final Context d;
    public final Object f15707e;
    public final KeyEvent.Callback f15708f;

    public x(KeyEvent.Callback callback, Context context, Object obj, int i7) {
        this.f15706c = i7;
        this.f15708f = callback;
        this.d = context;
        this.f15707e = obj;
    }

    @Override
    public final int b() {
        switch (this.f15706c) {
            case 0:
                return u.a().size();
            default:
                return ((eg0) this.f15708f).N.size();
        }
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        switch (this.f15706c) {
            case 0:
                y yVar = (y) f1Var.f59122a;
                u uVar = (u) u.a().get(i7);
                if (i7 == yVar.f15749s) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                yVar.setDrawable(new v(uVar, false));
                yVar.b(uVar.equals(((z) this.f15708f).f15795b), z10);
                yVar.f15749s = i7;
                return;
            default:
                eg0 eg0Var = (eg0) this.f15708f;
                ArrayList arrayList = eg0Var.N;
                boolean z11 = true;
                fj fjVar = (fj) arrayList.get((b() - 1) - i7);
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) f1Var.f59122a;
                aj l10 = eg0Var.l(fjVar);
                int i10 = 0;
                if (l10 == null) {
                    z11 = false;
                }
                q1Var.setInvalidatesParent(z11);
                q1Var.y3(fjVar, l10, false, false, false, false);
                if (!eg0Var.P.i() && arrayList.size() >= 10) {
                    i10 = arrayList.size() % 10;
                }
                if (i7 == i10 && !fjVar.n5()) {
                    eg0Var.Q = q1Var;
                    Point point = org.telegram.messenger.g0.f24121q;
                    q1Var.A3(point.x, point.y);
                    eg0Var.R = fjVar.e1();
                    return;
                }
                return;
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        switch (this.f15706c) {
            case 0:
                eb ebVar = new eb(this.d);
                ebVar.setLayoutParams(new v4.q0(org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(56.0f)));
                ebVar.setBackground(org.telegram.ui.ActionBar.n6.h0(553648127, 1, -1));
                return new v4.f1(ebVar);
            default:
                eg0 eg0Var = (eg0) this.f15708f;
                dg0 dg0Var = new dg0(eg0Var, this.d, eg0Var.f47227c, (org.telegram.ui.ActionBar.i6) this.f15707e);
                dg0Var.setDelegate(new nb.a(19));
                return new v4.f1(dg0Var);
        }
    }

    @Override
    public void y(v4.f1 f1Var) {
        switch (this.f15706c) {
            case 0:
                y yVar = (y) f1Var.f59122a;
                ((o2) this.f15707e).a(yVar);
                int i7 = yVar.f15749s;
                if (i7 >= 0 && i7 < u.a().size()) {
                    u uVar = (u) u.a().get(yVar.f15749s);
                    yVar.setDrawable(new v(uVar, false));
                    yVar.b(uVar.equals(((z) this.f15708f).f15795b), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void z(v4.f1 f1Var) {
        switch (this.f15706c) {
            case 0:
                ((o2) this.f15707e).d.remove((y) f1Var.f59122a);
                return;
            default:
                return;
        }
    }
}
