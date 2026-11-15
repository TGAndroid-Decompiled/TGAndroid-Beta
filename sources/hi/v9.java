package hi;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
public final class v9 extends c1 {
    public final sa f15256c0;

    public v9(sa saVar, Context context, boolean z10) {
        super(context, z10);
        this.f15256c0 = saVar;
    }

    @Override
    public final void receivedAmplitude(double d) {
        f6 f6Var = this.f15256c0.P0;
        if (f6Var != null) {
            f6Var.f14287h0 = Utilities.i((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override
    public final void toggleDual() {
        int i7;
        super.toggleDual();
        sa saVar = this.f15256c0;
        saVar.G0.setValue(isDual());
        eb ebVar = saVar.G0;
        if (isDual()) {
            i7 = 2131754886;
        } else {
            i7 = 2131754887;
        }
        ebVar.setContentDescription(hd.M0(i7, null));
        saVar.d0(saVar.B());
    }

    @Override
    public final void u(boolean z10) {
        sa saVar = this.f15256c0;
        saVar.f15083p1.b(saVar.f15048d1.getText());
        saVar.f15083p1.a(false, z10, saVar.f15072l0);
    }
}
