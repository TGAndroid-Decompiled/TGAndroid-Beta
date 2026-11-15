package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ja;
public final class b2 extends di.c6 {
    public final int f3393x3 = 0;
    public final ja f3394y3;

    public b2(s2 s2Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i7, j3, e6Var, null);
        this.f3394y3 = s2Var;
    }

    @Override
    public int R() {
        switch (this.f3393x3) {
            case 1:
                return ((di.c6) this.f3394y3).R();
            default:
                return super.R();
        }
    }

    @Override
    public cc k() {
        switch (this.f3393x3) {
            case 0:
                s2 s2Var = (s2) this.f3394y3;
                return new cc(s2Var.f29685c, s2Var.J0);
            default:
                return super.k();
        }
    }

    public b2(di.c6 c6Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.e6 e6Var, View view) {
        super(context, i7, j3, e6Var, view);
        this.f3394y3 = c6Var;
    }
}
