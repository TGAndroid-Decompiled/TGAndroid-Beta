package gi;

import android.content.Context;
import android.graphics.Point;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.ui;
import org.telegram.messenger.zi;
import org.telegram.ui.uf0;
import org.telegram.ui.vf0;
public final class w extends u4.h0 {
    public final int f13783c;
    public final Context d;
    public final Object f13784e;
    public final KeyEvent.Callback f13785f;

    public w(KeyEvent.Callback callback, Context context, Object obj, int i3) {
        this.f13783c = i3;
        this.f13785f = callback;
        this.d = context;
        this.f13784e = obj;
    }

    @Override
    public final int b() {
        switch (this.f13783c) {
            case 0:
                return t.a().size();
            default:
                return ((vf0) this.f13785f).N.size();
        }
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        switch (this.f13783c) {
            case 0:
                x xVar = (x) d1Var.f55540a;
                t tVar = (t) t.a().get(i3);
                if (i3 == xVar.f13811s) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xVar.setDrawable(new u(tVar, false));
                xVar.b(tVar.equals(((y) this.f13785f).f13876b), z10);
                xVar.f13811s = i3;
                return;
            default:
                vf0 vf0Var = (vf0) this.f13785f;
                ArrayList arrayList = vf0Var.N;
                boolean z11 = true;
                zi ziVar = (zi) arrayList.get((b() - 1) - i3);
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) d1Var.f55540a;
                ui k10 = vf0Var.k(ziVar);
                int i10 = 0;
                if (k10 == null) {
                    z11 = false;
                }
                q1Var.setInvalidatesParent(z11);
                q1Var.u3(ziVar, k10, false, false, false, false);
                if (!vf0Var.P.i() && arrayList.size() >= 10) {
                    i10 = arrayList.size() % 10;
                }
                if (i3 == i10 && !ziVar.o5()) {
                    vf0Var.Q = q1Var;
                    Point point = org.telegram.messenger.g0.f22608q;
                    q1Var.w3(point.x, point.y);
                    vf0Var.R = ziVar.f1();
                    return;
                }
                return;
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        switch (this.f13783c) {
            case 0:
                gb gbVar = new gb(this.d);
                gbVar.setLayoutParams(new u4.p0(org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(56.0f)));
                gbVar.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
                return new u4.d1(gbVar);
            default:
                vf0 vf0Var = (vf0) this.f13785f;
                uf0 uf0Var = new uf0(vf0Var, this.d, vf0Var.f50476c, (org.telegram.ui.ActionBar.e6) this.f13784e);
                uf0Var.setDelegate(new ra.e(18));
                return new u4.d1(uf0Var);
        }
    }

    @Override
    public void y(u4.d1 d1Var) {
        switch (this.f13783c) {
            case 0:
                x xVar = (x) d1Var.f55540a;
                ((n2) this.f13784e).a(xVar);
                int i3 = xVar.f13811s;
                if (i3 >= 0 && i3 < t.a().size()) {
                    t tVar = (t) t.a().get(xVar.f13811s);
                    xVar.setDrawable(new u(tVar, false));
                    xVar.b(tVar.equals(((y) this.f13785f).f13876b), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void z(u4.d1 d1Var) {
        switch (this.f13783c) {
            case 0:
                ((n2) this.f13784e).d.remove((x) d1Var.f55540a);
                return;
            default:
                return;
        }
    }
}
