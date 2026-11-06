package bi;

import android.content.Context;
import android.view.View;
public final class i5 extends k7 {
    public final int f4042t3 = 0;
    public final org.telegram.ui.Components.na f4043u3;

    public i5(zh.h1 h1Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i7, j3, f6Var, null);
        this.f4043u3 = h1Var;
    }

    @Override
    public int Q() {
        switch (this.f4042t3) {
            case 0:
                return ((k7) this.f4043u3).Q();
            default:
                return super.Q();
        }
    }

    @Override
    public org.telegram.ui.Components.hc k() {
        switch (this.f4042t3) {
            case 1:
                zh.h1 h1Var = (zh.h1) this.f4043u3;
                return new org.telegram.ui.Components.hc(h1Var.f28618c, h1Var.I0);
            default:
                return super.k();
        }
    }

    public i5(k7 k7Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.f6 f6Var, View view) {
        super(context, i7, j3, f6Var, view);
        this.f4043u3 = k7Var;
    }
}
