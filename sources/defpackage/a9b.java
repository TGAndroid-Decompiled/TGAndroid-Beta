package defpackage;

import android.content.Context;
import org.telegram.messenger.Utilities;
public final class a9b extends ss3 {
    public final v9b c0;

    public a9b(v9b v9bVar, Context context, boolean z) {
        super(context, z);
        this.c0 = v9bVar;
    }

    @Override
    public final void receivedAmplitude(double d) {
        j49 j49Var = this.c0.P0;
        if (j49Var != null) {
            j49Var.h0 = Utilities.i((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override
    public final void s(boolean z) {
        v9b v9bVar = this.c0;
        v9bVar.p1.b(v9bVar.d1.getText());
        v9bVar.p1.a(false, z, v9bVar.l0);
    }

    @Override
    public final void toggleDual() {
        int i;
        super.toggleDual();
        v9b v9bVar = this.c0;
        v9bVar.G0.setValue(isDual());
        orb orbVar = v9bVar.G0;
        if (isDual()) {
            i = 2131754886;
        } else {
            i = 2131754887;
        }
        orbVar.setContentDescription(jb6.M0(i, null));
        v9bVar.d0(v9bVar.A());
    }
}
