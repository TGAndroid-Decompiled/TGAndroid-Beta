package di;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.qx0;
import org.telegram.ui.Components.ux0;
public final class j2 extends ux0 {
    public final boolean f7106x3;
    public final k2 y3;

    public j2(k2 k2Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, i10, c6Var);
        this.y3 = k2Var;
        this.f7106x3 = z10;
    }

    @Override
    public final boolean B1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final qx0[] C1(qx0[] qx0VarArr) {
        if (qx0VarArr != null && this.f7106x3) {
            int i10 = 0;
            while (true) {
                if (i10 < qx0VarArr.length) {
                    qx0 qx0Var = qx0VarArr[i10];
                    if (qx0Var != null && qx0Var.f28376b) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                int length = qx0VarArr.length;
                qx0[] qx0VarArr2 = new qx0[length];
                qx0VarArr2[0] = qx0VarArr[i10];
                for (int i11 = 1; i11 < length; i11++) {
                    qx0VarArr2[i11] = qx0VarArr[i11 <= i10 ? i11 - 1 : i11];
                }
                return qx0VarArr2;
            }
        }
        return qx0VarArr;
    }

    @Override
    public final void F1(int i10) {
        super.F1(i10);
        this.y3.d(false);
    }
}
