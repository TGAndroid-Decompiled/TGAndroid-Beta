package fi;

import android.content.Context;
import android.graphics.Point;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.dj;
import org.telegram.messenger.ij;
import org.telegram.ui.dg0;
import org.telegram.ui.eg0;
public final class w extends v4.g0 {
    public final int f13021c;
    public final Context d;
    public final Object f13022e;
    public final KeyEvent.Callback f13023f;

    public w(KeyEvent.Callback callback, Context context, Object obj, int i7) {
        this.f13021c = i7;
        this.f13023f = callback;
        this.d = context;
        this.f13022e = obj;
    }

    @Override
    public final int b() {
        switch (this.f13021c) {
            case 0:
                return t.a().size();
            default:
                return ((eg0) this.f13023f).M.size();
        }
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        switch (this.f13021c) {
            case 0:
                x xVar = (x) d1Var.f57052a;
                t tVar = (t) t.a().get(i7);
                if (i7 == xVar.f13070s) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                xVar.setDrawable(new u(tVar, false));
                xVar.b(tVar.equals(((y) this.f13023f).f13108b), z9);
                xVar.f13070s = i7;
                return;
            default:
                eg0 eg0Var = (eg0) this.f13023f;
                ArrayList arrayList = eg0Var.M;
                boolean z10 = true;
                ij ijVar = (ij) arrayList.get((b() - 1) - i7);
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) d1Var.f57052a;
                dj k10 = eg0Var.k(ijVar);
                int i10 = 0;
                if (k10 == null) {
                    z10 = false;
                }
                q1Var.setInvalidatesParent(z10);
                q1Var.w3(ijVar, k10, false, false, false, false);
                if (!eg0Var.O.i() && arrayList.size() >= 10) {
                    i10 = arrayList.size() % 10;
                }
                if (i7 == i10 && !ijVar.n5()) {
                    eg0Var.P = q1Var;
                    Point point = org.telegram.messenger.g0.f22567q;
                    q1Var.y3(point.x, point.y);
                    eg0Var.Q = ijVar.e1();
                    return;
                }
                return;
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        switch (this.f13021c) {
            case 0:
                gb gbVar = new gb(this.d);
                gbVar.setLayoutParams(new v4.o0(org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(56.0f)));
                gbVar.setBackground(org.telegram.ui.ActionBar.m6.h0(553648127, 1, -1));
                return new v4.d1(gbVar);
            default:
                eg0 eg0Var = (eg0) this.f13023f;
                dg0 dg0Var = new dg0(eg0Var, this.d, eg0Var.f45272c, (org.telegram.ui.ActionBar.h6) this.f13022e);
                dg0Var.setDelegate(new qb.a(18));
                return new v4.d1(dg0Var);
        }
    }

    @Override
    public void y(v4.d1 d1Var) {
        switch (this.f13021c) {
            case 0:
                x xVar = (x) d1Var.f57052a;
                ((p2) this.f13022e).a(xVar);
                int i7 = xVar.f13070s;
                if (i7 >= 0 && i7 < t.a().size()) {
                    t tVar = (t) t.a().get(xVar.f13070s);
                    xVar.setDrawable(new u(tVar, false));
                    xVar.b(tVar.equals(((y) this.f13023f).f13108b), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void z(v4.d1 d1Var) {
        switch (this.f13021c) {
            case 0:
                ((p2) this.f13022e).d.remove((x) d1Var.f57052a);
                return;
            default:
                return;
        }
    }
}
