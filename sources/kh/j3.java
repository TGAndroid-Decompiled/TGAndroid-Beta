package kh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import lh.l7;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.or0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class j3 extends f2.b0 {
    public final or0 d;
    public final n3 e;

    public j3(n3 n3Var, or0 or0Var) {
        this.e = n3Var;
        this.d = or0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.l1 l1Var) {
        super.a(recyclerView, l1Var);
        l1Var.f5785a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.l1 l1Var) {
        TL_stars.SavedStarGift savedStarGift;
        View view = l1Var.f5785a;
        if (view instanceof x1) {
            savedStarGift = ((x1) view).getSavedGift();
        } else {
            savedStarGift = null;
        }
        if (r(savedStarGift)) {
            return f2.b0.l(15, 0);
        }
        return f2.b0.l(0, 0);
    }

    @Override
    public final boolean j() {
        return this.e.f10723n;
    }

    @Override
    public final boolean k() {
        return this.e.f10723n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.l1 l1Var, f2.l1 l1Var2) {
        TL_stars.SavedStarGift savedStarGift;
        lh.u0 u0Var;
        n3 n3Var = this.e;
        h3 h3Var = n3Var.f10722f;
        if (n3Var.e != null && n3Var.f10723n) {
            View view = l1Var.f5785a;
            TL_stars.SavedStarGift savedStarGift2 = null;
            if (view instanceof x1) {
                savedStarGift = ((x1) view).getSavedGift();
            } else {
                savedStarGift = null;
            }
            if (r(savedStarGift)) {
                View view2 = l1Var2.f5785a;
                if (view2 instanceof x1) {
                    savedStarGift2 = ((x1) view2).getSavedGift();
                }
                if (r(savedStarGift2)) {
                    int b10 = l1Var.b();
                    int b11 = l1Var2.b();
                    boolean z4 = n3Var.d;
                    or0 or0Var = this.d;
                    if (z4) {
                        n3Var.e.k(b10, b11);
                        or0Var.e.n(n3Var.e.d);
                    } else {
                        l7 l7Var = n3Var.e;
                        if (l7Var.f12777q == null) {
                            l7Var.f12777q = l7Var.h();
                        }
                        l7Var.k(b10, b11);
                    }
                    h3Var.V2.p(b10, b11);
                    h3Var.V2.S();
                    if (n3Var.d) {
                        HashMap hashMap = x3.Q;
                        or0Var.f(true);
                    }
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if ((U instanceof ProfileActivity) && (u0Var = ((ProfileActivity) U).f32156s0) != null) {
                        u0Var.a();
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(f2.l1 l1Var, int i10) {
        n3 n3Var = this.e;
        if (i10 == 0) {
            l7 l7Var = n3Var.e;
            if (l7Var != null) {
                ArrayList arrayList = l7Var.f12777q;
                if (arrayList != null) {
                    ArrayList h = l7Var.h();
                    if (arrayList.size() == h.size()) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            if (arrayList.get(i11) == h.get(i11)) {
                            }
                        }
                    }
                    l7Var.l();
                    l7Var.f12777q = null;
                    return;
                }
                l7Var.f12777q = null;
                return;
            }
            return;
        }
        h3 h3Var = n3Var.f10722f;
        if (h3Var != null) {
            h3Var.I0(false);
        }
        if (l1Var != null) {
            l1Var.f5785a.setPressed(true);
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        n3 n3Var = this.e;
        if (n3Var.f10723n) {
            if (n3Var.e == this.d.d) {
                if (savedStarGift == null || !savedStarGift.pinned_to_top) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void q(f2.l1 l1Var) {
    }
}
