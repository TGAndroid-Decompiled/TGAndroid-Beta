package nh;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.ow0;
public final class c2 extends ow0 {
    public final boolean f17468v3;
    public final d2 f17469w3;

    public c2(d2 d2Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, i10, c6Var);
        this.f17469w3 = d2Var;
        this.f17468v3 = z10;
    }

    @Override
    public final boolean A1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final kw0[] B1(kw0[] kw0VarArr) {
        if (kw0VarArr != null && this.f17468v3) {
            int i10 = 0;
            while (true) {
                if (i10 < kw0VarArr.length) {
                    kw0 kw0Var = kw0VarArr[i10];
                    if (kw0Var != null && kw0Var.f30159b) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                int length = kw0VarArr.length;
                kw0[] kw0VarArr2 = new kw0[length];
                kw0VarArr2[0] = kw0VarArr[i10];
                for (int i11 = 1; i11 < length; i11++) {
                    kw0VarArr2[i11] = kw0VarArr[i11 <= i10 ? i11 - 1 : i11];
                }
                return kw0VarArr2;
            }
        }
        return kw0VarArr;
    }

    @Override
    public final void E1(int i10) {
        super.E1(i10);
        this.f17469w3.d(false);
    }
}
