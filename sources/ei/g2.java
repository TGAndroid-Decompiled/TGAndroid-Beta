package ei;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.px0;
import org.telegram.ui.Components.tx0;
public final class g2 extends tx0 {
    public final boolean A3;
    public final h2 B3;

    public g2(h2 h2Var, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(context, i10, g6Var);
        this.B3 = h2Var;
        this.A3 = z10;
    }

    @Override
    public final boolean G1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final px0[] H1(px0[] px0VarArr) {
        if (px0VarArr != null && this.A3) {
            int i10 = 0;
            while (true) {
                if (i10 < px0VarArr.length) {
                    px0 px0Var = px0VarArr[i10];
                    if (px0Var != null && px0Var.f29686b) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                int length = px0VarArr.length;
                px0[] px0VarArr2 = new px0[length];
                px0VarArr2[0] = px0VarArr[i10];
                for (int i11 = 1; i11 < length; i11++) {
                    px0VarArr2[i11] = px0VarArr[i11 <= i10 ? i11 - 1 : i11];
                }
                return px0VarArr2;
            }
        }
        return px0VarArr;
    }

    @Override
    public final void K1(int i10) {
        super.K1(i10);
        this.B3.d(false);
    }
}
