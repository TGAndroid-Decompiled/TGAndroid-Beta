package ci;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.vw0;
public final class k2 extends vw0 {
    public final l2 A3;
    public final boolean f4884z3;

    public k2(l2 l2Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, i10, d6Var);
        this.A3 = l2Var;
        this.f4884z3 = z10;
    }

    @Override
    public final boolean A1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final rw0[] B1(rw0[] rw0VarArr) {
        if (rw0VarArr != null && this.f4884z3) {
            int i10 = 0;
            while (true) {
                if (i10 < rw0VarArr.length) {
                    rw0 rw0Var = rw0VarArr[i10];
                    if (rw0Var != null && rw0Var.f27738b) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                int length = rw0VarArr.length;
                rw0[] rw0VarArr2 = new rw0[length];
                rw0VarArr2[0] = rw0VarArr[i10];
                for (int i11 = 1; i11 < length; i11++) {
                    rw0VarArr2[i11] = rw0VarArr[i11 <= i10 ? i11 - 1 : i11];
                }
                return rw0VarArr2;
            }
        }
        return rw0VarArr;
    }

    @Override
    public final void E1(int i10) {
        super.E1(i10);
        this.A3.d(false);
    }
}
