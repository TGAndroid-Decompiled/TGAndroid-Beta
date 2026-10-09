package ci;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class ob extends c1 {
    public final lc f5702b0;

    public ob(lc lcVar, Context context, boolean z10) {
        super(context, z10);
        this.f5702b0 = lcVar;
    }

    @Override
    public final void receivedAmplitude(double d) {
        j7 j7Var = this.f5702b0.O0;
        if (j7Var != null) {
            j7Var.f5261g0 = Utilities.clamp((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override
    public final void toggleDual() {
        int i10;
        super.toggleDual();
        lc lcVar = this.f5702b0;
        lcVar.F0.setValue(isDual());
        yc ycVar = lcVar.F0;
        if (isDual()) {
            i10 = R.string.AccDescrDualCameraOn;
        } else {
            i10 = R.string.AccDescrDualCameraOff;
        }
        ycVar.setContentDescription(LocaleController.getString(i10));
        lcVar.d0(lcVar.B());
    }

    @Override
    public final void u(boolean z10) {
        lc lcVar = this.f5702b0;
        lcVar.f5504o1.b(lcVar.f5467c1.getText());
        lcVar.f5504o1.a(false, z10, lcVar.f5492k0);
    }
}
