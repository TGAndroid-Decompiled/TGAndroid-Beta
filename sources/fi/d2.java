package fi;

import android.content.Context;
import org.telegram.messenger.rc;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.yu0;
public final class d2 extends yu0 {
    public final boolean G3;
    public final e2 H3;

    public d2(e2 e2Var, Context context, int i7, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(i7, context, f6Var);
        this.H3 = e2Var;
        this.G3 = z9;
    }

    @Override
    public final boolean D1() {
        return rc.e(8200);
    }

    @Override
    public final uu0[] E1(uu0[] uu0VarArr) {
        if (uu0VarArr != null && this.G3) {
            int i7 = 0;
            while (true) {
                if (i7 < uu0VarArr.length) {
                    uu0 uu0Var = uu0VarArr[i7];
                    if (uu0Var != null && uu0Var.f38723b) {
                        break;
                    }
                    i7++;
                } else {
                    i7 = -1;
                    break;
                }
            }
            if (i7 >= 0) {
                int length = uu0VarArr.length;
                uu0[] uu0VarArr2 = new uu0[length];
                uu0VarArr2[0] = uu0VarArr[i7];
                for (int i10 = 1; i10 < length; i10++) {
                    uu0VarArr2[i10] = uu0VarArr[i10 <= i7 ? i10 - 1 : i10];
                }
                return uu0VarArr2;
            }
        }
        return uu0VarArr;
    }

    @Override
    public final void H1(int i7) {
        super.H1(i7);
        this.H3.d(false);
    }
}
