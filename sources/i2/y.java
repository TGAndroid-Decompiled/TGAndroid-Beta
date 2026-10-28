package i2;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.rg0;
public final class y implements e2.o, e2.j, p.a, GenericProvider {
    public final int f13787a;
    public final boolean f13788b;

    public y(int i10, boolean z10) {
        this.f13787a = i10;
        this.f13788b = z10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f13787a) {
            case 2:
                ((m4.n1) obj).X(this.f13788b);
                return;
            case 3:
                ((m4.n1) obj).q0(this.f13788b);
                return;
            default:
                ((m4.n1) obj).w(this.f13788b);
                return;
        }
    }

    @Override
    public qc c(wc wcVar) {
        return wcVar.k(this.f13788b);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f13787a) {
            case 0:
                ((b2.e1) obj).onShuffleModeEnabledChanged(this.f13788b);
                return;
            default:
                ((b2.e1) obj).onSkipSilenceEnabledChanged(this.f13788b);
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Void r22 = (Void) obj;
        Bundle i10 = a1.g.i("afterSignup", this.f13788b);
        rg0 rg0Var = new rg0();
        rg0Var.i0(i10);
        return rg0Var;
    }
}
