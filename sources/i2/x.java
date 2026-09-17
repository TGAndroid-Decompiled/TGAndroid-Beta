package i2;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vc;
import org.telegram.ui.gh0;
public final class x implements e2.m, p.a, GenericProvider {
    public final int f10916a;
    public final boolean f10917b;

    public x(int i10, boolean z10) {
        this.f10916a = i10;
        this.f10917b = z10;
    }

    @Override
    public oc c(vc vcVar) {
        return vcVar.k(this.f10917b);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f10916a) {
            case 0:
                ((b2.z0) obj).onShuffleModeEnabledChanged(this.f10917b);
                return;
            default:
                ((b2.z0) obj).onSkipSilenceEnabledChanged(this.f10917b);
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Void r22 = (Void) obj;
        Bundle i10 = a4.a.i("afterSignup", this.f10917b);
        gh0 gh0Var = new gh0();
        gh0Var.l0(i10);
        return gh0Var;
    }
}
