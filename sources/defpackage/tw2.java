package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
public final class tw2 implements qq7, u29 {
    public final hx2 a;

    public tw2(hx2 hx2Var) {
        this.a = hx2Var;
    }

    @Override
    public final wzc C0(View view, wzc wzcVar) {
        this.a.q = gm.H0(wzcVar, false);
        return wzcVar;
    }

    @Override
    public final void g(View view, k39 k39Var, boolean z, boolean z2) {
        if (k39Var != null) {
            hx2 hx2Var = this.a;
            x53 reactionsWindow = hx2Var.P.getReactionsWindow();
            boolean contains = hx2Var.o.contains(k39Var.f);
            ArrayList arrayList = hx2Var.o;
            if (contains) {
                if (arrayList.size() > 1) {
                    hx2Var.o.remove(k39Var.f);
                } else {
                    return;
                }
            } else {
                arrayList.add(k39Var.f);
                if (hx2Var.o.size() > 7) {
                    hx2Var.o.remove(0);
                }
            }
            hx2Var.P.setSelectedEmojis(hx2Var.o);
            if (reactionsWindow != null) {
                t53 t53Var = reactionsWindow.m;
                hx2Var.P.m(null, null, false);
                if (t53Var != null) {
                    t53Var.setSelectedReactions(hx2Var.o);
                    t53Var.setRecentReactions(hx2Var.P.W);
                }
                reactionsWindow.d();
            }
        }
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final boolean s() {
        return false;
    }

    @Override
    public final void o() {
    }

    @Override
    public final void m(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
    }
}
