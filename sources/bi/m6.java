package bi;

import android.content.Context;
import org.telegram.ui.Components.lc;
public final class m6 extends di.f6 {
    public final int A3;
    public final n6 B3;

    public m6(n6 n6Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var, int i10) {
        super(context, i7, j3, h6Var, null);
        this.A3 = i10;
        this.B3 = n6Var;
    }

    @Override
    public final lc k() {
        switch (this.A3) {
            case 0:
                return lc.b0(this.B3.f3944a.f4114a);
            case 1:
                return lc.b0(this.B3.f3944a.f4114a);
            default:
                return lc.b0(this.B3.f3944a.f4114a);
        }
    }
}
