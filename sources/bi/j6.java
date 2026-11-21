package bi;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class j6 extends v4.w {
    public final gq0 d;
    public final n6 f3751e;

    public j6(n6 n6Var, gq0 gq0Var) {
        this.f3751e = n6Var;
        this.d = gq0Var;
    }

    public static TL_stars.SavedStarGift s(v4.f1 f1Var) {
        View view = f1Var.f59161a;
        if (view instanceof g3) {
            return ((g3) view).getSavedGift();
        }
        return null;
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.f1 f1Var) {
        super.a(recyclerView, f1Var);
        f1Var.f59161a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, v4.f1 f1Var) {
        if (r(s(f1Var))) {
            return v4.w.l(15, 0);
        }
        return v4.w.l(0, 0);
    }

    @Override
    public final boolean j() {
        return this.f3751e.h;
    }

    @Override
    public final boolean k() {
        return this.f3751e.h;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.f1 f1Var, v4.f1 f1Var2) {
        di.t0 t0Var;
        n6 n6Var = this.f3751e;
        g6 g6Var = n6Var.f3948f;
        if (n6Var.f3947e != null && n6Var.h && r(s(f1Var)) && r(s(f1Var2))) {
            int b10 = f1Var.b();
            int b11 = f1Var2.b();
            int indexOf = n6Var.f3947e.f9549l.indexOf(s(f1Var));
            int indexOf2 = n6Var.f3947e.f9549l.indexOf(s(f1Var2));
            if (indexOf >= 0 && indexOf2 >= 0) {
                boolean z10 = n6Var.d;
                gq0 gq0Var = this.d;
                if (z10) {
                    n6Var.f3947e.n(indexOf, indexOf2);
                    gq0Var.f4117e.n(n6Var.f3947e.d);
                } else {
                    di.p8 p8Var = n6Var.f3947e;
                    if (p8Var.f9554q == null) {
                        p8Var.f9554q = p8Var.i();
                    }
                    p8Var.n(indexOf, indexOf2);
                }
                g6Var.f35796g3.j(b10, b11);
                g6Var.f35796g3.T();
                if (n6Var.d) {
                    HashMap hashMap = t6.V;
                    gq0Var.f(true);
                }
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if ((T instanceof ProfileActivity) && (t0Var = ((ProfileActivity) T).f43704w0) != null) {
                    t0Var.a();
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(v4.f1 f1Var, int i7) {
        n6 n6Var = this.f3751e;
        if (i7 == 0) {
            di.p8 p8Var = n6Var.f3947e;
            if (p8Var != null) {
                ArrayList arrayList = p8Var.f9554q;
                if (arrayList != null) {
                    ArrayList i10 = p8Var.i();
                    if (arrayList.size() == i10.size()) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            if (arrayList.get(i11) == i10.get(i11)) {
                            }
                        }
                    }
                    p8Var.p();
                    p8Var.f9554q = null;
                    return;
                }
                p8Var.f9554q = null;
                return;
            }
            return;
        }
        g6 g6Var = n6Var.f3948f;
        if (g6Var != null) {
            g6Var.I0(false);
        }
        if (f1Var != null) {
            f1Var.f59161a.setPressed(true);
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        n6 n6Var = this.f3751e;
        if (n6Var.h) {
            if (n6Var.f3947e == this.d.d) {
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
    public final void q(v4.f1 f1Var) {
    }
}
