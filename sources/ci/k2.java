package ci;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.ox0;
import org.telegram.ui.Components.sx0;
public final class k2 extends sx0 {
    public final boolean G3;
    public final l2 H3;

    public k2(l2 l2Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, i10, d6Var);
        this.H3 = l2Var;
        this.G3 = z10;
    }

    @Override
    public final boolean B1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final ox0[] C1(ox0[] ox0VarArr) {
        if (ox0VarArr != null && this.G3) {
            int i10 = 0;
            while (true) {
                if (i10 < ox0VarArr.length) {
                    ox0 ox0Var = ox0VarArr[i10];
                    if (ox0Var != null && ox0Var.f29558b) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                int length = ox0VarArr.length;
                ox0[] ox0VarArr2 = new ox0[length];
                ox0VarArr2[0] = ox0VarArr[i10];
                for (int i11 = 1; i11 < length; i11++) {
                    ox0VarArr2[i11] = ox0VarArr[i11 <= i10 ? i11 - 1 : i11];
                }
                return ox0VarArr2;
            }
        }
        return ox0VarArr;
    }

    @Override
    public final void F1(int i10) {
        super.F1(i10);
        this.H3.d(false);
    }
}
