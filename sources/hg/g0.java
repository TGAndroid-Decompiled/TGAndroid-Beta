package hg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.rm0;
public final class g0 extends nm0 {
    public final ArrayList f11242r;
    public final int f11243s;
    public final Context v;
    public final j0 f11244w;

    public g0(j0 j0Var, Context context) {
        this.f11244w = j0Var;
        ArrayList arrayList = new ArrayList();
        this.f11242r = arrayList;
        int i10 = UserConfig.selectedAccount;
        this.f11243s = i10;
        this.v = context;
        arrayList.addAll(c2.f(i10).e());
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(rm0 rm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        if (i10 != 0 && i10 != 2) {
            return this.f11242r.size();
        }
        return 1;
    }

    @Override
    public final Object O(int i10, int i11) {
        if (i10 != 0 && i11 >= 0) {
            ArrayList arrayList = this.f11242r;
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
    public final boolean V(int i10, int i11, s4.d1 d1Var) {
        if (i10 != 0 && i10 != 2 && i11 < this.f11242r.size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.d1 d1Var) {
        if (d1Var.f47706f == 0) {
            y1 y1Var = (y1) d1Var.f47702a;
            Object O = O(i10, i11);
            boolean z10 = true;
            if (i10 == 1 && i11 == M(i10) - 1) {
                z10 = false;
            }
            if (O instanceof b2) {
                b2 b2Var = (b2) O;
                y1Var.a(b2Var, null, z10);
                y1Var.d.a(this.f11244w.f11277w.contains(Integer.valueOf(b2Var.f11174a)), false);
            }
        }
    }

    @Override
    public final void l() {
        ArrayList arrayList = this.f11242r;
        arrayList.clear();
        arrayList.addAll(c2.f(this.f11243s).e());
        X(false);
        this.f11244w.O();
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View y1Var;
        Context context = this.v;
        if (i10 != 0) {
            if (i10 != 1) {
                y1Var = new View(context);
                y1Var.setTag(-33024);
            } else {
                y1Var = new View(context);
                y1Var.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(56.0f)));
                y1Var.setTag(-33024);
            }
        } else {
            y1Var = new y1(context, this.f11244w.f30210a, false);
        }
        return new s4.d1(y1Var);
    }
}
