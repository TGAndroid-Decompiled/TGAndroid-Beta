package bi;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import di.m8;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class y3 extends v4.v {
    public final wp0 d;
    public final c4 f4012e;

    public y3(c4 c4Var, wp0 wp0Var) {
        this.f4012e = c4Var;
        this.d = wp0Var;
    }

    public static TL_stars.SavedStarGift s(v4.e1 e1Var) {
        View view = e1Var.f58535a;
        if (view instanceof i2) {
            return ((i2) view).getSavedGift();
        }
        return null;
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.e1 e1Var) {
        super.a(recyclerView, e1Var);
        e1Var.f58535a.setPressed(false);
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
        return this.f4012e.h;
    }

    @Override
    public final boolean k() {
        return this.f4012e.h;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.e1 e1Var, v4.e1 e1Var2) {
        di.u0 u0Var;
        c4 c4Var = this.f4012e;
        v3 v3Var = c4Var.f3413f;
        if (c4Var.f3412e != null && c4Var.h && r(s(e1Var)) && r(s(e1Var2))) {
            int b10 = e1Var.b();
            int b11 = e1Var2.b();
            int indexOf = c4Var.f3412e.f9051l.indexOf(s(e1Var));
            int indexOf2 = c4Var.f3412e.f9051l.indexOf(s(e1Var2));
            if (indexOf >= 0 && indexOf2 >= 0) {
                boolean z10 = c4Var.d;
                wp0 wp0Var = this.d;
                if (z10) {
                    c4Var.f3412e.m(indexOf, indexOf2);
                    wp0Var.f3610e.n(c4Var.f3412e.d);
                } else {
                    m8 m8Var = c4Var.f3412e;
                    if (m8Var.f9056q == null) {
                        m8Var.f9056q = m8Var.i();
                    }
                    m8Var.m(indexOf, indexOf2);
                }
                v3Var.f39895g3.j(b10, b11);
                v3Var.f39895g3.T();
                if (c4Var.d) {
                    HashMap hashMap = i4.V;
                    wp0Var.f(true);
                }
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if ((T instanceof ProfileActivity) && (u0Var = ((ProfileActivity) T).f43217w0) != null) {
                    u0Var.a();
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(v4.e1 e1Var, int i7) {
        c4 c4Var = this.f4012e;
        if (i7 == 0) {
            m8 m8Var = c4Var.f3412e;
            if (m8Var != null) {
                ArrayList arrayList = m8Var.f9056q;
                if (arrayList != null) {
                    ArrayList i10 = m8Var.i();
                    if (arrayList.size() == i10.size()) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            if (arrayList.get(i11) == i10.get(i11)) {
                            }
                        }
                    }
                    m8Var.n();
                    m8Var.f9056q = null;
                    return;
                }
                m8Var.f9056q = null;
                return;
            }
            return;
        }
        v3 v3Var = c4Var.f3413f;
        if (v3Var != null) {
            v3Var.I0(false);
        }
        if (e1Var != null) {
            e1Var.f58535a.setPressed(true);
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        c4 c4Var = this.f4012e;
        if (c4Var.h) {
            if (c4Var.f3412e == this.d.d) {
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
