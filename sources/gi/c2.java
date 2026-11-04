package gi;

import android.content.Context;
import org.telegram.messenger.lc;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.xu0;
public final class c2 extends xu0 {
    public final boolean H3;
    public final d2 I3;

    public c2(d2 d2Var, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(i3, context, e6Var);
        this.I3 = d2Var;
        this.H3 = z10;
    }

    @Override
    public final boolean D1() {
        return lc.e(8200);
    }

    @Override
    public final tu0[] E1(tu0[] tu0VarArr) {
        if (tu0VarArr != null && this.H3) {
            int i3 = 0;
            while (true) {
                if (i3 < tu0VarArr.length) {
                    tu0 tu0Var = tu0VarArr[i3];
                    if (tu0Var != null && tu0Var.f38556b) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (i3 >= 0) {
                int length = tu0VarArr.length;
                tu0[] tu0VarArr2 = new tu0[length];
                tu0VarArr2[0] = tu0VarArr[i3];
                for (int i10 = 1; i10 < length; i10++) {
                    tu0VarArr2[i10] = tu0VarArr[i10 <= i3 ? i10 - 1 : i10];
                }
                return tu0VarArr2;
            }
        }
        return tu0VarArr;
    }

    @Override
    public final void H1(int i3) {
        super.H1(i3);
        this.I3.d(false);
    }
}
