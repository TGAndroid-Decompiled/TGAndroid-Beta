package hi;

import android.content.Context;
import org.telegram.messenger.qc;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.lv0;
public final class c2 extends lv0 {
    public final boolean H3;
    public final d2 I3;

    public c2(d2 d2Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        super(i7, context, h6Var);
        this.I3 = d2Var;
        this.H3 = z10;
    }

    @Override
    public final boolean D1() {
        return qc.e(8200);
    }

    @Override
    public final hv0[] E1(hv0[] hv0VarArr) {
        if (hv0VarArr != null && this.H3) {
            int i7 = 0;
            while (true) {
                if (i7 < hv0VarArr.length) {
                    hv0 hv0Var = hv0VarArr[i7];
                    if (hv0Var != null && hv0Var.f35979b) {
                        break;
                    }
                    i7++;
                } else {
                    i7 = -1;
                    break;
                }
            }
            if (i7 >= 0) {
                int length = hv0VarArr.length;
                hv0[] hv0VarArr2 = new hv0[length];
                hv0VarArr2[0] = hv0VarArr[i7];
                for (int i10 = 1; i10 < length; i10++) {
                    hv0VarArr2[i10] = hv0VarArr[i10 <= i7 ? i10 - 1 : i10];
                }
                return hv0VarArr2;
            }
        }
        return hv0VarArr;
    }

    @Override
    public final void H1(int i7) {
        super.H1(i7);
        this.I3.d(false);
    }
}
