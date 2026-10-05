package hg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.zl0;
public final class g0 extends ul0 {
    public final ArrayList f11195r;
    public final int f11196s;
    public final Context v;
    public final j0 f11197w;

    public g0(j0 j0Var, Context context) {
        this.f11197w = j0Var;
        ArrayList arrayList = new ArrayList();
        this.f11195r = arrayList;
        int i10 = UserConfig.selectedAccount;
        this.f11196s = i10;
        this.v = context;
        arrayList.addAll(b2.f(i10).e());
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(zl0 zl0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        if (i10 != 0 && i10 != 2) {
            return this.f11195r.size();
        }
        return 1;
    }

    @Override
    public final Object O(int i10, int i11) {
        if (i10 != 0 && i11 >= 0) {
            ArrayList arrayList = this.f11195r;
            if (i11 < arrayList.size()) {
                return arrayList.get(i11);
            }
        }
        return null;
    }

    @Override
    public final int P(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        return 0;
    }

    @Override
    public final int R() {
        return 3;
    }

    @Override
    public final View T(int i10, View view) {
        return null;
    }

    @Override
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        if (i10 != 0 && i10 != 2 && i11 < this.f11195r.size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.c1 c1Var) {
        if (c1Var.f46542f == 0) {
            x1 x1Var = (x1) c1Var.f46538a;
            Object O = O(i10, i11);
            boolean z10 = true;
            if (i10 == 1 && i11 == M(i10) - 1) {
                z10 = false;
            }
            if (O instanceof a2) {
                a2 a2Var = (a2) O;
                x1Var.a(a2Var, null, z10);
                x1Var.d.a(this.f11197w.f11225w.contains(Integer.valueOf(a2Var.f11104a)), false);
            }
        }
    }

    @Override
    public final void l() {
        ArrayList arrayList = this.f11195r;
        arrayList.clear();
        arrayList.addAll(b2.f(this.f11196s).e());
        X(false);
        this.f11197w.J();
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View x1Var;
        Context context = this.v;
        if (i10 != 0) {
            if (i10 != 1) {
                x1Var = new View(context);
                x1Var.setTag(-33024);
            } else {
                x1Var = new View(context);
                x1Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
                x1Var.setTag(-33024);
            }
        } else {
            x1Var = new x1(context, this.f11197w.f29740a, false);
        }
        return new s4.c1(x1Var);
    }
}
