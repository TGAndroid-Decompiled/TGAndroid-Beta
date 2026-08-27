package lh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

public final class wa extends c1 {
    public final sb U;

    public wa(sb sbVar, Context context, boolean z10) {
        super(context, z10);
        this.U = sbVar;
    }

    @Override
    public final void receivedAmplitude(double d) {
        y6 y6Var = this.U.K0;
        if (y6Var != null) {
            y6Var.f17089c0 = Utilities.clamp((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override
    public final void toggleDual() {
        super.toggleDual();
        sb sbVar = this.U;
        sbVar.B0.setValue(isDual());
        sbVar.B0.setContentDescription(LocaleController.getString(isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
        sbVar.e0(sbVar.C());
    }

    @Override
    public final void u(boolean z10) {
        sb sbVar = this.U;
        sbVar.f16777k1.b(sbVar.Y0.getText());
        sbVar.f16777k1.a(false, z10, sbVar.f16764g0);
    }
}
