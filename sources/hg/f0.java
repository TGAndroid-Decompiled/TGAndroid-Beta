package hg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.yl0;
public final class f0 extends ul0 {
    public final ArrayList f10287r;
    public final int f10288s;
    public final Context v;
    public final i0 f10289w;

    public f0(i0 i0Var, Context context) {
        this.f10289w = i0Var;
        ArrayList arrayList = new ArrayList();
        this.f10287r = arrayList;
        int i10 = UserConfig.selectedAccount;
        this.f10288s = i10;
        this.v = context;
        arrayList.addAll(b2.f(i10).e());
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(yl0 yl0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        if (i10 != 0 && i10 != 2) {
            return this.f10287r.size();
        }
        return 1;
    }

    @Override
    public final Object O(int i10, int i11) {
        if (i10 != 0 && i11 >= 0) {
            ArrayList arrayList = this.f10287r;
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
        if (i10 != 0 && i10 != 2 && i11 < this.f10287r.size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.c1 c1Var) {
        if (c1Var.f42998f == 0) {
            x1 x1Var = (x1) c1Var.f42995a;
            Object O = O(i10, i11);
            boolean z10 = true;
            if (i10 == 1 && i11 == M(i10) - 1) {
                z10 = false;
            }
            if (O instanceof a2) {
                a2 a2Var = (a2) O;
                x1Var.a(a2Var, null, z10);
                x1Var.d.a(this.f10289w.f10314w.contains(Integer.valueOf(a2Var.f10223a)), false);
            }
        }
    }

    @Override
    public final void l() {
        ArrayList arrayList = this.f10287r;
        arrayList.clear();
        arrayList.addAll(b2.f(this.f10288s).e());
        X(false);
        this.f10289w.L();
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
            x1Var = new x1(context, this.f10289w.f26785a, false);
        }
        return new s4.c1(x1Var);
    }
}
