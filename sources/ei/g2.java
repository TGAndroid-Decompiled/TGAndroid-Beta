package ei;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.Components.px0;
public final class g2 extends px0 {
    public final boolean f9065x3;
    public final h2 y3;

    public g2(h2 h2Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, i10, d6Var);
        this.y3 = h2Var;
        this.f9065x3 = z10;
    }

    @Override
    public final boolean B1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final lx0[] C1(lx0[] lx0VarArr) {
        if (lx0VarArr != null && this.f9065x3) {
            int i10 = 0;
            while (true) {
                if (i10 < lx0VarArr.length) {
                    lx0 lx0Var = lx0VarArr[i10];
                    if (lx0Var != null && lx0Var.f28341b) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                int length = lx0VarArr.length;
                lx0[] lx0VarArr2 = new lx0[length];
                lx0VarArr2[0] = lx0VarArr[i10];
                for (int i11 = 1; i11 < length; i11++) {
                    lx0VarArr2[i11] = lx0VarArr[i11 <= i10 ? i11 - 1 : i11];
                }
                return lx0VarArr2;
            }
        }
        return lx0VarArr;
    }

    @Override
    public final void F1(int i10) {
        super.F1(i10);
        this.y3.d(false);
    }
}
