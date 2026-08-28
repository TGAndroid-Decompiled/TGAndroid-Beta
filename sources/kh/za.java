package kh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class za extends d1 {
    public final wb U;

    public za(wb wbVar, Context context, boolean z10) {
        super(context, z10);
        this.U = wbVar;
    }

    @Override
    public final void receivedAmplitude(double d) {
        z6 z6Var = this.U.K0;
        if (z6Var != null) {
            z6Var.f16433c0 = Utilities.clamp((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override
    public final void toggleDual() {
        int i9;
        super.toggleDual();
        wb wbVar = this.U;
        wbVar.B0.setValue(isDual());
        ic icVar = wbVar.B0;
        if (isDual()) {
            i9 = R.string.AccDescrDualCameraOn;
        } else {
            i9 = R.string.AccDescrDualCameraOff;
        }
        icVar.setContentDescription(LocaleController.getString(i9));
        wbVar.e0(wbVar.C());
    }

    @Override
    public final void u(boolean z10) {
        wb wbVar = this.U;
        wbVar.f16281k1.b(wbVar.Y0.getText());
        wbVar.f16281k1.a(false, z10, wbVar.f16268g0);
    }
}
