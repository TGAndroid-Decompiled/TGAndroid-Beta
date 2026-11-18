package hi;

import android.content.Context;
import org.telegram.messenger.pc;
import org.telegram.ui.Components.ev0;
import org.telegram.ui.Components.iv0;
public final class d2 extends iv0 {
    public final boolean H3;
    public final e2 I3;

    public d2(e2 e2Var, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(i7, context, i6Var);
        this.I3 = e2Var;
        this.H3 = z10;
    }

    @Override
    public final boolean D1() {
        return pc.e(8200);
    }

    @Override
    public final ev0[] E1(ev0[] ev0VarArr) {
        if (ev0VarArr != null && this.H3) {
            int i7 = 0;
            while (true) {
                if (i7 < ev0VarArr.length) {
                    ev0 ev0Var = ev0VarArr[i7];
                    if (ev0Var != null && ev0Var.f34809b) {
                        break;
                    }
                    i7++;
                } else {
                    i7 = -1;
                    break;
                }
            }
            if (i7 >= 0) {
                int length = ev0VarArr.length;
                ev0[] ev0VarArr2 = new ev0[length];
                ev0VarArr2[0] = ev0VarArr[i7];
                for (int i10 = 1; i10 < length; i10++) {
                    ev0VarArr2[i10] = ev0VarArr[i10 <= i7 ? i10 - 1 : i10];
                }
                return ev0VarArr2;
            }
        }
        return ev0VarArr;
    }

    @Override
    public final void H1(int i7) {
        super.H1(i7);
        this.I3.d(false);
    }
}
