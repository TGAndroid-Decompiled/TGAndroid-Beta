package defpackage;

import android.content.Context;
import org.telegram.messenger.Utilities;
public final class wab extends as3 {
    public final rbb c0;

    public wab(rbb rbbVar, Context context, boolean z) {
        super(context, z);
        this.c0 = rbbVar;
    }

    @Override
    public final void k0(boolean z) {
        rbb rbbVar = this.c0;
        rbbVar.p1.b(rbbVar.d1.getText());
        rbbVar.p1.a(false, z, rbbVar.l0);
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
        rbb rbbVar = this.c0;
        rbbVar.G0.setValue(isDual());
        otb otbVar = rbbVar.G0;
        if (isDual()) {
            i = 2131754882;
        } else {
            i = 2131754883;
        }
        otbVar.setContentDescription(ob6.M0(i, null));
        rbbVar.d0(rbbVar.A());
    }
}
