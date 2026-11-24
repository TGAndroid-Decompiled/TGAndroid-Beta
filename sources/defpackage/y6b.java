package defpackage;

import android.content.Context;
import org.telegram.messenger.Utilities;
public final class y6b extends ir3 {
    public final t7b c0;

    public y6b(t7b t7bVar, Context context, boolean z) {
        super(context, z);
        this.c0 = t7bVar;
    }

    @Override
    public final void receivedAmplitude(double d) {
        f29 f29Var = this.c0.P0;
        if (f29Var != null) {
            f29Var.h0 = Utilities.i((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override
    public final void s(boolean z) {
        t7b t7bVar = this.c0;
        t7bVar.p1.b(t7bVar.d1.getText());
        t7bVar.p1.a(false, z, t7bVar.l0);
    }

    @Override
    public final void toggleDual() {
        int i;
        super.toggleDual();
        t7b t7bVar = this.c0;
        t7bVar.G0.setValue(isDual());
        npb npbVar = t7bVar.G0;
        if (isDual()) {
            i = 2131754886;
        } else {
            i = 2131754887;
        }
        npbVar.setContentDescription(k96.M0(i, null));
        t7bVar.d0(t7bVar.A());
    }
}
