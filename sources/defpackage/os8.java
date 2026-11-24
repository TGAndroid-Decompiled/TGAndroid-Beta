package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class os8 extends eu5 {
    public final lea e;
    public final rs8 f;

    public os8(rs8 rs8Var, lea leaVar) {
        this.f = rs8Var;
        this.e = leaVar;
    }

    public static TL_stars.SavedStarGift v(u69 u69Var) {
        View view = u69Var.a;
        if (view instanceof ox4) {
            return ((ox4) view).getSavedGift();
        }
        return null;
    }

    @Override
    public final void a(RecyclerView recyclerView, u69 u69Var) {
        super.a(recyclerView, u69Var);
        u69Var.a.setPressed(false);
    }

    @Override
    public final int f(RecyclerView recyclerView, u69 u69Var) {
        if (u(v(u69Var))) {
            return eu5.m(15, 0);
        }
        return eu5.m(0, 0);
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
    public final boolean o(RecyclerView recyclerView, u69 u69Var, u69 u69Var2) {
        xs8 xs8Var;
        rs8 rs8Var = this.f;
        va vaVar = rs8Var.f;
        if (rs8Var.e != null && rs8Var.h && u(v(u69Var)) && u(v(u69Var2))) {
            int b = u69Var.b();
            int b2 = u69Var2.b();
            int indexOf = rs8Var.e.l.indexOf(v(u69Var));
            int indexOf2 = rs8Var.e.l.indexOf(v(u69Var2));
            if (indexOf >= 0 && indexOf2 >= 0) {
                boolean z = rs8Var.d;
                ava avaVar = rs8Var.e;
                lea leaVar = this.e;
                if (z) {
                    avaVar.n(indexOf, indexOf2);
                    leaVar.e.n(rs8Var.e.d);
                } else {
                    if (avaVar.q == null) {
                        avaVar.q = avaVar.i();
                    }
                    avaVar.n(indexOf, indexOf2);
                }
                vaVar.g3.j(b, b2);
                vaVar.g3.T();
                if (rs8Var.d) {
                    HashMap hashMap = vs8.V;
                    leaVar.f(true);
                }
                d S = LaunchActivity.S();
                if ((S instanceof ProfileActivity) && (xs8Var = ((ProfileActivity) S).w0) != null) {
                    xs8Var.a();
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void q(u69 u69Var, int i) {
        rs8 rs8Var = this.f;
        if (i == 0) {
            ava avaVar = rs8Var.e;
            if (avaVar != null) {
                ArrayList arrayList = avaVar.q;
                if (arrayList != null) {
                    ArrayList i2 = avaVar.i();
                    if (arrayList.size() == i2.size()) {
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            if (arrayList.get(i3) == i2.get(i3)) {
                            }
                        }
                    }
                    avaVar.p();
                    avaVar.q = null;
                    return;
                }
                avaVar.q = null;
                return;
            }
            return;
        }
        va vaVar = rs8Var.f;
        if (vaVar != null) {
            vaVar.J0(false);
        }
        if (u69Var != null) {
            u69Var.a.setPressed(true);
        }
    }

    public final boolean u(TL_stars.SavedStarGift savedStarGift) {
        rs8 rs8Var = this.f;
        if (rs8Var.h) {
            if (rs8Var.e == this.e.d) {
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
    public final void r(u69 u69Var) {
    }
}
