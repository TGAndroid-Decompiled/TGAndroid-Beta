package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.sa;
public final class v2 extends di.f6 {
    public final int A3 = 0;
    public final sa B3;

    public v2(j3 j3Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i7, j3, i6Var, null);
        this.B3 = j3Var;
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
                j3 j3Var = (j3) this.B3;
                return new lc(j3Var.f30195c, j3Var.J0);
            default:
                return super.k();
        }
    }

    public v2(di.f6 f6Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.i6 i6Var, View view) {
        super(context, i7, j3, i6Var, view);
        this.B3 = f6Var;
    }
}
