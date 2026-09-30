package ci;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.fx0;
import org.telegram.ui.Components.jx0;
public final class k2 extends jx0 {
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
    public final fx0[] D1(fx0[] fx0VarArr) {
        if (fx0VarArr != null && this.G3) {
            int i10 = 0;
            while (true) {
                if (i10 < fx0VarArr.length) {
                    fx0 fx0Var = fx0VarArr[i10];
                    if (fx0Var != null && fx0Var.f24376b) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                int length = fx0VarArr.length;
                fx0[] fx0VarArr2 = new fx0[length];
                fx0VarArr2[0] = fx0VarArr[i10];
                for (int i11 = 1; i11 < length; i11++) {
                    fx0VarArr2[i11] = fx0VarArr[i11 <= i10 ? i11 - 1 : i11];
                }
                return fx0VarArr2;
            }
        }
        return fx0VarArr;
    }

    @Override
    public final void G1(int i10) {
        super.G1(i10);
        this.H3.d(false);
    }
}
