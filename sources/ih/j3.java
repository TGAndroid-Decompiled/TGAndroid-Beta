package ih;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import jh.k7;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class j3 extends f2.b0 {
    public final gr0 d;
    public final n3 f9252e;

    public j3(n3 n3Var, gr0 gr0Var) {
        this.f9252e = n3Var;
        this.d = gr0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.n1 n1Var) {
        super.a(recyclerView, n1Var);
        n1Var.f6432a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.n1 n1Var) {
        TL_stars.SavedStarGift savedStarGift;
        View view = n1Var.f6432a;
        if (view instanceof y1) {
            savedStarGift = ((y1) view).getSavedGift();
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
        return this.f9252e.f9298n;
    }

    @Override
    public final boolean k() {
        return this.f9252e.f9298n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.n1 n1Var, f2.n1 n1Var2) {
        TL_stars.SavedStarGift savedStarGift;
        jh.u0 u0Var;
        n3 n3Var = this.f9252e;
        h3 h3Var = n3Var.f9297f;
        if (n3Var.f9296e != null && n3Var.f9298n) {
            View view = n1Var.f6432a;
            TL_stars.SavedStarGift savedStarGift2 = null;
            if (view instanceof y1) {
                savedStarGift = ((y1) view).getSavedGift();
            } else {
                savedStarGift = null;
            }
            if (r(savedStarGift)) {
                View view2 = n1Var2.f6432a;
                if (view2 instanceof y1) {
                    savedStarGift2 = ((y1) view2).getSavedGift();
                }
                if (r(savedStarGift2)) {
                    int b10 = n1Var.b();
                    int b11 = n1Var2.b();
                    boolean z10 = n3Var.d;
                    gr0 gr0Var = this.d;
                    if (z10) {
                        n3Var.f9296e.k(b10, b11);
                        gr0Var.f9504e.n(n3Var.f9296e.d);
                    } else {
                        k7 k7Var = n3Var.f9296e;
                        if (k7Var.f12392q == null) {
                            k7Var.f12392q = k7Var.h();
                        }
                        k7Var.k(b10, b11);
                    }
                    h3Var.U2.p(b10, b11);
                    h3Var.U2.S();
                    if (n3Var.d) {
                        HashMap hashMap = x3.P;
                        gr0Var.f(true);
                    }
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if ((U instanceof ProfileActivity) && (u0Var = ((ProfileActivity) U).f36104r0) != null) {
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
    public final void p(f2.n1 n1Var, int i10) {
        n3 n3Var = this.f9252e;
        if (i10 == 0) {
            k7 k7Var = n3Var.f9296e;
            if (k7Var != null) {
                ArrayList arrayList = k7Var.f12392q;
                if (arrayList != null) {
                    ArrayList h = k7Var.h();
                    if (arrayList.size() == h.size()) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            if (arrayList.get(i11) == h.get(i11)) {
                            }
                        }
                    }
                    k7Var.l();
                    k7Var.f12392q = null;
                    return;
                }
                k7Var.f12392q = null;
                return;
            }
            return;
        }
        h3 h3Var = n3Var.f9297f;
        if (h3Var != null) {
            h3Var.I0(false);
        }
        if (n1Var != null) {
            n1Var.f6432a.setPressed(true);
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        n3 n3Var = this.f9252e;
        if (n3Var.f9298n) {
            if (n3Var.f9296e == this.d.d) {
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
    public final void q(f2.n1 n1Var) {
    }
}
