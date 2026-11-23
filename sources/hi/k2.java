package hi;

import android.content.Context;
import org.telegram.messenger.pc;
import org.telegram.ui.Components.gv0;
import org.telegram.ui.Components.kv0;
public final class k2 extends kv0 {
    public final boolean H3;
    public final l2 I3;

    public k2(l2 l2Var, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(i7, context, i6Var);
        this.I3 = l2Var;
        this.H3 = z10;
    }

    @Override
    public final boolean D1() {
        return pc.e(8200);
    }

    @Override
    public final gv0[] E1(gv0[] gv0VarArr) {
        if (gv0VarArr != null && this.H3) {
            int i7 = 0;
            while (true) {
                if (i7 < gv0VarArr.length) {
                    gv0 gv0Var = gv0VarArr[i7];
                    if (gv0Var != null && gv0Var.f35561b) {
                        break;
                    }
                    i7++;
                } else {
                    i7 = -1;
                    break;
                }
            }
            if (i7 >= 0) {
                int length = gv0VarArr.length;
                gv0[] gv0VarArr2 = new gv0[length];
                gv0VarArr2[0] = gv0VarArr[i7];
                for (int i10 = 1; i10 < length; i10++) {
                    gv0VarArr2[i10] = gv0VarArr[i10 <= i7 ? i10 - 1 : i10];
                }
                return gv0VarArr2;
            }
        }
        return gv0VarArr;
    }

    @Override
    public final void H1(int i7) {
        super.H1(i7);
        this.I3.d(false);
    }
}
