package i2;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.gh0;
public final class y implements e2.m, e2.h, p.a, GenericProvider {
    public final int f11933a;
    public final boolean f11934b;

    public y(int i10, boolean z10) {
        this.f11933a = i10;
        this.f11934b = z10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f11933a) {
            case 2:
                ((m4.g1) obj).X(this.f11934b);
                return;
            case 3:
                ((m4.g1) obj).p0(this.f11934b);
                return;
            default:
                ((m4.g1) obj).x(this.f11934b);
                return;
        }
    }

    @Override
    public sc c(zc zcVar) {
        return zcVar.k(this.f11934b);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f11933a) {
            case 0:
                ((b2.z0) obj).onShuffleModeEnabledChanged(this.f11934b);
                return;
            default:
                ((b2.z0) obj).onSkipSilenceEnabledChanged(this.f11934b);
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Void r22 = (Void) obj;
        Bundle i10 = a1.g.i("afterSignup", this.f11934b);
        gh0 gh0Var = new gh0();
        gh0Var.l0(i10);
        return gh0Var;
    }
}
