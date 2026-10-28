package fi;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.yx0;
public final class e2 extends cy0 {
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
    public final yx0[] H1(yx0[] yx0VarArr) {
        if (yx0VarArr != null && this.H3) {
            int i10 = 0;
            while (true) {
                if (i10 < yx0VarArr.length) {
                    yx0 yx0Var = yx0VarArr[i10];
                    if (yx0Var != null && yx0Var.f35183b) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                int length = yx0VarArr.length;
                yx0[] yx0VarArr2 = new yx0[length];
                yx0VarArr2[0] = yx0VarArr[i10];
                for (int i11 = 1; i11 < length; i11++) {
                    yx0VarArr2[i11] = yx0VarArr[i11 <= i10 ? i11 - 1 : i11];
                }
                return yx0VarArr2;
            }
        }
        return yx0VarArr;
    }

    @Override
    public final void K1(int i10) {
        super.K1(i10);
        this.I3.d(false);
    }
}
