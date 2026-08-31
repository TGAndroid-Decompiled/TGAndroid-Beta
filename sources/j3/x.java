package j3;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.wg0;
public final class x implements h5.j, p.a, GenericProvider {
    public final int f9470a;
    public final boolean f9471b;

    public x(int i10, boolean z4) {
        this.f9470a = i10;
        this.f9471b = z4;
    }

    @Override
    public ic c(qc qcVar) {
        return qcVar.k(this.f9471b);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f9470a) {
            case 0:
                ((y1) obj).onShuffleModeEnabledChanged(this.f9471b);
                return;
            default:
                ((y1) obj).onSkipSilenceEnabledChanged(this.f9471b);
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Void r22 = (Void) obj;
        Bundle i10 = android.support.v4.media.a.i("afterSignup", this.f9471b);
        wg0 wg0Var = new wg0();
        wg0Var.l0(i10);
        return wg0Var;
    }
}
