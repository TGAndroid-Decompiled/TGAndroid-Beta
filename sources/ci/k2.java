package ci;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.nx0;
import org.telegram.ui.Components.rx0;
public final class k2 extends rx0 {
    public final boolean G3;
    public final l2 H3;

    public k2(l2 l2Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, i10, d6Var);
        this.H3 = l2Var;
        this.G3 = z10;
    }

    @Override
    public final boolean C1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final nx0[] D1(nx0[] nx0VarArr) {
        if (nx0VarArr != null && this.G3) {
            int i10 = 0;
            while (true) {
                if (i10 < nx0VarArr.length) {
                    nx0 nx0Var = nx0VarArr[i10];
                    if (nx0Var != null && nx0Var.f29072b) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                int length = nx0VarArr.length;
                nx0[] nx0VarArr2 = new nx0[length];
                nx0VarArr2[0] = nx0VarArr[i10];
                for (int i11 = 1; i11 < length; i11++) {
                    nx0VarArr2[i11] = nx0VarArr[i11 <= i10 ? i11 - 1 : i11];
                }
                return nx0VarArr2;
            }
        }
        return nx0VarArr;
    }

    @Override
    public final void G1(int i10) {
        super.G1(i10);
        this.H3.d(false);
    }
}
