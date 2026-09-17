package ci;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.Components.xw0;
public final class k2 extends xw0 {
    public final l2 A3;
    public final boolean f4878z3;

    public k2(l2 l2Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context, i10, f6Var);
        this.A3 = l2Var;
        this.f4878z3 = z10;
    }

    @Override
    public final boolean B1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final tw0[] C1(tw0[] tw0VarArr) {
        if (tw0VarArr != null && this.f4878z3) {
            int i10 = 0;
            while (true) {
                if (i10 < tw0VarArr.length) {
                    tw0 tw0Var = tw0VarArr[i10];
                    if (tw0Var != null && tw0Var.f28213b) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                int length = tw0VarArr.length;
                tw0[] tw0VarArr2 = new tw0[length];
                tw0VarArr2[0] = tw0VarArr[i10];
                for (int i11 = 1; i11 < length; i11++) {
                    tw0VarArr2[i11] = tw0VarArr[i11 <= i10 ? i11 - 1 : i11];
                }
                return tw0VarArr2;
            }
        }
        return tw0VarArr;
    }

    @Override
    public final void F1(int i10) {
        super.F1(i10);
        this.A3.d(false);
    }
}
