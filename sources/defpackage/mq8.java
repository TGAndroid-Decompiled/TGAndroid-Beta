package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class mq8 extends fs5 {
    public final lca e;
    public final pq8 f;

    public mq8(pq8 pq8Var, lca lcaVar) {
        this.f = pq8Var;
        this.e = lcaVar;
    }

    public static TL_stars.SavedStarGift v(s49 s49Var) {
        View view = s49Var.a;
        if (view instanceof nv4) {
            return ((nv4) view).getSavedGift();
        }
        return null;
    }

    @Override
    public final void a(RecyclerView recyclerView, s49 s49Var) {
        super.a(recyclerView, s49Var);
        s49Var.a.setPressed(false);
    }

    @Override
    public final int f(RecyclerView recyclerView, s49 s49Var) {
        if (u(v(s49Var))) {
            return fs5.m(15, 0);
        }
        return fs5.m(0, 0);
    }

    @Override
    public final boolean k() {
        return this.f.h;
    }

    @Override
    public final boolean l() {
        return this.f.h;
    }

    @Override
    public final boolean o(RecyclerView recyclerView, s49 s49Var, s49 s49Var2) {
        vq8 vq8Var;
        pq8 pq8Var = this.f;
        va vaVar = pq8Var.f;
        if (pq8Var.e != null && pq8Var.h && u(v(s49Var)) && u(v(s49Var2))) {
            int b = s49Var.b();
            int b2 = s49Var2.b();
            int indexOf = pq8Var.e.l.indexOf(v(s49Var));
            int indexOf2 = pq8Var.e.l.indexOf(v(s49Var2));
            if (indexOf >= 0 && indexOf2 >= 0) {
                boolean z = pq8Var.d;
                xsa xsaVar = pq8Var.e;
                lca lcaVar = this.e;
                if (z) {
                    xsaVar.n(indexOf, indexOf2);
                    lcaVar.e.n(pq8Var.e.d);
                } else {
                    if (xsaVar.q == null) {
                        xsaVar.q = xsaVar.i();
                    }
                    xsaVar.n(indexOf, indexOf2);
                }
                vaVar.g3.j(b, b2);
                vaVar.g3.T();
                if (pq8Var.d) {
                    HashMap hashMap = tq8.V;
                    lcaVar.f(true);
                }
                d S = LaunchActivity.S();
                if ((S instanceof ProfileActivity) && (vq8Var = ((ProfileActivity) S).w0) != null) {
                    vq8Var.a();
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void q(s49 s49Var, int i) {
        pq8 pq8Var = this.f;
        if (i == 0) {
            xsa xsaVar = pq8Var.e;
            if (xsaVar != null) {
                ArrayList arrayList = xsaVar.q;
                if (arrayList != null) {
                    ArrayList i2 = xsaVar.i();
                    if (arrayList.size() == i2.size()) {
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            if (arrayList.get(i3) == i2.get(i3)) {
                            }
                        }
                    }
                    xsaVar.p();
                    xsaVar.q = null;
                    return;
                }
                xsaVar.q = null;
                return;
            }
            return;
        }
        va vaVar = pq8Var.f;
        if (vaVar != null) {
            vaVar.J0(false);
        }
        if (s49Var != null) {
            s49Var.a.setPressed(true);
        }
    }

    public final boolean u(TL_stars.SavedStarGift savedStarGift) {
        pq8 pq8Var = this.f;
        if (pq8Var.h) {
            if (pq8Var.e == this.e.d) {
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
    public final void r(s49 s49Var) {
    }
}
