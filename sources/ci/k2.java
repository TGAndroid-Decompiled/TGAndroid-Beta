package ci;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.hx0;
public final class k2 extends hx0 {
    public final l2 A3;
    public final boolean f4879z3;

    public k2(l2 l2Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context, i10, f6Var);
        this.A3 = l2Var;
        this.f4879z3 = z10;
    }

    @Override
    public final boolean B1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final dx0[] C1(dx0[] dx0VarArr) {
        if (dx0VarArr != null && this.f4879z3) {
            int i10 = 0;
            while (true) {
                if (i10 < dx0VarArr.length) {
                    dx0 dx0Var = dx0VarArr[i10];
                    if (dx0Var != null && dx0Var.f23661b) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                int length = dx0VarArr.length;
                dx0[] dx0VarArr2 = new dx0[length];
                dx0VarArr2[0] = dx0VarArr[i10];
                for (int i11 = 1; i11 < length; i11++) {
                    dx0VarArr2[i11] = dx0VarArr[i11 <= i10 ? i11 - 1 : i11];
                }
                return dx0VarArr2;
            }
        }
        return dx0VarArr;
    }

    @Override
    public final void F1(int i10) {
        super.F1(i10);
        this.A3.d(false);
    }
}
