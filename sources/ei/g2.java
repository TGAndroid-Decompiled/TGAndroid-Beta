package ei;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.qx0;
import org.telegram.ui.Components.ux0;
public final class g2 extends ux0 {
    public final boolean A3;
    public final h2 B3;

    public g2(h2 h2Var, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(context, i10, g6Var);
        this.B3 = h2Var;
        this.A3 = z10;
    }

    @Override
    public final boolean G1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final qx0[] H1(qx0[] qx0VarArr) {
        if (qx0VarArr != null && this.A3) {
            int i10 = 0;
            while (true) {
                if (i10 < qx0VarArr.length) {
                    qx0 qx0Var = qx0VarArr[i10];
                    if (qx0Var != null && qx0Var.f30025b) {
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
    public final void K1(int i10) {
        super.K1(i10);
        this.B3.d(false);
    }
}
