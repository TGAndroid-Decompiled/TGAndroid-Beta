package gh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import hh.m7;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

public final class p3 extends f2.c0 {
    public final wq0 d;

    public final t3 f7496e;

    public p3(t3 t3Var, wq0 wq0Var) {
        this.f7496e = t3Var;
        this.d = wq0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.o1 o1Var) {
        super.a(recyclerView, o1Var);
        o1Var.f5789a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.o1 o1Var) {
        View view = o1Var.f5789a;
        return r(view instanceof b2 ? ((b2) view).getSavedGift() : null) ? f2.c0.l(15, 0) : f2.c0.l(0, 0);
    }

    @Override
    public final boolean j() {
        return this.f7496e.f7538n;
    }

    @Override
    public final boolean k() {
        return this.f7496e.f7538n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.o1 o1Var, f2.o1 o1Var2) {
        hh.v0 v0Var;
        t3 t3Var = this.f7496e;
        n3 n3Var = t3Var.f7537f;
        if (t3Var.f7536e == null || !t3Var.f7538n) {
            return false;
        }
        View view = o1Var.f5789a;
        if (!r(view instanceof b2 ? ((b2) view).getSavedGift() : null)) {
            return false;
        }
        View view2 = o1Var2.f5789a;
        if (!r(view2 instanceof b2 ? ((b2) view2).getSavedGift() : null)) {
            return false;
        }
        int iB = o1Var.b();
        int iB2 = o1Var2.b();
        boolean z10 = t3Var.d;
        wq0 wq0Var = this.d;
        if (z10) {
            t3Var.f7536e.k(iB, iB2);
            wq0Var.f7200e.n(t3Var.f7536e.d);
        } else {
            m7 m7Var = t3Var.f7536e;
            if (m7Var.f9758q == null) {
                m7Var.f9758q = m7Var.h();
            }
            m7Var.k(iB, iB2);
        }
        n3Var.U2.p(iB, iB2);
        n3Var.U2.S();
        if (t3Var.d) {
            HashMap map = d4.P;
            wq0Var.f(true);
        }
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        if ((n2VarU instanceof ProfileActivity) && (v0Var = ((ProfileActivity) n2VarU).f36041r0) != null) {
            v0Var.a();
        }
        return true;
    }

    @Override
    public final void p(f2.o1 o1Var, int i10) {
        t3 t3Var = this.f7496e;
        if (i10 != 0) {
            n3 n3Var = t3Var.f7537f;
            if (n3Var != null) {
                n3Var.I0(false);
            }
            if (o1Var != null) {
                o1Var.f5789a.setPressed(true);
                return;
            }
            return;
        }
        m7 m7Var = t3Var.f7536e;
        if (m7Var != null) {
            ArrayList arrayList = m7Var.f9758q;
            if (arrayList != null) {
                ArrayList arrayListH = m7Var.h();
                if (arrayList.size() == arrayListH.size()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) == arrayListH.get(i11)) {
                        }
                    }
                }
                m7Var.l();
                m7Var.f9758q = null;
                return;
            }
            m7Var.f9758q = null;
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        t3 t3Var = this.f7496e;
        if (!t3Var.f7538n) {
            return false;
        }
        if (t3Var.f7536e == this.d.d) {
            return savedStarGift != null && savedStarGift.pinned_to_top;
        }
        return true;
    }

    @Override
    public final void q(f2.o1 o1Var) {
    }
}
