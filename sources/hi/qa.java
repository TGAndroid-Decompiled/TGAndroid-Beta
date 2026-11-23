package hi;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
public final class qa extends l1 {
    public final nb f15246c0;

    public qa(nb nbVar, Context context, boolean z10) {
        super(context, z10);
        this.f15246c0 = nbVar;
    }

    @Override
    public final void receivedAmplitude(double d) {
        n6 n6Var = this.f15246c0.P0;
        if (n6Var != null) {
            n6Var.f15025h0 = Utilities.i((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override
    public final void toggleDual() {
        int i7;
        super.toggleDual();
        nb nbVar = this.f15246c0;
        nbVar.G0.setValue(isDual());
        zb zbVar = nbVar.G0;
        if (isDual()) {
            i7 = 2131754886;
        } else {
            i7 = 2131754887;
        }
        zbVar.setContentDescription(gd.N0(i7, null));
        nbVar.d0(nbVar.B());
    }

    @Override
    public final void u(boolean z10) {
        nb nbVar = this.f15246c0;
        nbVar.f15102p1.b(nbVar.f15067d1.getText());
        nbVar.f15102p1.a(false, z10, nbVar.f15091l0);
    }
}
