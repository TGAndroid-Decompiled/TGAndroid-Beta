package ci;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class ob extends d1 {
    public final lc f5263b0;

    public ob(lc lcVar, Context context, boolean z10) {
        super(context, z10);
        this.f5263b0 = lcVar;
    }

    @Override
    public final void receivedAmplitude(double d) {
        j7 j7Var = this.f5263b0.O0;
        if (j7Var != null) {
            j7Var.f4838g0 = Utilities.clamp((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override
    public final void toggleDual() {
        int i10;
        super.toggleDual();
        lc lcVar = this.f5263b0;
        lcVar.F0.setValue(isDual());
        yc ycVar = lcVar.F0;
        if (isDual()) {
            i10 = R.string.AccDescrDualCameraOn;
        } else {
            i10 = R.string.AccDescrDualCameraOff;
        }
        ycVar.setContentDescription(LocaleController.getString(i10));
        lcVar.e0(lcVar.C());
    }

    @Override
    public final void u(boolean z10) {
        lc lcVar = this.f5263b0;
        lcVar.f5071o1.b(lcVar.f5035c1.getText());
        lcVar.f5071o1.a(false, z10, lcVar.f5059k0);
    }
}
