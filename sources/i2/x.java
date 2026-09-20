package i2;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.gh0;
public final class x implements e2.m, p.a, GenericProvider {
    public final int f10917a;
    public final boolean f10918b;

    public x(int i10, boolean z10) {
        this.f10917a = i10;
        this.f10918b = z10;
    }

    @Override
    public pc c(xc xcVar) {
        return xcVar.k(this.f10918b);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f10917a) {
            case 0:
                ((b2.z0) obj).onShuffleModeEnabledChanged(this.f10918b);
                return;
            default:
                ((b2.z0) obj).onSkipSilenceEnabledChanged(this.f10918b);
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Void r22 = (Void) obj;
        Bundle i10 = a4.a.i("afterSignup", this.f10918b);
        gh0 gh0Var = new gh0();
        gh0Var.l0(i10);
        return gh0Var;
    }
}
