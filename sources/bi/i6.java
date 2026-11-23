package bi;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class i6 extends v4.w {
    public final gq0 d;
    public final m6 f3731e;

    public i6(m6 m6Var, gq0 gq0Var) {
        this.f3731e = m6Var;
        this.d = gq0Var;
    }

    public static TL_stars.SavedStarGift s(v4.f1 f1Var) {
        View view = f1Var.f59165a;
        if (view instanceof g3) {
            return ((g3) view).getSavedGift();
        }
        return null;
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.f1 f1Var) {
        super.a(recyclerView, f1Var);
        f1Var.f59165a.setPressed(false);
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
        return this.f3731e.h;
    }

    @Override
    public final boolean k() {
        return this.f3731e.h;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.f1 f1Var, v4.f1 f1Var2) {
        di.t0 t0Var;
        m6 m6Var = this.f3731e;
        f6 f6Var = m6Var.f3901f;
        if (m6Var.f3900e != null && m6Var.h && r(s(f1Var)) && r(s(f1Var2))) {
            int b10 = f1Var.b();
            int b11 = f1Var2.b();
            int indexOf = m6Var.f3900e.f9552l.indexOf(s(f1Var));
            int indexOf2 = m6Var.f3900e.f9552l.indexOf(s(f1Var2));
            if (indexOf >= 0 && indexOf2 >= 0) {
                boolean z10 = m6Var.d;
                gq0 gq0Var = this.d;
                if (z10) {
                    m6Var.f3900e.n(indexOf, indexOf2);
                    gq0Var.f4094e.n(m6Var.f3900e.d);
                } else {
                    di.p8 p8Var = m6Var.f3900e;
                    if (p8Var.f9557q == null) {
                        p8Var.f9557q = p8Var.i();
                    }
                    p8Var.n(indexOf, indexOf2);
                }
                f6Var.f35789g3.j(b10, b11);
                f6Var.f35789g3.T();
                if (m6Var.d) {
                    HashMap hashMap = s6.V;
                    gq0Var.f(true);
                }
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if ((T instanceof ProfileActivity) && (t0Var = ((ProfileActivity) T).f43708w0) != null) {
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
        m6 m6Var = this.f3731e;
        if (i7 == 0) {
            di.p8 p8Var = m6Var.f3900e;
            if (p8Var != null) {
                ArrayList arrayList = p8Var.f9557q;
                if (arrayList != null) {
                    ArrayList i10 = p8Var.i();
                    if (arrayList.size() == i10.size()) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            if (arrayList.get(i11) == i10.get(i11)) {
                            }
                        }
                    }
                    p8Var.p();
                    p8Var.f9557q = null;
                    return;
                }
                p8Var.f9557q = null;
                return;
            }
            return;
        }
        f6 f6Var = m6Var.f3901f;
        if (f6Var != null) {
            f6Var.I0(false);
        }
        if (f1Var != null) {
            f1Var.f59165a.setPressed(true);
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        m6 m6Var = this.f3731e;
        if (m6Var.h) {
            if (m6Var.f3900e == this.d.d) {
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
