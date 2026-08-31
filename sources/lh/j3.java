package lh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import mh.l7;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.pr0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class j3 extends f2.b0 {
    public final pr0 d;
    public final n3 f12821e;

    public j3(n3 n3Var, pr0 pr0Var) {
        this.f12821e = n3Var;
        this.d = pr0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.m1 m1Var) {
        super.a(recyclerView, m1Var);
        m1Var.f5875a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.m1 m1Var) {
        TL_stars.SavedStarGift savedStarGift;
        View view = m1Var.f5875a;
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
        return this.f12821e.f12865n;
    }

    @Override
    public final boolean k() {
        return this.f12821e.f12865n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.m1 m1Var, f2.m1 m1Var2) {
        TL_stars.SavedStarGift savedStarGift;
        mh.t0 t0Var;
        n3 n3Var = this.f12821e;
        h3 h3Var = n3Var.f12864f;
        if (n3Var.f12863e != null && n3Var.f12865n) {
            View view = m1Var.f5875a;
            TL_stars.SavedStarGift savedStarGift2 = null;
            if (view instanceof x1) {
                savedStarGift = ((x1) view).getSavedGift();
            } else {
                savedStarGift = null;
            }
            if (r(savedStarGift)) {
                View view2 = m1Var2.f5875a;
                if (view2 instanceof x1) {
                    savedStarGift2 = ((x1) view2).getSavedGift();
                }
                if (r(savedStarGift2)) {
                    int b10 = m1Var.b();
                    int b11 = m1Var2.b();
                    boolean z4 = n3Var.d;
                    pr0 pr0Var = this.d;
                    if (z4) {
                        n3Var.f12863e.k(b10, b11);
                        pr0Var.f13101e.n(n3Var.f12863e.d);
                    } else {
                        l7 l7Var = n3Var.f12863e;
                        if (l7Var.f14410q == null) {
                            l7Var.f14410q = l7Var.h();
                        }
                        l7Var.k(b10, b11);
                    }
                    h3Var.V2.p(b10, b11);
                    h3Var.V2.S();
                    if (n3Var.d) {
                        HashMap hashMap = x3.Q;
                        pr0Var.f(true);
                    }
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if ((U instanceof ProfileActivity) && (t0Var = ((ProfileActivity) U).f34689s0) != null) {
                        t0Var.a();
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
    public final void p(f2.m1 m1Var, int i10) {
        n3 n3Var = this.f12821e;
        if (i10 == 0) {
            l7 l7Var = n3Var.f12863e;
            if (l7Var != null) {
                ArrayList arrayList = l7Var.f14410q;
                if (arrayList != null) {
                    ArrayList h = l7Var.h();
                    if (arrayList.size() == h.size()) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            if (arrayList.get(i11) == h.get(i11)) {
                            }
                        }
                    }
                    l7Var.l();
                    l7Var.f14410q = null;
                    return;
                }
                l7Var.f14410q = null;
                return;
            }
            return;
        }
        h3 h3Var = n3Var.f12864f;
        if (h3Var != null) {
            h3Var.I0(false);
        }
        if (m1Var != null) {
            m1Var.f5875a.setPressed(true);
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        n3 n3Var = this.f12821e;
        if (n3Var.f12865n) {
            if (n3Var.f12863e == this.d.d) {
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
    public final void q(f2.m1 m1Var) {
    }
}
