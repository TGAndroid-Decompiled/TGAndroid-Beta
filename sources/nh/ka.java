package nh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class ka extends c1 {
    public final gb U;

    public ka(gb gbVar, Context context, boolean z10) {
        super(context, z10);
        this.U = gbVar;
    }

    @Override
    public final void receivedAmplitude(double d) {
        o6 o6Var = this.U.K0;
        if (o6Var != null) {
            o6Var.f18223c0 = Utilities.clamp((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override
    public final void toggleDual() {
        int i10;
        super.toggleDual();
        gb gbVar = this.U;
        gbVar.B0.setValue(isDual());
        sb sbVar = gbVar.B0;
        if (isDual()) {
            i10 = R.string.AccDescrDualCameraOn;
        } else {
            i10 = R.string.AccDescrDualCameraOff;
        }
        sbVar.setContentDescription(LocaleController.getString(i10));
        gbVar.e0(gbVar.C());
    }

    @Override
    public final void u(boolean z10) {
        gb gbVar = this.U;
        gbVar.f17771k1.b(gbVar.Y0.getText());
        gbVar.f17771k1.a(false, z10, gbVar.f17758g0);
    }
}
