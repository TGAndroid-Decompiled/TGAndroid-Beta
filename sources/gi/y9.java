package gi;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
public final class y9 extends b1 {
    public final va f13985c0;

    public y9(va vaVar, Context context, boolean z10) {
        super(context, z10);
        this.f13985c0 = vaVar;
    }

    @Override
    public final void receivedAmplitude(double d) {
        h6 h6Var = this.f13985c0.P0;
        if (h6Var != null) {
            h6Var.f12895h0 = Utilities.i((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override
    public final void toggleDual() {
        int i3;
        super.toggleDual();
        va vaVar = this.f13985c0;
        vaVar.G0.setValue(isDual());
        hb hbVar = vaVar.G0;
        if (isDual()) {
            i3 = 2131754886;
        } else {
            i3 = 2131754887;
        }
        hbVar.setContentDescription(bd.M0(i3, null));
        vaVar.d0(vaVar.B());
    }

    @Override
    public final void u(boolean z10) {
        va vaVar = this.f13985c0;
        vaVar.f13746p1.b(vaVar.f13710d1.getText());
        vaVar.f13746p1.a(false, z10, vaVar.f13734l0);
    }
}
