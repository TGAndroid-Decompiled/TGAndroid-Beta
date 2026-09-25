package ci;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.gx0;
public final class k2 extends gx0 {
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
    public final cx0[] B1(cx0[] cx0VarArr) {
        if (cx0VarArr != null && this.f4884z3) {
            int i10 = 0;
            while (true) {
                if (i10 < cx0VarArr.length) {
                    cx0 cx0Var = cx0VarArr[i10];
                    if (cx0Var != null && cx0Var.f23410b) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                int length = cx0VarArr.length;
                cx0[] cx0VarArr2 = new cx0[length];
                cx0VarArr2[0] = cx0VarArr[i10];
                for (int i11 = 1; i11 < length; i11++) {
                    cx0VarArr2[i11] = cx0VarArr[i11 <= i10 ? i11 - 1 : i11];
                }
                return cx0VarArr2;
            }
        }
        return cx0VarArr;
    }

    @Override
    public final void E1(int i10) {
        super.E1(i10);
        this.A3.d(false);
    }
}
