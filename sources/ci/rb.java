package ci;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class rb extends d1 {
    public final oc f5467b0;

    public rb(oc ocVar, Context context, boolean z10) {
        super(context, z10);
        this.f5467b0 = ocVar;
    }

    @Override
    public final void receivedAmplitude(double d) {
        l7 l7Var = this.f5467b0.O0;
        if (l7Var != null) {
            l7Var.f4947g0 = Utilities.clamp((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override
    public final void toggleDual() {
        int i10;
        super.toggleDual();
        oc ocVar = this.f5467b0;
        ocVar.F0.setValue(isDual());
        bd bdVar = ocVar.F0;
        if (isDual()) {
            i10 = R.string.AccDescrDualCameraOn;
        } else {
            i10 = R.string.AccDescrDualCameraOff;
        }
        bdVar.setContentDescription(LocaleController.getString(i10));
        ocVar.e0(ocVar.C());
    }

    @Override
    public final void u(boolean z10) {
        oc ocVar = this.f5467b0;
        ocVar.f5246o1.b(ocVar.f5210c1.getText());
        ocVar.f5246o1.a(false, z10, ocVar.f5234k0);
    }
}
