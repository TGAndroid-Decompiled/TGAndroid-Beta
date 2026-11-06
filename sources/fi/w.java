package fi;

import android.content.Context;
import android.graphics.Point;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.dj;
import org.telegram.messenger.ij;
import org.telegram.ui.ag0;
import org.telegram.ui.bg0;
public final class w extends v4.g0 {
    public final int f13019c;
    public final Context d;
    public final Object f13020e;
    public final KeyEvent.Callback f13021f;

    public w(KeyEvent.Callback callback, Context context, Object obj, int i7) {
        this.f13019c = i7;
        this.f13021f = callback;
        this.d = context;
        this.f13020e = obj;
    }

    @Override
    public final int b() {
        switch (this.f13019c) {
            case 0:
                return t.a().size();
            default:
                return ((bg0) this.f13021f).M.size();
        }
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        switch (this.f13019c) {
            case 0:
                x xVar = (x) d1Var.f56952a;
                t tVar = (t) t.a().get(i7);
                if (i7 == xVar.f13068s) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                xVar.setDrawable(new u(tVar, false));
                xVar.b(tVar.equals(((y) this.f13021f).f13106b), z9);
                xVar.f13068s = i7;
                return;
            default:
                bg0 bg0Var = (bg0) this.f13021f;
                ArrayList arrayList = bg0Var.M;
                boolean z10 = true;
                ij ijVar = (ij) arrayList.get((b() - 1) - i7);
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) d1Var.f56952a;
                dj k10 = bg0Var.k(ijVar);
                int i10 = 0;
                if (k10 == null) {
                    z10 = false;
                }
                q1Var.setInvalidatesParent(z10);
                q1Var.v3(ijVar, k10, false, false, false, false);
                if (!bg0Var.O.i() && arrayList.size() >= 10) {
                    i10 = arrayList.size() % 10;
                }
                if (i7 == i10 && !ijVar.o5()) {
                    bg0Var.P = q1Var;
                    Point point = org.telegram.messenger.g0.f22537q;
                    q1Var.x3(point.x, point.y);
                    bg0Var.Q = ijVar.f1();
                    return;
                }
                return;
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        switch (this.f13019c) {
            case 0:
                gb gbVar = new gb(this.d);
                gbVar.setLayoutParams(new v4.o0(org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(56.0f)));
                gbVar.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
                return new v4.d1(gbVar);
            default:
                bg0 bg0Var = (bg0) this.f13021f;
                ag0 ag0Var = new ag0(bg0Var, this.d, bg0Var.f44320c, (org.telegram.ui.ActionBar.f6) this.f13020e);
                ag0Var.setDelegate(new qb.a(18));
                return new v4.d1(ag0Var);
        }
    }

    @Override
    public void y(v4.d1 d1Var) {
        switch (this.f13019c) {
            case 0:
                x xVar = (x) d1Var.f56952a;
                ((p2) this.f13020e).a(xVar);
                int i7 = xVar.f13068s;
                if (i7 >= 0 && i7 < t.a().size()) {
                    t tVar = (t) t.a().get(xVar.f13068s);
                    xVar.setDrawable(new u(tVar, false));
                    xVar.b(tVar.equals(((y) this.f13021f).f13106b), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void z(v4.d1 d1Var) {
        switch (this.f13019c) {
            case 0:
                ((p2) this.f13020e).d.remove((x) d1Var.f56952a);
                return;
            default:
                return;
        }
    }
}
