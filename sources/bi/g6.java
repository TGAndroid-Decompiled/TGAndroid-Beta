package bi;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class g6 extends v4.w {
    public final eq0 d;
    public final k6 f3653e;

    public g6(k6 k6Var, eq0 eq0Var) {
        this.f3653e = k6Var;
        this.d = eq0Var;
    }

    public static TL_stars.SavedStarGift s(v4.f1 f1Var) {
        View view = f1Var.f59122a;
        if (view instanceof c3) {
            return ((c3) view).getSavedGift();
        }
        return null;
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.f1 f1Var) {
        super.a(recyclerView, f1Var);
        f1Var.f59122a.setPressed(false);
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
        return this.f3653e.h;
    }

    @Override
    public final boolean k() {
        return this.f3653e.h;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.f1 f1Var, v4.f1 f1Var2) {
        di.t0 t0Var;
        k6 k6Var = this.f3653e;
        d6 d6Var = k6Var.f3817f;
        if (k6Var.f3816e != null && k6Var.h && r(s(f1Var)) && r(s(f1Var2))) {
            int b10 = f1Var.b();
            int b11 = f1Var2.b();
            int indexOf = k6Var.f3816e.f9470l.indexOf(s(f1Var));
            int indexOf2 = k6Var.f3816e.f9470l.indexOf(s(f1Var2));
            if (indexOf >= 0 && indexOf2 >= 0) {
                boolean z10 = k6Var.d;
                eq0 eq0Var = this.d;
                if (z10) {
                    k6Var.f3816e.n(indexOf, indexOf2);
                    eq0Var.f4006e.n(k6Var.f3816e.d);
                } else {
                    di.o8 o8Var = k6Var.f3816e;
                    if (o8Var.f9475q == null) {
                        o8Var.f9475q = o8Var.i();
                    }
                    o8Var.n(indexOf, indexOf2);
                }
                d6Var.f34607g3.j(b10, b11);
                d6Var.f34607g3.T();
                if (k6Var.d) {
                    HashMap hashMap = q6.V;
                    eq0Var.f(true);
                }
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if ((T instanceof ProfileActivity) && (t0Var = ((ProfileActivity) T).f43663w0) != null) {
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
        k6 k6Var = this.f3653e;
        if (i7 == 0) {
            di.o8 o8Var = k6Var.f3816e;
            if (o8Var != null) {
                ArrayList arrayList = o8Var.f9475q;
                if (arrayList != null) {
                    ArrayList i10 = o8Var.i();
                    if (arrayList.size() == i10.size()) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            if (arrayList.get(i11) == i10.get(i11)) {
                            }
                        }
                    }
                    o8Var.p();
                    o8Var.f9475q = null;
                    return;
                }
                o8Var.f9475q = null;
                return;
            }
            return;
        }
        d6 d6Var = k6Var.f3817f;
        if (d6Var != null) {
            d6Var.I0(false);
        }
        if (f1Var != null) {
            f1Var.f59122a.setPressed(true);
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        k6 k6Var = this.f3653e;
        if (k6Var.h) {
            if (k6Var.f3816e == this.d.d) {
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
