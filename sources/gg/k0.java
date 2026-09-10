package gg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.vl0;
public final class k0 extends rl0 {
    public final ArrayList f8923r;
    public final int f8924s;
    public final Context v;
    public final n0 f8925w;

    public k0(n0 n0Var, Context context) {
        this.f8925w = n0Var;
        ArrayList arrayList = new ArrayList();
        this.f8923r = arrayList;
        int i10 = UserConfig.selectedAccount;
        this.f8924s = i10;
        this.v = context;
        arrayList.addAll(k2.f(i10).e());
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(vl0 vl0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        if (i10 != 0 && i10 != 2) {
            return this.f8923r.size();
        }
        return 1;
    }

    @Override
    public final Object O(int i10, int i11) {
        if (i10 != 0 && i11 >= 0) {
            ArrayList arrayList = this.f8923r;
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
        if (i10 != 0 && i10 != 2 && i11 < this.f8923r.size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.c1 c1Var) {
        if (c1Var.f41613f == 0) {
            g2 g2Var = (g2) c1Var.f41610a;
            Object O = O(i10, i11);
            boolean z10 = true;
            if (i10 == 1 && i11 == M(i10) - 1) {
                z10 = false;
            }
            if (O instanceof j2) {
                j2 j2Var = (j2) O;
                g2Var.a(j2Var, null, z10);
                g2Var.d.a(this.f8925w.f8965w.contains(Integer.valueOf(j2Var.f8917a)), false);
            }
        }
    }

    @Override
    public final void l() {
        ArrayList arrayList = this.f8923r;
        arrayList.clear();
        arrayList.addAll(k2.f(this.f8924s).e());
        X(false);
        this.f8925w.L();
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View g2Var;
        Context context = this.v;
        if (i10 != 0) {
            if (i10 != 1) {
                g2Var = new View(context);
                g2Var.setTag(-33024);
            } else {
                g2Var = new View(context);
                g2Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
                g2Var.setTag(-33024);
            }
        } else {
            g2Var = new g2(context, this.f8925w.f26421a, false);
        }
        return new s4.c1(g2Var);
    }
}
