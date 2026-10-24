package ig;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.lm0;
public final class e0 extends hm0 {
    public final ArrayList f12907r;
    public final int f12908s;
    public final Context v;
    public final h0 f12909w;

    public e0(h0 h0Var, Context context) {
        this.f12909w = h0Var;
        ArrayList arrayList = new ArrayList();
        this.f12907r = arrayList;
        int i10 = UserConfig.selectedAccount;
        this.f12908s = i10;
        this.v = context;
        arrayList.addAll(z1.f(i10).e());
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(lm0 lm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        if (i10 != 0 && i10 != 2) {
            return this.f12907r.size();
        }
        return 1;
    }

    @Override
    public final Object O(int i10, int i11) {
        if (i10 != 0 && i11 >= 0) {
            ArrayList arrayList = this.f12907r;
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
    public final boolean V(int i10, int i11, s4.b1 b1Var) {
        if (i10 != 0 && i10 != 2 && i11 < this.f12907r.size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.b1 b1Var) {
        if (b1Var.f46345f == 0) {
            v1 v1Var = (v1) b1Var.f46342a;
            Object O = O(i10, i11);
            boolean z10 = true;
            if (i10 == 1 && i11 == M(i10) - 1) {
                z10 = false;
            }
            if (O instanceof y1) {
                y1 y1Var = (y1) O;
                v1Var.a(y1Var, null, z10);
                v1Var.d.a(this.f12909w.f12944w.contains(Integer.valueOf(y1Var.f13129a)), false);
            }
        }
    }

    @Override
    public final void l() {
        ArrayList arrayList = this.f12907r;
        arrayList.clear();
        arrayList.addAll(z1.f(this.f12908s).e());
        X(false);
        this.f12909w.O();
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View v1Var;
        Context context = this.v;
        if (i10 != 0) {
            if (i10 != 1) {
                v1Var = new View(context);
                v1Var.setTag(-33024);
            } else {
                v1Var = new View(context);
                v1Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(56.0f)));
                v1Var.setTag(-33024);
            }
        } else {
            v1Var = new v1(context, this.f12909w.f27703a, false);
        }
        return new s4.b1(v1Var);
    }
}
