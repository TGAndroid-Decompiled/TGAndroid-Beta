package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e;
public final class jp1 extends vu7 {
    public final int c;
    public final SparseArray d;
    public final boolean e;
    public final List f;
    public final r47 g;
    public final c39 h;
    public final r47 i;
    public final SparseIntArray j;
    public final int k;
    public final fic l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout m;
    public final int[] n;
    public final int o;
    public final zu1 p;

    public jp1(zu1 zu1Var, int i, SparseArray sparseArray, boolean z, List list, r47 r47Var, c39 c39Var, r47 r47Var2, SparseIntArray sparseIntArray, int i2, fic ficVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i3) {
        this.p = zu1Var;
        this.c = i;
        this.d = sparseArray;
        this.e = z;
        this.f = list;
        this.g = r47Var;
        this.h = c39Var;
        this.i = r47Var2;
        this.j = sparseIntArray;
        this.k = i2;
        this.l = ficVar;
        this.m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.n = iArr;
        this.o = i3;
    }

    @Override
    public final void a(fic ficVar, Object obj) {
        ficVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.c;
    }

    @Override
    public final Object e(fic ficVar, int i) {
        int i2;
        TLRPC.ReactionCount reactionCount;
        int i3;
        SparseArray sparseArray = this.d;
        View view = (View) sparseArray.get(i);
        if (view != null) {
            ficVar.addView(view);
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
        Context context = ficVar.getContext();
        zu1 zu1Var = this.p;
        xu1 xu1Var = zu1Var.Ba;
        i3 = ((e) zu1Var).currentAccount;
        o39 o39Var = new o39(context, xu1Var, i3, this.g, reactionCount2, true);
        c39 c39Var = this.h;
        o39Var.d(c39Var.getSeenUsers());
        o39Var.H = new rd1(this, (byte) 7);
        o39Var.F = new h01(this, this.i, (byte) 16);
        o39Var.E = new qm0(this.j, i, this.k, this.l, this.m, this.n);
        if (i2 < 0) {
            o39Var.setPredictiveCount(this.o);
            c39Var.setSeenCallback(new hw(o39Var, (byte) 3));
        }
        ficVar.addView(o39Var);
        sparseArray.put(i, o39Var);
        return o39Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
