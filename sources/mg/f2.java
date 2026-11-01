package mg;

import android.content.Context;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.uh0;
public final class f2 extends qg.h {
    public final int K;
    public boolean L;
    public final ha M;

    public f2(ha haVar, Context context, p6 p6Var, int i10) {
        super(context, p6Var);
        this.K = i10;
        this.M = haVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.K) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                i2 i2Var = (i2) this.M;
                i2Var.f13146i2 = org.telegram.messenger.i0.L(64.0f) + getMeasuredHeight();
                i2Var.f13145h2.G();
                boolean z11 = this.L;
                boolean z12 = i2Var.d;
                if (z11 != z12) {
                    this.L = z12;
                    if (z12) {
                        uk0 uk0Var = i2Var.f26724k1;
                        ci.p pVar = new ci.p(i2Var.getContext(), 2, 0.6f);
                        pVar.f48056a = 1;
                        pVar.f4253p = org.telegram.messenger.i0.L(36.0f);
                        uk0Var.getLayoutManager().w0(pVar);
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                uh0 uh0Var = (uh0) this.M;
                uh0Var.f41946d2 = org.telegram.messenger.i0.L(64.0f) + getMeasuredHeight();
                uh0Var.f41945c2.G();
                boolean z13 = this.L;
                boolean z14 = uh0Var.d;
                if (z13 != z14) {
                    this.L = z14;
                    if (z14) {
                        uk0 uk0Var2 = uh0Var.f26724k1;
                        ci.p pVar2 = new ci.p(uh0Var.getContext(), 2, 0.6f);
                        pVar2.f48056a = 1;
                        pVar2.f4253p = org.telegram.messenger.i0.L(36.0f);
                        uk0Var2.getLayoutManager().w0(pVar2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
