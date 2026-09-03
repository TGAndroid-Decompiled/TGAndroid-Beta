package j3;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.xg0;
public final class x implements h5.j, p.a, GenericProvider {
    public final int f8855a;
    public final boolean f8856b;

    public x(int i10, boolean z4) {
        this.f8855a = i10;
        this.f8856b = z4;
    }

    @Override
    public ic c(qc qcVar) {
        return qcVar.k(this.f8856b);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f8855a) {
            case 0:
                ((y1) obj).onShuffleModeEnabledChanged(this.f8856b);
                return;
            default:
                ((y1) obj).onSkipSilenceEnabledChanged(this.f8856b);
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Void r22 = (Void) obj;
        Bundle i10 = android.support.v4.media.a.i("afterSignup", this.f8856b);
        xg0 xg0Var = new xg0();
        xg0Var.l0(i10);
        return xg0Var;
    }
}
