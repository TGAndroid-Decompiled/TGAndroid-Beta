package fi;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class va extends c1 {
    public final sb f11830b0;

    public va(sb sbVar, Context context, boolean z10) {
        super(context, z10);
        this.f11830b0 = sbVar;
    }

    @Override
    public final void receivedAmplitude(double d) {
        w6 w6Var = this.f11830b0.O0;
        if (w6Var != null) {
            w6Var.f11863g0 = Utilities.clamp((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override
    public final void toggleDual() {
        int i10;
        super.toggleDual();
        sb sbVar = this.f11830b0;
        sbVar.F0.setValue(isDual());
        ec ecVar = sbVar.F0;
        if (isDual()) {
            i10 = R.string.AccDescrDualCameraOn;
        } else {
            i10 = R.string.AccDescrDualCameraOff;
        }
        ecVar.setContentDescription(LocaleController.getString(i10));
        sbVar.d0(sbVar.B());
    }

    @Override
    public final void u(boolean z10) {
        sb sbVar = this.f11830b0;
        sbVar.f11650o1.b(sbVar.f11614c1.getText());
        sbVar.f11650o1.a(false, z10, sbVar.f11638k0);
    }
}
