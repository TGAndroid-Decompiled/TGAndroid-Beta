package ei;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.mx0;
import org.telegram.ui.Components.qx0;
public final class g2 extends qx0 {
    public final boolean f9063x3;
    public final h2 y3;

    public g2(h2 h2Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, i10, d6Var);
        this.y3 = h2Var;
        this.f9063x3 = z10;
    }

    @Override
    public final boolean B1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final mx0[] C1(mx0[] mx0VarArr) {
        if (mx0VarArr != null && this.f9063x3) {
            int i10 = 0;
            while (true) {
                if (i10 < mx0VarArr.length) {
                    mx0 mx0Var = mx0VarArr[i10];
                    if (mx0Var != null && mx0Var.f28619b) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                int length = mx0VarArr.length;
                mx0[] mx0VarArr2 = new mx0[length];
                mx0VarArr2[0] = mx0VarArr[i10];
                for (int i11 = 1; i11 < length; i11++) {
                    mx0VarArr2[i11] = mx0VarArr[i11 <= i10 ? i11 - 1 : i11];
                }
                return mx0VarArr2;
            }
        }
        return mx0VarArr;
    }

    @Override
    public final void F1(int i10) {
        super.F1(i10);
        this.y3.d(false);
    }
}
