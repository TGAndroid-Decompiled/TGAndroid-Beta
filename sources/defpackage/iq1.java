package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;
public final class iq1 extends qt7 {
    public final int c;
    public final SparseArray d;
    public final boolean e;
    public final List f;
    public final k47 g;
    public final p19 h;
    public final k47 i;
    public final SparseIntArray j;
    public final int k;
    public final ggc l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout m;
    public final int[] n;
    public final int o;
    public final yv1 p;

    public iq1(yv1 yv1Var, int i, SparseArray sparseArray, boolean z, List list, k47 k47Var, p19 p19Var, k47 k47Var2, SparseIntArray sparseIntArray, int i2, ggc ggcVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i3) {
        this.p = yv1Var;
        this.c = i;
        this.d = sparseArray;
        this.e = z;
        this.f = list;
        this.g = k47Var;
        this.h = p19Var;
        this.i = k47Var2;
        this.j = sparseIntArray;
        this.k = i2;
        this.l = ggcVar;
        this.m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.n = iArr;
        this.o = i3;
    }

    @Override
    public final void a(ggc ggcVar, Object obj) {
        ggcVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.c;
    }

    @Override
    public final Object e(ggc ggcVar, int i) {
        int i2;
        TLRPC.ReactionCount reactionCount;
        int i3;
        SparseArray sparseArray = this.d;
        View view = (View) sparseArray.get(i);
        if (view != null) {
            ggcVar.addView(view);
            return view;
        }
        if (this.e) {
            i2 = i - 1;
        } else {
            i2 = i;
        }
        if (i2 >= 0) {
            reactionCount = (TLRPC.ReactionCount) this.f.get(i2);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = ggcVar.getContext();
        yv1 yv1Var = this.p;
        wv1 wv1Var = yv1Var.Ba;
        i3 = ((d) yv1Var).currentAccount;
        c29 c29Var = new c29(context, wv1Var, i3, this.g, reactionCount2, true);
        p19 p19Var = this.h;
        c29Var.d(p19Var.getSeenUsers());
        c29Var.H = new cd1(this, (byte) 8);
        c29Var.F = new g11(this, this.i, (byte) 16);
        c29Var.E = new pn0(this.j, i, this.k, this.l, this.m, this.n);
        if (i2 < 0) {
            c29Var.setPredictiveCount(this.o);
            p19Var.setSeenCallback(new gx(c29Var, (byte) 3));
        }
        ggcVar.addView(c29Var);
        sparseArray.put(i, c29Var);
        return c29Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
