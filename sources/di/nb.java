package di;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class nb extends c1 {
    public final kc f7482b0;

    public nb(kc kcVar, Context context, boolean z10) {
        super(context, z10);
        this.f7482b0 = kcVar;
    }

    @Override
    public final void receivedAmplitude(double d) {
        i7 i7Var = this.f7482b0.O0;
        if (i7Var != null) {
            i7Var.f7058g0 = Utilities.clamp((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override
    public final void toggleDual() {
        int i10;
        super.toggleDual();
        kc kcVar = this.f7482b0;
        kcVar.F0.setValue(isDual());
        wc wcVar = kcVar.F0;
        if (isDual()) {
            i10 = R.string.AccDescrDualCameraOn;
        } else {
            i10 = R.string.AccDescrDualCameraOff;
        }
        wcVar.setContentDescription(LocaleController.getString(i10));
        kcVar.d0(kcVar.B());
    }

    @Override
    public final void u(boolean z10) {
        kc kcVar = this.f7482b0;
        kcVar.f7282o1.b(kcVar.f7246c1.getText());
        kcVar.f7282o1.a(false, z10, kcVar.f7270k0);
    }
}
