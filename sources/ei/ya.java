package ei;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class ya extends c1 {
    public final vb f10151b0;

    public ya(vb vbVar, Context context, boolean z10) {
        super(context, z10);
        this.f10151b0 = vbVar;
    }

    @Override
    public final void receivedAmplitude(double d) {
        z6 z6Var = this.f10151b0.O0;
        if (z6Var != null) {
            z6Var.f10216g0 = Utilities.clamp((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override
    public final void toggleDual() {
        int i10;
        super.toggleDual();
        vb vbVar = this.f10151b0;
        vbVar.F0.setValue(isDual());
        ic icVar = vbVar.F0;
        if (isDual()) {
            i10 = R.string.AccDescrDualCameraOn;
        } else {
            i10 = R.string.AccDescrDualCameraOff;
        }
        icVar.setContentDescription(LocaleController.getString(i10));
        vbVar.d0(vbVar.B());
    }

    @Override
    public final void u(boolean z10) {
        vb vbVar = this.f10151b0;
        vbVar.f9993o1.b(vbVar.f9957c1.getText());
        vbVar.f9993o1.a(false, z10, vbVar.f9981k0);
    }
}
