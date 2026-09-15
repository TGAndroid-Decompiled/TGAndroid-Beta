package ci;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.sw0;
import org.telegram.ui.Components.ww0;
public final class k2 extends ww0 {
    public final l2 A3;
    public final boolean f4873z3;

    public k2(l2 l2Var, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, i10, e6Var);
        this.A3 = l2Var;
        this.f4873z3 = z10;
    }

    @Override
    public final boolean A1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final sw0[] B1(sw0[] sw0VarArr) {
        if (sw0VarArr != null && this.f4873z3) {
            int i10 = 0;
            while (true) {
                if (i10 < sw0VarArr.length) {
                    sw0 sw0Var = sw0VarArr[i10];
                    if (sw0Var != null && sw0Var.f27984b) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                int length = sw0VarArr.length;
                sw0[] sw0VarArr2 = new sw0[length];
                sw0VarArr2[0] = sw0VarArr[i10];
                for (int i11 = 1; i11 < length; i11++) {
                    sw0VarArr2[i11] = sw0VarArr[i11 <= i10 ? i11 - 1 : i11];
                }
                return sw0VarArr2;
            }
        }
        return sw0VarArr;
    }

    @Override
    public final void E1(int i10) {
        super.E1(i10);
        this.A3.d(false);
    }
}
