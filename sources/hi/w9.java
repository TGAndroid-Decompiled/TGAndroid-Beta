package hi;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
public final class w9 extends c1 {
    public final ta f15643c0;

    public w9(ta taVar, Context context, boolean z10) {
        super(context, z10);
        this.f15643c0 = taVar;
    }

    @Override
    public final void receivedAmplitude(double d) {
        e6 e6Var = this.f15643c0.P0;
        if (e6Var != null) {
            e6Var.f14522h0 = Utilities.i((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override
    public final void toggleDual() {
        int i7;
        super.toggleDual();
        ta taVar = this.f15643c0;
        taVar.G0.setValue(isDual());
        fb fbVar = taVar.G0;
        if (isDual()) {
            i7 = 2131754886;
        } else {
            i7 = 2131754887;
        }
        fbVar.setContentDescription(hd.N0(i7, null));
        taVar.d0(taVar.B());
    }

    @Override
    public final void u(boolean z10) {
        ta taVar = this.f15643c0;
        taVar.f15435p1.b(taVar.f15400d1.getText());
        taVar.f15435p1.a(false, z10, taVar.f15424l0);
    }
}
