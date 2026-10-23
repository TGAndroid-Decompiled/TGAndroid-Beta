package i2;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.rg0;
public final class x implements e2.o, e2.j, p.a, GenericProvider {
    public final int f12645a;
    public final boolean f12646b;

    public x(int i10, boolean z10) {
        this.f12645a = i10;
        this.f12646b = z10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f12645a) {
            case 2:
                ((m4.m1) obj).X(this.f12646b);
                return;
            case 3:
                ((m4.m1) obj).q0(this.f12646b);
                return;
            default:
                ((m4.m1) obj).w(this.f12646b);
                return;
        }
    }

    @Override
    public qc c(xc xcVar) {
        return xcVar.k(this.f12646b);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f12645a) {
            case 0:
                ((b2.d1) obj).onShuffleModeEnabledChanged(this.f12646b);
                return;
            default:
                ((b2.d1) obj).onSkipSilenceEnabledChanged(this.f12646b);
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Void r22 = (Void) obj;
        Bundle h = a1.g.h("afterSignup", this.f12646b);
        rg0 rg0Var = new rg0();
        rg0Var.l0(h);
        return rg0Var;
    }
}
