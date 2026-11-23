package bi;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class l6 extends v4.v {
    public final gq0 d;
    public final p6 f3807e;

    public l6(p6 p6Var, gq0 gq0Var) {
        this.f3807e = p6Var;
        this.d = gq0Var;
    }

    public static TL_stars.SavedStarGift s(v4.e1 e1Var) {
        View view = e1Var.f59111a;
        if (view instanceof i3) {
            return ((i3) view).getSavedGift();
        }
        return null;
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.e1 e1Var) {
        super.a(recyclerView, e1Var);
        e1Var.f59111a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, v4.e1 e1Var) {
        if (r(s(e1Var))) {
            return v4.v.l(15, 0);
        }
        return v4.v.l(0, 0);
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
    public final boolean n(RecyclerView recyclerView, v4.e1 e1Var, v4.e1 e1Var2) {
        di.t0 t0Var;
        p6 p6Var = this.f3807e;
        i6 i6Var = p6Var.f3970f;
        if (p6Var.f3969e != null && p6Var.h && r(s(e1Var)) && r(s(e1Var2))) {
            int b10 = e1Var.b();
            int b11 = e1Var2.b();
            int indexOf = p6Var.f3969e.f9515l.indexOf(s(e1Var));
            int indexOf2 = p6Var.f3969e.f9515l.indexOf(s(e1Var2));
            if (indexOf >= 0 && indexOf2 >= 0) {
                boolean z10 = p6Var.d;
                gq0 gq0Var = this.d;
                if (z10) {
                    p6Var.f3969e.n(indexOf, indexOf2);
                    gq0Var.f4151e.n(p6Var.f3969e.d);
                } else {
                    di.p8 p8Var = p6Var.f3969e;
                    if (p8Var.f9520q == null) {
                        p8Var.f9520q = p8Var.i();
                    }
                    p8Var.n(indexOf, indexOf2);
                }
                i6Var.f35742g3.j(b10, b11);
                i6Var.f35742g3.T();
                if (p6Var.d) {
                    HashMap hashMap = v6.V;
                    gq0Var.f(true);
                }
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if ((T instanceof ProfileActivity) && (t0Var = ((ProfileActivity) T).f43673w0) != null) {
                    t0Var.a();
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(v4.e1 e1Var, int i7) {
        p6 p6Var = this.f3807e;
        if (i7 == 0) {
            di.p8 p8Var = p6Var.f3969e;
            if (p8Var != null) {
                ArrayList arrayList = p8Var.f9520q;
                if (arrayList != null) {
                    ArrayList i10 = p8Var.i();
                    if (arrayList.size() == i10.size()) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            if (arrayList.get(i11) == i10.get(i11)) {
                            }
                        }
                    }
                    p8Var.p();
                    p8Var.f9520q = null;
                    return;
                }
                p8Var.f9520q = null;
                return;
            }
            return;
        }
        i6 i6Var = p6Var.f3970f;
        if (i6Var != null) {
            i6Var.I0(false);
        }
        if (e1Var != null) {
            e1Var.f59111a.setPressed(true);
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
    public final void q(v4.e1 e1Var) {
    }
}
