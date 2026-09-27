package ci;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class nb extends d1 {
    public final kc f5225b0;

    public nb(kc kcVar, Context context, boolean z10) {
        super(context, z10);
        this.f5225b0 = kcVar;
    }

    @Override
    public final void receivedAmplitude(double d) {
        j7 j7Var = this.f5225b0.O0;
        if (j7Var != null) {
            j7Var.f4840g0 = Utilities.clamp((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override
    public final void toggleDual() {
        int i10;
        super.toggleDual();
        kc kcVar = this.f5225b0;
        kcVar.F0.setValue(isDual());
        xc xcVar = kcVar.F0;
        if (isDual()) {
            i10 = R.string.AccDescrDualCameraOn;
        } else {
            i10 = R.string.AccDescrDualCameraOff;
        }
        xcVar.setContentDescription(LocaleController.getString(i10));
        kcVar.e0(kcVar.C());
    }

    @Override
    public final void u(boolean z10) {
        kc kcVar = this.f5225b0;
        kcVar.f5027o1.b(kcVar.f4991c1.getText());
        kcVar.f5027o1.a(false, z10, kcVar.f5015k0);
    }
}
