package hi;

import android.content.Context;
import android.graphics.Point;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.aj;
import org.telegram.messenger.fj;
import org.telegram.ui.eg0;
import org.telegram.ui.fg0;
public final class x extends v4.i0 {
    public final int f15703c;
    public final Context d;
    public final Object f15704e;
    public final KeyEvent.Callback f15705f;

    public x(KeyEvent.Callback callback, Context context, Object obj, int i7) {
        this.f15703c = i7;
        this.f15705f = callback;
        this.d = context;
        this.f15704e = obj;
    }

    @Override
    public final int b() {
        switch (this.f15703c) {
            case 0:
                return u.a().size();
            default:
                return ((fg0) this.f15705f).N.size();
        }
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        switch (this.f15703c) {
            case 0:
                y yVar = (y) f1Var.f59123a;
                u uVar = (u) u.a().get(i7);
                if (i7 == yVar.f15746s) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                yVar.setDrawable(new v(uVar, false));
                yVar.b(uVar.equals(((z) this.f15705f).f15792b), z10);
                yVar.f15746s = i7;
                return;
            default:
                fg0 fg0Var = (fg0) this.f15705f;
                ArrayList arrayList = fg0Var.N;
                boolean z11 = true;
                fj fjVar = (fj) arrayList.get((b() - 1) - i7);
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) f1Var.f59123a;
                aj l10 = fg0Var.l(fjVar);
                int i10 = 0;
                if (l10 == null) {
                    z11 = false;
                }
                r1Var.setInvalidatesParent(z11);
                r1Var.y3(fjVar, l10, false, false, false, false);
                if (!fg0Var.P.i() && arrayList.size() >= 10) {
                    i10 = arrayList.size() % 10;
                }
                if (i7 == i10 && !fjVar.n5()) {
                    fg0Var.Q = r1Var;
                    Point point = org.telegram.messenger.g0.f24118q;
                    r1Var.A3(point.x, point.y);
                    fg0Var.R = fjVar.e1();
                    return;
                }
                return;
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        switch (this.f15703c) {
            case 0:
                eb ebVar = new eb(this.d);
                ebVar.setLayoutParams(new v4.q0(org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(56.0f)));
                ebVar.setBackground(org.telegram.ui.ActionBar.n6.h0(553648127, 1, -1));
                return new v4.f1(ebVar);
            default:
                fg0 fg0Var = (fg0) this.f15705f;
                eg0 eg0Var = new eg0(fg0Var, this.d, fg0Var.f47622c, (org.telegram.ui.ActionBar.i6) this.f15704e);
                eg0Var.setDelegate(new nb.a(19));
                return new v4.f1(eg0Var);
        }
    }

    @Override
    public void y(v4.f1 f1Var) {
        switch (this.f15703c) {
            case 0:
                y yVar = (y) f1Var.f59123a;
                ((o2) this.f15704e).a(yVar);
                int i7 = yVar.f15746s;
                if (i7 >= 0 && i7 < u.a().size()) {
                    u uVar = (u) u.a().get(yVar.f15746s);
                    yVar.setDrawable(new v(uVar, false));
                    yVar.b(uVar.equals(((z) this.f15705f).f15792b), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void z(v4.f1 f1Var) {
        switch (this.f15703c) {
            case 0:
                ((o2) this.f15704e).d.remove((y) f1Var.f59123a);
                return;
            default:
                return;
        }
    }
}
