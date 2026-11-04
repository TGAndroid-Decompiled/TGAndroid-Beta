package ai;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.ma;
public final class j2 extends ci.l6 {
    public final int f748u3 = 0;
    public final ma f749v3;

    public j2(b3 b3Var, Context context, int i3, long j10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i3, j10, e6Var, null);
        this.f749v3 = b3Var;
    }

    @Override
    public int Q() {
        switch (this.f748u3) {
            case 1:
                return ((ci.l6) this.f749v3).Q();
            default:
                return super.Q();
        }
    }

    @Override
    public fc k() {
        switch (this.f748u3) {
            case 0:
                b3 b3Var = (b3) this.f749v3;
                return new fc(b3Var.f28589c, b3Var.J0);
            default:
                return super.k();
        }
    }

    public j2(ci.l6 l6Var, Context context, int i3, long j10, org.telegram.ui.ActionBar.e6 e6Var, View view) {
        super(context, i3, j10, e6Var, view);
        this.f749v3 = l6Var;
    }
}
