package i2;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vc;
import org.telegram.ui.eh0;
public final class x implements e2.m, p.a, GenericProvider {
    public final int f10915a;
    public final boolean f10916b;

    public x(int i10, boolean z10) {
        this.f10915a = i10;
        this.f10916b = z10;
    }

    @Override
    public oc c(vc vcVar) {
        return vcVar.k(this.f10916b);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f10915a) {
            case 0:
                ((b2.z0) obj).onShuffleModeEnabledChanged(this.f10916b);
                return;
            default:
                ((b2.z0) obj).onSkipSilenceEnabledChanged(this.f10916b);
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Void r22 = (Void) obj;
        Bundle i10 = a4.a.i("afterSignup", this.f10916b);
        eh0 eh0Var = new eh0();
        eh0Var.l0(i10);
        return eh0Var;
    }
}
