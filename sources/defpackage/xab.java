package defpackage;

import android.content.Context;
import org.telegram.messenger.Utilities;
public final class xab extends as3 {
    public final sbb c0;

    public xab(sbb sbbVar, Context context, boolean z) {
        super(context, z);
        this.c0 = sbbVar;
    }

    @Override
    public final void k0(boolean z) {
        sbb sbbVar = this.c0;
        sbbVar.p1.b(sbbVar.d1.getText());
        sbbVar.p1.a(false, z, sbbVar.l0);
    }

    @Override
    public final void receivedAmplitude(double d) {
        u59 u59Var = this.c0.P0;
        if (u59Var != null) {
            u59Var.h0 = Utilities.i((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override
    public final void toggleDual() {
        int i;
        super.toggleDual();
        sbb sbbVar = this.c0;
        sbbVar.G0.setValue(isDual());
        otb otbVar = sbbVar.G0;
        if (isDual()) {
            i = 2131754882;
        } else {
            i = 2131754883;
        }
        otbVar.setContentDescription(ob6.M0(i, null));
        sbbVar.d0(sbbVar.A());
    }
}
