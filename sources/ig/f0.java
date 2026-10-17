package ig;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.im0;
public final class f0 extends em0 {
    public final ArrayList f12895r;
    public final int f12896s;
    public final Context v;
    public final i0 f12897w;

    public f0(i0 i0Var, Context context) {
        this.f12897w = i0Var;
        ArrayList arrayList = new ArrayList();
        this.f12895r = arrayList;
        int i10 = UserConfig.selectedAccount;
        this.f12896s = i10;
        this.v = context;
        arrayList.addAll(y1.f(i10).e());
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(im0 im0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        if (i10 != 0 && i10 != 2) {
            return this.f12895r.size();
        }
        return 1;
    }

    @Override
    public final Object O(int i10, int i11) {
        if (i10 != 0 && i11 >= 0) {
            ArrayList arrayList = this.f12895r;
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
        if (i10 != 0 && i10 != 2 && i11 < this.f12895r.size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.b1 b1Var) {
        if (b1Var.f45941f == 0) {
            u1 u1Var = (u1) b1Var.f45938a;
            Object O = O(i10, i11);
            boolean z10 = true;
            if (i10 == 1 && i11 == M(i10) - 1) {
                z10 = false;
            }
            if (O instanceof x1) {
                x1 x1Var = (x1) O;
                u1Var.a(x1Var, null, z10);
                u1Var.d.a(this.f12897w.f12926w.contains(Integer.valueOf(x1Var.f13080a)), false);
            }
        }
    }

    @Override
    public final void l() {
        ArrayList arrayList = this.f12895r;
        arrayList.clear();
        arrayList.addAll(y1.f(this.f12896s).e());
        X(false);
        this.f12897w.O();
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View u1Var;
        Context context = this.v;
        if (i10 != 0) {
            if (i10 != 1) {
                u1Var = new View(context);
                u1Var.setTag(-33024);
            } else {
                u1Var = new View(context);
                u1Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(56.0f)));
                u1Var.setTag(-33024);
            }
        } else {
            u1Var = new u1(context, this.f12897w.f28237a, false);
        }
        return new s4.b1(u1Var);
    }
}
