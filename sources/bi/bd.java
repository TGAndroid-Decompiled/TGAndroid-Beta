package bi;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class bd extends i1 {
    public final ce f2383b0;

    public bd(ce ceVar, Context context, boolean z10) {
        super(context, z10);
        this.f2383b0 = ceVar;
    }

    @Override
    public final void receivedAmplitude(double d) {
        m8 m8Var = this.f2383b0.O0;
        if (m8Var != null) {
            m8Var.f3114g0 = Utilities.clamp((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override
    public final void toggleDual() {
        int i10;
        super.toggleDual();
        ce ceVar = this.f2383b0;
        ceVar.F0.setValue(isDual());
        oe oeVar = ceVar.F0;
        if (isDual()) {
            i10 = R.string.AccDescrDualCameraOn;
        } else {
            i10 = R.string.AccDescrDualCameraOff;
        }
        oeVar.setContentDescription(LocaleController.getString(i10));
        ceVar.e0(ceVar.C());
    }

    @Override
    public final void u(boolean z10) {
        ce ceVar = this.f2383b0;
        ceVar.f2475o1.b(ceVar.f2439c1.getText());
        ceVar.f2475o1.a(false, z10, ceVar.f2463k0);
    }
}
