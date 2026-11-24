package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;
public final class vo1 extends pr7 {
    public final int c;
    public final SparseArray d;
    public final boolean e;
    public final List f;
    public final k27 g;
    public final oz8 h;
    public final k27 i;
    public final SparseIntArray j;
    public final int k;
    public final gec l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout m;
    public final int[] n;
    public final int o;
    public final mu1 p;

    public vo1(mu1 mu1Var, int i, SparseArray sparseArray, boolean z, List list, k27 k27Var, oz8 oz8Var, k27 k27Var2, SparseIntArray sparseIntArray, int i2, gec gecVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i3) {
        this.p = mu1Var;
        this.c = i;
        this.d = sparseArray;
        this.e = z;
        this.f = list;
        this.g = k27Var;
        this.h = oz8Var;
        this.i = k27Var2;
        this.j = sparseIntArray;
        this.k = i2;
        this.l = gecVar;
        this.m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.n = iArr;
        this.o = i3;
    }

    @Override
    public final void a(gec gecVar, Object obj) {
        gecVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.c;
    }

    @Override
    public final Object e(gec gecVar, int i) {
        int i2;
        TLRPC.ReactionCount reactionCount;
        int i3;
        SparseArray sparseArray = this.d;
        View view = (View) sparseArray.get(i);
        if (view != null) {
            gecVar.addView(view);
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
        Context context = gecVar.getContext();
        mu1 mu1Var = this.p;
        ku1 ku1Var = mu1Var.Ba;
        i3 = ((d) mu1Var).currentAccount;
        a09 a09Var = new a09(context, ku1Var, i3, this.g, reactionCount2, true);
        oz8 oz8Var = this.h;
        a09Var.d(oz8Var.getSeenUsers());
        a09Var.H = new rh1(this, (byte) 5);
        a09Var.F = new q31(this, this.i, (byte) 15);
        a09Var.E = new pm0(this.j, i, this.k, this.l, this.m, this.n);
        if (i2 < 0) {
            a09Var.setPredictiveCount(this.o);
            oz8Var.setSeenCallback(new gw(a09Var, (byte) 3));
        }
        gecVar.addView(a09Var);
        sparseArray.put(i, a09Var);
        return a09Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
