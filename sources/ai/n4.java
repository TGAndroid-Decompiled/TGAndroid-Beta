package ai;

import android.content.Context;
import org.telegram.ui.Components.fc;
public final class n4 extends ci.l6 {
    public final int f840u3;
    public final o4 f841v3;

    public n4(o4 o4Var, Context context, int i3, long j10, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, i3, j10, e6Var, null);
        this.f840u3 = i10;
        this.f841v3 = o4Var;
    }

    @Override
    public final fc k() {
        switch (this.f840u3) {
            case 0:
                return fc.a0(this.f841v3.f856a.f1010a);
            case 1:
                return fc.a0(this.f841v3.f856a.f1010a);
            default:
                return fc.a0(this.f841v3.f856a.f1010a);
        }
    }
}
