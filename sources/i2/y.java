package i2;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.tc;
import org.telegram.ui.fh0;
public final class y implements e2.m, e2.h, p.a, GenericProvider {
    public final int f11935a;
    public final boolean f11936b;

    public y(int i10, boolean z10) {
        this.f11935a = i10;
        this.f11936b = z10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f11935a) {
            case 2:
                ((m4.f1) obj).X(this.f11936b);
                return;
            case 3:
                ((m4.f1) obj).o0(this.f11936b);
                return;
            default:
                ((m4.f1) obj).x(this.f11936b);
                return;
        }
    }

    @Override
    public tc c(ad adVar) {
        return adVar.k(this.f11936b);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f11935a) {
            case 0:
                ((b2.z0) obj).onShuffleModeEnabledChanged(this.f11936b);
                return;
            default:
                ((b2.z0) obj).onSkipSilenceEnabledChanged(this.f11936b);
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Void r22 = (Void) obj;
        Bundle i10 = a1.g.i("afterSignup", this.f11936b);
        fh0 fh0Var = new fh0();
        fh0Var.l0(i10);
        return fh0Var;
    }
}
