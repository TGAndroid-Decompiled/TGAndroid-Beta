package bi;

import android.content.Context;
import org.telegram.ui.Components.lc;
public final class i6 extends di.f6 {
    public final int A3;
    public final j6 B3;

    public i6(j6 j6Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.i6 i6Var, int i10) {
        super(context, i7, j3, i6Var, null);
        this.A3 = i10;
        this.B3 = j6Var;
    }

    @Override
    public final lc k() {
        switch (this.A3) {
            case 0:
                return lc.b0(this.B3.f3756a.f3941a);
            case 1:
                return lc.b0(this.B3.f3756a.f3941a);
            default:
                return lc.b0(this.B3.f3756a.f3941a);
        }
    }
}
