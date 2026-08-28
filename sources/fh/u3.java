package fh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import gh.n7;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class u3 extends f2.d0 {
    public final vq0 d;
    public final y3 f6784e;

    public u3(y3 y3Var, vq0 vq0Var) {
        this.f6784e = y3Var;
        this.d = vq0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.q1 q1Var) {
        super.a(recyclerView, q1Var);
        q1Var.f5501a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.q1 q1Var) {
        TL_stars.SavedStarGift savedStarGift;
        View view = q1Var.f5501a;
        if (view instanceof f2) {
            savedStarGift = ((f2) view).getSavedGift();
        } else {
            savedStarGift = null;
        }
        if (r(savedStarGift)) {
            return f2.d0.l(15, 0);
        }
        return f2.d0.l(0, 0);
    }

    @Override
    public final boolean j() {
        return this.f6784e.f6885n;
    }

    @Override
    public final boolean k() {
        return this.f6784e.f6885n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.q1 q1Var, f2.q1 q1Var2) {
        TL_stars.SavedStarGift savedStarGift;
        gh.v0 v0Var;
        y3 y3Var = this.f6784e;
        s3 s3Var = y3Var.f6884f;
        if (y3Var.f6883e != null && y3Var.f6885n) {
            View view = q1Var.f5501a;
            TL_stars.SavedStarGift savedStarGift2 = null;
            if (view instanceof f2) {
                savedStarGift = ((f2) view).getSavedGift();
            } else {
                savedStarGift = null;
            }
            if (r(savedStarGift)) {
                View view2 = q1Var2.f5501a;
                if (view2 instanceof f2) {
                    savedStarGift2 = ((f2) view2).getSavedGift();
                }
                if (r(savedStarGift2)) {
                    int b10 = q1Var.b();
                    int b11 = q1Var2.b();
                    boolean z10 = y3Var.d;
                    vq0 vq0Var = this.d;
                    if (z10) {
                        y3Var.f6883e.k(b10, b11);
                        vq0Var.f6548e.n(y3Var.f6883e.d);
                    } else {
                        n7 n7Var = y3Var.f6883e;
                        if (n7Var.f8630q == null) {
                            n7Var.f8630q = n7Var.h();
                        }
                        n7Var.k(b10, b11);
                    }
                    s3Var.U2.p(b10, b11);
                    s3Var.U2.S();
                    if (y3Var.d) {
                        HashMap hashMap = j4.P;
                        vq0Var.f(true);
                    }
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if ((U instanceof ProfileActivity) && (v0Var = ((ProfileActivity) U).f36038r0) != null) {
                        v0Var.a();
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
    public final void p(f2.q1 q1Var, int i9) {
        y3 y3Var = this.f6784e;
        if (i9 == 0) {
            n7 n7Var = y3Var.f6883e;
            if (n7Var != null) {
                ArrayList arrayList = n7Var.f8630q;
                if (arrayList != null) {
                    ArrayList h = n7Var.h();
                    if (arrayList.size() == h.size()) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            if (arrayList.get(i10) == h.get(i10)) {
                            }
                        }
                    }
                    n7Var.l();
                    n7Var.f8630q = null;
                    return;
                }
                n7Var.f8630q = null;
                return;
            }
            return;
        }
        s3 s3Var = y3Var.f6884f;
        if (s3Var != null) {
            s3Var.I0(false);
        }
        if (q1Var != null) {
            q1Var.f5501a.setPressed(true);
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        y3 y3Var = this.f6784e;
        if (y3Var.f6885n) {
            if (y3Var.f6883e == this.d.d) {
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
    public final void q(f2.q1 q1Var) {
    }
}
