package di;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class sb extends d1 {
    public final pc f8136b0;

    public sb(pc pcVar, Context context, boolean z10) {
        super(context, z10);
        this.f8136b0 = pcVar;
    }

    @Override
    public final void receivedAmplitude(double d) {
        l7 l7Var = this.f8136b0.O0;
        if (l7Var != null) {
            l7Var.f7545g0 = Utilities.clamp((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override
    public final void toggleDual() {
        int i10;
        super.toggleDual();
        pc pcVar = this.f8136b0;
        pcVar.F0.setValue(isDual());
        bd bdVar = pcVar.F0;
        if (isDual()) {
            i10 = R.string.AccDescrDualCameraOn;
        } else {
            i10 = R.string.AccDescrDualCameraOff;
        }
        bdVar.setContentDescription(LocaleController.getString(i10));
        pcVar.e0(pcVar.C());
    }

    @Override
    public final void u(boolean z10) {
        pc pcVar = this.f8136b0;
        pcVar.f7887o1.b(pcVar.f7850c1.getText());
        pcVar.f7887o1.a(false, z10, pcVar.f7875k0);
    }
}
