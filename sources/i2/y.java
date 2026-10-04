package i2;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.ch0;
public final class y implements e2.m, e2.h, p.a, GenericProvider {
    public final int f11885a;
    public final boolean f11886b;

    public y(int i10, boolean z10) {
        this.f11885a = i10;
        this.f11886b = z10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f11885a) {
            case 2:
                ((m4.e1) obj).X(this.f11886b);
                return;
            case 3:
                ((m4.e1) obj).o0(this.f11886b);
                return;
            default:
                ((m4.e1) obj).x(this.f11886b);
                return;
        }
    }

    @Override
    public rc c(yc ycVar) {
        return ycVar.k(this.f11886b);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f11885a) {
            case 0:
                ((b2.z0) obj).onShuffleModeEnabledChanged(this.f11886b);
                return;
            default:
                ((b2.z0) obj).onSkipSilenceEnabledChanged(this.f11886b);
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Void r22 = (Void) obj;
        Bundle i10 = a4.a.i("afterSignup", this.f11886b);
        ch0 ch0Var = new ch0();
        ch0Var.l0(i10);
        return ch0Var;
    }
}
