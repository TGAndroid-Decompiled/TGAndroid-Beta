package ci;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.ix0;
public final class k2 extends ix0 {
    public final l2 A3;
    public final boolean f4878z3;

    public k2(l2 l2Var, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, i10, e6Var);
        this.A3 = l2Var;
        this.f4878z3 = z10;
    }

    @Override
    public final boolean B1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final ex0[] C1(ex0[] ex0VarArr) {
        if (ex0VarArr != null && this.f4878z3) {
            int i10 = 0;
            while (true) {
                if (i10 < ex0VarArr.length) {
                    ex0 ex0Var = ex0VarArr[i10];
                    if (ex0Var != null && ex0Var.f23979b) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                int length = ex0VarArr.length;
                ex0[] ex0VarArr2 = new ex0[length];
                ex0VarArr2[0] = ex0VarArr[i10];
                for (int i11 = 1; i11 < length; i11++) {
                    ex0VarArr2[i11] = ex0VarArr[i11 <= i10 ? i11 - 1 : i11];
                }
                return ex0VarArr2;
            }
        }
        return ex0VarArr;
    }

    @Override
    public final void F1(int i10) {
        super.F1(i10);
        this.A3.d(false);
    }
}
