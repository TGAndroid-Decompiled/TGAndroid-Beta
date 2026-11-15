package hi;

import android.content.Context;
import android.graphics.Point;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.bj;
import org.telegram.messenger.gj;
import org.telegram.ui.ag0;
import org.telegram.ui.bg0;
public final class w extends v4.h0 {
    public final int f15267c;
    public final Context d;
    public final Object f15268e;
    public final KeyEvent.Callback f15269f;

    public w(KeyEvent.Callback callback, Context context, Object obj, int i7) {
        this.f15267c = i7;
        this.f15269f = callback;
        this.d = context;
        this.f15268e = obj;
    }

    @Override
    public final int b() {
        switch (this.f15267c) {
            case 0:
                return t.a().size();
            default:
                return ((bg0) this.f15269f).N.size();
        }
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        switch (this.f15267c) {
            case 0:
                x xVar = (x) e1Var.f58535a;
                t tVar = (t) t.a().get(i7);
                if (i7 == xVar.f15311s) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xVar.setDrawable(new u(tVar, false));
                xVar.b(tVar.equals(((y) this.f15269f).f15401b), z10);
                xVar.f15311s = i7;
                return;
            default:
                bg0 bg0Var = (bg0) this.f15269f;
                ArrayList arrayList = bg0Var.N;
                boolean z11 = true;
                gj gjVar = (gj) arrayList.get((b() - 1) - i7);
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) e1Var.f58535a;
                bj l10 = bg0Var.l(gjVar);
                int i10 = 0;
                if (l10 == null) {
                    z11 = false;
                }
                q1Var.setInvalidatesParent(z11);
                q1Var.x3(gjVar, l10, false, false, false, false);
                if (!bg0Var.P.i() && arrayList.size() >= 10) {
                    i10 = arrayList.size() % 10;
                }
                if (i7 == i10 && !gjVar.n5()) {
                    bg0Var.Q = q1Var;
                    Point point = org.telegram.messenger.g0.f23609q;
                    q1Var.z3(point.x, point.y);
                    bg0Var.R = gjVar.e1();
                    return;
                }
                return;
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        switch (this.f15267c) {
            case 0:
                db dbVar = new db(this.d);
                dbVar.setLayoutParams(new v4.p0(org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(56.0f)));
                dbVar.setBackground(org.telegram.ui.ActionBar.j6.h0(553648127, 1, -1));
                return new v4.e1(dbVar);
            default:
                bg0 bg0Var = (bg0) this.f15269f;
                ag0 ag0Var = new ag0(bg0Var, this.d, bg0Var.f45716c, (org.telegram.ui.ActionBar.e6) this.f15268e);
                ag0Var.setDelegate(new nb.a(19));
                return new v4.e1(ag0Var);
        }
    }

    @Override
    public void y(v4.e1 e1Var) {
        switch (this.f15267c) {
            case 0:
                x xVar = (x) e1Var.f58535a;
                ((n2) this.f15268e).a(xVar);
                int i7 = xVar.f15311s;
                if (i7 >= 0 && i7 < t.a().size()) {
                    t tVar = (t) t.a().get(xVar.f15311s);
                    xVar.setDrawable(new u(tVar, false));
                    xVar.b(tVar.equals(((y) this.f15269f).f15401b), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void z(v4.e1 e1Var) {
        switch (this.f15267c) {
            case 0:
                ((n2) this.f15268e).d.remove((x) e1Var.f58535a);
                return;
            default:
                return;
        }
    }
}
