package bi;

import android.content.Context;
import org.telegram.ui.Components.lc;
public final class o6 extends di.f6 {
    public final int A3;
    public final p6 B3;

    public o6(p6 p6Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var, int i10) {
        super(context, i7, j3, h6Var, null);
        this.A3 = i10;
        this.B3 = p6Var;
    }

    @Override
    public final lc k() {
        switch (this.A3) {
            case 0:
                return lc.b0(this.B3.f3966a.f4148a);
            case 1:
                return lc.b0(this.B3.f3966a.f4148a);
            default:
                return lc.b0(this.B3.f3966a.f4148a);
        }
    }
}
