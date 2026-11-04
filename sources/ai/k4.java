package ai;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ci.v8;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class k4 extends u4.v {
    public final vp0 d;
    public final o4 f765e;

    public k4(o4 o4Var, vp0 vp0Var) {
        this.f765e = o4Var;
        this.d = vp0Var;
    }

    public static TL_stars.SavedStarGift s(u4.d1 d1Var) {
        View view = d1Var.f55540a;
        if (view instanceof q2) {
            return ((q2) view).getSavedGift();
        }
        return null;
    }

    @Override
    public final void a(RecyclerView recyclerView, u4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.f55540a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, u4.d1 d1Var) {
        if (r(s(d1Var))) {
            return u4.v.l(15, 0);
        }
        return u4.v.l(0, 0);
    }

    @Override
    public final boolean j() {
        return this.f765e.h;
    }

    @Override
    public final boolean k() {
        return this.f765e.h;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, u4.d1 d1Var, u4.d1 d1Var2) {
        ci.z0 z0Var;
        o4 o4Var = this.f765e;
        h4 h4Var = o4Var.f860f;
        if (o4Var.f859e != null && o4Var.h && r(s(d1Var)) && r(s(d1Var2))) {
            int b10 = d1Var.b();
            int b11 = d1Var2.b();
            int indexOf = o4Var.f859e.f6203l.indexOf(s(d1Var));
            int indexOf2 = o4Var.f859e.f6203l.indexOf(s(d1Var2));
            if (indexOf >= 0 && indexOf2 >= 0) {
                boolean z10 = o4Var.d;
                vp0 vp0Var = this.d;
                if (z10) {
                    o4Var.f859e.m(indexOf, indexOf2);
                    vp0Var.f1013e.n(o4Var.f859e.d);
                } else {
                    v8 v8Var = o4Var.f859e;
                    if (v8Var.f6208q == null) {
                        v8Var.f6208q = v8Var.i();
                    }
                    v8Var.m(indexOf, indexOf2);
                }
                h4Var.f35594g3.j(b10, b11);
                h4Var.f35594g3.T();
                if (o4Var.d) {
                    HashMap hashMap = u4.V;
                    vp0Var.f(true);
                }
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if ((T instanceof ProfileActivity) && (z0Var = ((ProfileActivity) T).f41874w0) != null) {
                    z0Var.a();
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(u4.d1 d1Var, int i3) {
        o4 o4Var = this.f765e;
        if (i3 == 0) {
            v8 v8Var = o4Var.f859e;
            if (v8Var != null) {
                ArrayList arrayList = v8Var.f6208q;
                if (arrayList != null) {
                    ArrayList i10 = v8Var.i();
                    if (arrayList.size() == i10.size()) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            if (arrayList.get(i11) == i10.get(i11)) {
                            }
                        }
                    }
                    v8Var.n();
                    v8Var.f6208q = null;
                    return;
                }
                v8Var.f6208q = null;
                return;
            }
            return;
        }
        h4 h4Var = o4Var.f860f;
        if (h4Var != null) {
            h4Var.I0(false);
        }
        if (d1Var != null) {
            d1Var.f55540a.setPressed(true);
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        o4 o4Var = this.f765e;
        if (o4Var.h) {
            if (o4Var.f859e == this.d.d) {
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
    public final void q(u4.d1 d1Var) {
    }
}
