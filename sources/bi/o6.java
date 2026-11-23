package bi;

import android.content.Context;
import org.telegram.ui.Components.kc;
public final class o6 extends di.f6 {
    public final int A3;
    public final p6 B3;

    public o6(p6 p6Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.i6 i6Var, int i10) {
        super(context, i7, j3, i6Var, null);
        this.A3 = i10;
        this.B3 = p6Var;
    }

    @Override
    public final kc k() {
        switch (this.A3) {
            case 0:
                return kc.b0(this.B3.f3966a.f4148a);
            case 1:
                return kc.b0(this.B3.f3966a.f4148a);
            default:
                return kc.b0(this.B3.f3966a.f4148a);
        }
    }
}
