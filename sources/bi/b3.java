package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.sa;
public final class b3 extends di.f6 {
    public final int A3 = 0;
    public final sa B3;

    public b3(p3 p3Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, i7, j3, h6Var, null);
        this.B3 = p3Var;
    }

    @Override
    public int R() {
        switch (this.A3) {
            case 1:
                return ((di.f6) this.B3).R();
            default:
                return super.R();
        }
    }

    @Override
    public lc k() {
        switch (this.A3) {
            case 0:
                p3 p3Var = (p3) this.B3;
                return new lc(p3Var.f30145c, p3Var.J0);
            default:
                return super.k();
        }
    }

    public b3(di.f6 f6Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var, View view) {
        super(context, i7, j3, h6Var, view);
        this.B3 = f6Var;
    }
}
