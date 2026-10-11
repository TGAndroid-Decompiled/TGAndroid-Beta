package ci;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.ay0;
import org.telegram.ui.Components.wx0;
public final class j2 extends ay0 {
    public final boolean f5228x3;
    public final k2 y3;

    public j2(k2 k2Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, i10, d6Var);
        this.y3 = k2Var;
        this.f5228x3 = z10;
    }

    @Override
    public final boolean B1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final wx0[] C1(wx0[] wx0VarArr) {
        if (wx0VarArr != null && this.f5228x3) {
            int i10 = 0;
            while (true) {
                if (i10 < wx0VarArr.length) {
                    wx0 wx0Var = wx0VarArr[i10];
                    if (wx0Var != null && wx0Var.f32757b) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                int length = wx0VarArr.length;
                wx0[] wx0VarArr2 = new wx0[length];
                wx0VarArr2[0] = wx0VarArr[i10];
                for (int i11 = 1; i11 < length; i11++) {
                    wx0VarArr2[i11] = wx0VarArr[i11 <= i10 ? i11 - 1 : i11];
                }
                return wx0VarArr2;
            }
        }
        return wx0VarArr;
    }

    @Override
    public final void F1(int i10) {
        super.F1(i10);
        this.y3.d(false);
    }
}
