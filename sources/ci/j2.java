package ci;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.ay0;
import org.telegram.ui.Components.ey0;
public final class j2 extends ey0 {
    public final boolean f5227x3;
    public final k2 y3;

    public j2(k2 k2Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, i10, c6Var);
        this.y3 = k2Var;
        this.f5227x3 = z10;
    }

    @Override
    public final boolean B1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final ay0[] C1(ay0[] ay0VarArr) {
        if (ay0VarArr != null && this.f5227x3) {
            int i10 = 0;
            while (true) {
                if (i10 < ay0VarArr.length) {
                    ay0 ay0Var = ay0VarArr[i10];
                    if (ay0Var != null && ay0Var.f24496b) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                int length = ay0VarArr.length;
                ay0[] ay0VarArr2 = new ay0[length];
                ay0VarArr2[0] = ay0VarArr[i10];
                for (int i11 = 1; i11 < length; i11++) {
                    ay0VarArr2[i11] = ay0VarArr[i11 <= i10 ? i11 - 1 : i11];
                }
                return ay0VarArr2;
            }
        }
        return ay0VarArr;
    }

    @Override
    public final void F1(int i10) {
        super.F1(i10);
        this.y3.d(false);
    }
}
