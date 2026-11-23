package bi;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class l6 extends v4.w {
    public final fq0 d;
    public final p6 f3807e;

    public l6(p6 p6Var, fq0 fq0Var) {
        this.f3807e = p6Var;
        this.d = fq0Var;
    }

    public static TL_stars.SavedStarGift s(v4.f1 f1Var) {
        View view = f1Var.f59245a;
        if (view instanceof i3) {
            return ((i3) view).getSavedGift();
        }
        return null;
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.f1 f1Var) {
        super.a(recyclerView, f1Var);
        f1Var.f59245a.setPressed(false);
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
        return this.f3807e.h;
    }

    @Override
    public final boolean k() {
        return this.f3807e.h;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.f1 f1Var, v4.f1 f1Var2) {
        di.t0 t0Var;
        p6 p6Var = this.f3807e;
        i6 i6Var = p6Var.f3970f;
        if (p6Var.f3969e != null && p6Var.h && r(s(f1Var)) && r(s(f1Var2))) {
            int b10 = f1Var.b();
            int b11 = f1Var2.b();
            int indexOf = p6Var.f3969e.f9513l.indexOf(s(f1Var));
            int indexOf2 = p6Var.f3969e.f9513l.indexOf(s(f1Var2));
            if (indexOf >= 0 && indexOf2 >= 0) {
                boolean z10 = p6Var.d;
                fq0 fq0Var = this.d;
                if (z10) {
                    p6Var.f3969e.n(indexOf, indexOf2);
                    fq0Var.f4151e.n(p6Var.f3969e.d);
                } else {
                    di.p8 p8Var = p6Var.f3969e;
                    if (p8Var.f9518q == null) {
                        p8Var.f9518q = p8Var.i();
                    }
                    p8Var.n(indexOf, indexOf2);
                }
                i6Var.f35323g3.j(b10, b11);
                i6Var.f35323g3.T();
                if (p6Var.d) {
                    HashMap hashMap = v6.V;
                    fq0Var.f(true);
                }
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if ((T instanceof ProfileActivity) && (t0Var = ((ProfileActivity) T).f43789w0) != null) {
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
        p6 p6Var = this.f3807e;
        if (i7 == 0) {
            di.p8 p8Var = p6Var.f3969e;
            if (p8Var != null) {
                ArrayList arrayList = p8Var.f9518q;
                if (arrayList != null) {
                    ArrayList i10 = p8Var.i();
                    if (arrayList.size() == i10.size()) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            if (arrayList.get(i11) == i10.get(i11)) {
                            }
                        }
                    }
                    p8Var.p();
                    p8Var.f9518q = null;
                    return;
                }
                p8Var.f9518q = null;
                return;
            }
            return;
        }
        i6 i6Var = p6Var.f3970f;
        if (i6Var != null) {
            i6Var.I0(false);
        }
        if (f1Var != null) {
            f1Var.f59245a.setPressed(true);
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        p6 p6Var = this.f3807e;
        if (p6Var.h) {
            if (p6Var.f3969e == this.d.d) {
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
