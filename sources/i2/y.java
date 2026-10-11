package i2;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.sc;
import org.telegram.ui.eh0;
public final class y implements e2.m, e2.h, p.a, GenericProvider {
    public final int f11934a;
    public final boolean f11935b;

    public y(int i10, boolean z10) {
        this.f11934a = i10;
        this.f11935b = z10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f11934a) {
            case 2:
                ((m4.g1) obj).X(this.f11935b);
                return;
            case 3:
                ((m4.g1) obj).o0(this.f11935b);
                return;
            default:
                ((m4.g1) obj).x(this.f11935b);
                return;
        }
    }

    @Override
    public sc c(ad adVar) {
        return adVar.k(this.f11935b);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f11934a) {
            case 0:
                ((b2.z0) obj).onShuffleModeEnabledChanged(this.f11935b);
                return;
            default:
                ((b2.z0) obj).onSkipSilenceEnabledChanged(this.f11935b);
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Void r22 = (Void) obj;
        Bundle i10 = a1.g.i("afterSignup", this.f11935b);
        eh0 eh0Var = new eh0();
        eh0Var.l0(i10);
        return eh0Var;
    }
}
