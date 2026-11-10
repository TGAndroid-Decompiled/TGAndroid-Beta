package fi;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.id;
public final class y9 extends b1 {
    public final va f13220b0;

    public y9(va vaVar, Context context, boolean z9) {
        super(context, z9);
        this.f13220b0 = vaVar;
    }

    @Override
    public final void receivedAmplitude(double d) {
        g6 g6Var = this.f13220b0.O0;
        if (g6Var != null) {
            g6Var.f12086g0 = Utilities.i((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override
    public final void toggleDual() {
        int i7;
        super.toggleDual();
        va vaVar = this.f13220b0;
        vaVar.F0.setValue(isDual());
        hb hbVar = vaVar.F0;
        if (isDual()) {
            i7 = 2131754886;
        } else {
            i7 = 2131754887;
        }
        hbVar.setContentDescription(id.M0(i7, null));
        vaVar.d0(vaVar.B());
    }

    @Override
    public final void u(boolean z9) {
        va vaVar = this.f13220b0;
        vaVar.f12981o1.b(vaVar.f12946c1.getText());
        vaVar.f12981o1.a(false, z9, vaVar.f12970k0);
    }
}
