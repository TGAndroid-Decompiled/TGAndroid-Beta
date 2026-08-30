package j3;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.vg0;
public final class x implements h5.j, p.a, GenericProvider {
    public final int f8873a;
    public final boolean f8874b;

    public x(int i10, boolean z4) {
        this.f8873a = i10;
        this.f8874b = z4;
    }

    @Override
    public ic c(qc qcVar) {
        return qcVar.k(this.f8874b);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f8873a) {
            case 0:
                ((y1) obj).onShuffleModeEnabledChanged(this.f8874b);
                return;
            default:
                ((y1) obj).onSkipSilenceEnabledChanged(this.f8874b);
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Void r22 = (Void) obj;
        Bundle i10 = android.support.v4.media.a.i("afterSignup", this.f8874b);
        vg0 vg0Var = new vg0();
        vg0Var.l0(i10);
        return vg0Var;
    }
}
