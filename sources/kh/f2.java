package kh;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.ew0;
public final class f2 extends ew0 {
    public final boolean f15225v3;
    public final g2 f15226w3;

    public f2(g2 g2Var, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context, i9, b6Var);
        this.f15226w3 = g2Var;
        this.f15225v3 = z10;
    }

    @Override
    public final boolean A1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final aw0[] B1(aw0[] aw0VarArr) {
        if (aw0VarArr != null && this.f15225v3) {
            int i9 = 0;
            while (true) {
                if (i9 < aw0VarArr.length) {
                    aw0 aw0Var = aw0VarArr[i9];
                    if (aw0Var != null && aw0Var.f26915b) {
                        break;
                    }
                    i9++;
                } else {
                    i9 = -1;
                    break;
                }
            }
            if (i9 >= 0) {
                int length = aw0VarArr.length;
                aw0[] aw0VarArr2 = new aw0[length];
                aw0VarArr2[0] = aw0VarArr[i9];
                for (int i10 = 1; i10 < length; i10++) {
                    aw0VarArr2[i10] = aw0VarArr[i10 <= i9 ? i10 - 1 : i10];
                }
                return aw0VarArr2;
            }
        }
        return aw0VarArr;
    }

    @Override
    public final void E1(int i9) {
        super.E1(i9);
        this.f15226w3.d(false);
    }
}
