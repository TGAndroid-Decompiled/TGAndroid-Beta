package lh;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.gw0;

public final class d2 extends gw0 {

    public final boolean f15851v3;

    public final e2 f15852w3;

    public d2(e2 e2Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, i10, c6Var);
        this.f15852w3 = e2Var;
        this.f15851v3 = z10;
    }

    @Override
    public final boolean A1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final cw0[] B1(cw0[] cw0VarArr) {
        if (cw0VarArr != null && this.f15851v3) {
            int i10 = 0;
            while (true) {
                if (i10 >= cw0VarArr.length) {
                    i10 = -1;
                    break;
                }
                cw0 cw0Var = cw0VarArr[i10];
                if (cw0Var != null && cw0Var.f27560b) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                int length = cw0VarArr.length;
                cw0[] cw0VarArr2 = new cw0[length];
                cw0VarArr2[0] = cw0VarArr[i10];
                int i11 = 1;
                while (i11 < length) {
                    cw0VarArr2[i11] = cw0VarArr[i11 <= i10 ? i11 - 1 : i11];
                    i11++;
                }
                return cw0VarArr2;
            }
        }
        return cw0VarArr;
    }

    @Override
    public final void E1(int i10) {
        super.E1(i10);
        this.f15852w3.d(false);
    }
}
