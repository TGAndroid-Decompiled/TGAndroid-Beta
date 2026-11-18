package hi;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
public final class w9 extends d1 {
    public final ta f15695c0;

    public w9(ta taVar, Context context, boolean z10) {
        super(context, z10);
        this.f15695c0 = taVar;
    }

    @Override
    public final void receivedAmplitude(double d) {
        e6 e6Var = this.f15695c0.P0;
        if (e6Var != null) {
            e6Var.f14573h0 = Utilities.i((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override
    public final void toggleDual() {
        int i7;
        super.toggleDual();
        ta taVar = this.f15695c0;
        taVar.G0.setValue(isDual());
        fb fbVar = taVar.G0;
        if (isDual()) {
            i7 = 2131754886;
        } else {
            i7 = 2131754887;
        }
        fbVar.setContentDescription(gd.M0(i7, null));
        taVar.d0(taVar.B());
    }

    @Override
    public final void u(boolean z10) {
        ta taVar = this.f15695c0;
        taVar.f15471p1.b(taVar.f15436d1.getText());
        taVar.f15471p1.a(false, z10, taVar.f15460l0);
    }
}
