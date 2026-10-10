package ci;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.zx0;
public final class j2 extends zx0 {
    public final boolean f5229x3;
    public final k2 y3;

    public j2(k2 k2Var, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, i10, e6Var);
        this.y3 = k2Var;
        this.f5229x3 = z10;
    }

    @Override
    public final boolean B1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final vx0[] C1(vx0[] vx0VarArr) {
        if (vx0VarArr != null && this.f5229x3) {
            int i10 = 0;
            while (true) {
                if (i10 < vx0VarArr.length) {
                    vx0 vx0Var = vx0VarArr[i10];
                    if (vx0Var != null && vx0Var.f32529b) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                int length = vx0VarArr.length;
                vx0[] vx0VarArr2 = new vx0[length];
                vx0VarArr2[0] = vx0VarArr[i10];
                for (int i11 = 1; i11 < length; i11++) {
                    vx0VarArr2[i11] = vx0VarArr[i11 <= i10 ? i11 - 1 : i11];
                }
                return vx0VarArr2;
            }
        }
        return vx0VarArr;
    }

    @Override
    public final void F1(int i10) {
        super.F1(i10);
        this.y3.d(false);
    }
}
