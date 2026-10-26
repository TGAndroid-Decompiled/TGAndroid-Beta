package fi;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.by0;
import org.telegram.ui.Components.xx0;
public final class e2 extends by0 {
    public final boolean H3;
    public final f2 I3;

    public e2(f2 f2Var, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context, i10, u6Var);
        this.I3 = f2Var;
        this.H3 = z10;
    }

    @Override
    public final boolean G1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final xx0[] H1(xx0[] xx0VarArr) {
        if (xx0VarArr != null && this.H3) {
            int i10 = 0;
            while (true) {
                if (i10 < xx0VarArr.length) {
                    xx0 xx0Var = xx0VarArr[i10];
                    if (xx0Var != null && xx0Var.f34846b) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                int length = xx0VarArr.length;
                xx0[] xx0VarArr2 = new xx0[length];
                xx0VarArr2[0] = xx0VarArr[i10];
                for (int i11 = 1; i11 < length; i11++) {
                    xx0VarArr2[i11] = xx0VarArr[i11 <= i10 ? i11 - 1 : i11];
                }
                return xx0VarArr2;
            }
        }
        return xx0VarArr;
    }

    @Override
    public final void K1(int i10) {
        super.K1(i10);
        this.I3.d(false);
    }
}
