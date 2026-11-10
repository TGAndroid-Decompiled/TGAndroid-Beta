package bi;

import android.content.Context;
import android.view.View;
public final class i5 extends k7 {
    public final int f4039w3 = 0;
    public final org.telegram.ui.Components.ma f4040x3;

    public i5(zh.g1 g1Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, i7, j3, h6Var, null);
        this.f4040x3 = g1Var;
    }

    @Override
    public int Q() {
        switch (this.f4039w3) {
            case 0:
                return ((k7) this.f4040x3).Q();
            default:
                return super.Q();
        }
    }

    @Override
    public org.telegram.ui.Components.gc k() {
        switch (this.f4039w3) {
            case 1:
                zh.g1 g1Var = (zh.g1) this.f4040x3;
                return new org.telegram.ui.Components.gc(g1Var.f28675c, g1Var.I0);
            default:
                return super.k();
        }
    }

    public i5(k7 k7Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var, View view) {
        super(context, i7, j3, h6Var, view);
        this.f4040x3 = k7Var;
    }
}
