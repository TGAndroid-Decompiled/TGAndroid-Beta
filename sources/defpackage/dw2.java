package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
public final class dw2 implements nr7, h49 {
    public final rw2 a;

    public dw2(rw2 rw2Var) {
        this.a = rw2Var;
    }

    @Override
    public final l2d S(View view, l2d l2dVar) {
        this.a.q = hl.H0(l2dVar, false);
        return l2dVar;
    }

    @Override
    public final void e(View view, w49 w49Var, boolean z, boolean z2) {
        if (w49Var != null) {
            rw2 rw2Var = this.a;
            e53 reactionsWindow = rw2Var.P.getReactionsWindow();
            boolean contains = rw2Var.o.contains(w49Var.f);
            ArrayList arrayList = rw2Var.o;
            if (contains) {
                if (arrayList.size() > 1) {
                    rw2Var.o.remove(w49Var.f);
                } else {
                    return;
                }
            } else {
                arrayList.add(w49Var.f);
                if (rw2Var.o.size() > 7) {
                    rw2Var.o.remove(0);
                }
            }
            rw2Var.P.setSelectedEmojis(rw2Var.o);
            if (reactionsWindow != null) {
                a53 a53Var = reactionsWindow.m;
                rw2Var.P.m(null, null, false);
                if (a53Var != null) {
                    a53Var.setSelectedReactions(rw2Var.o);
                    a53Var.setRecentReactions(rw2Var.P.W);
                }
                reactionsWindow.d();
            }
        }
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final void n() {
    }

    @Override
    public final void m(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
    }
}
