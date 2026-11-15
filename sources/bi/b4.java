package bi;

import android.content.Context;
import org.telegram.ui.Components.cc;
public final class b4 extends di.c6 {
    public final int f3400x3;
    public final c4 f3401y3;

    public b4(c4 c4Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, i7, j3, e6Var, null);
        this.f3400x3 = i10;
        this.f3401y3 = c4Var;
    }

    @Override
    public final cc k() {
        switch (this.f3400x3) {
            case 0:
                return cc.a0(this.f3401y3.f3412a.f3610a);
            case 1:
                return cc.a0(this.f3401y3.f3412a.f3610a);
            default:
                return cc.a0(this.f3401y3.f3412a.f3610a);
        }
    }
}
