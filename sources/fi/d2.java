package fi;

import android.content.Context;
import org.telegram.messenger.sc;
import org.telegram.ui.Components.vu0;
import org.telegram.ui.Components.zu0;
public final class d2 extends zu0 {
    public final boolean G3;
    public final e2 H3;

    public d2(e2 e2Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        super(i7, context, h6Var);
        this.H3 = e2Var;
        this.G3 = z9;
    }

    @Override
    public final boolean D1() {
        return sc.e(8200);
    }

    @Override
    public final vu0[] E1(vu0[] vu0VarArr) {
        if (vu0VarArr != null && this.G3) {
            int i7 = 0;
            while (true) {
                if (i7 < vu0VarArr.length) {
                    vu0 vu0Var = vu0VarArr[i7];
                    if (vu0Var != null && vu0Var.f39748b) {
                        break;
                    }
                    i7++;
                } else {
                    i7 = -1;
                    break;
                }
            }
            if (i7 >= 0) {
                int length = vu0VarArr.length;
                vu0[] vu0VarArr2 = new vu0[length];
                vu0VarArr2[0] = vu0VarArr[i7];
                for (int i10 = 1; i10 < length; i10++) {
                    vu0VarArr2[i10] = vu0VarArr[i10 <= i7 ? i10 - 1 : i10];
                }
                return vu0VarArr2;
            }
        }
        return vu0VarArr;
    }

    @Override
    public final void H1(int i7) {
        super.H1(i7);
        this.H3.d(false);
    }
}
