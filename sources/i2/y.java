package i2;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.ch0;
public final class y implements e2.m, e2.h, p.a, GenericProvider {
    public final int f11884a;
    public final boolean f11885b;

    public y(int i10, boolean z10) {
        this.f11884a = i10;
        this.f11885b = z10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f11884a) {
            case 2:
                ((m4.e1) obj).X(this.f11885b);
                return;
            case 3:
                ((m4.e1) obj).o0(this.f11885b);
                return;
            default:
                ((m4.e1) obj).x(this.f11885b);
                return;
        }
    }

    @Override
    public rc c(yc ycVar) {
        return ycVar.k(this.f11885b);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f11884a) {
            case 0:
                ((b2.z0) obj).onShuffleModeEnabledChanged(this.f11885b);
                return;
            default:
                ((b2.z0) obj).onSkipSilenceEnabledChanged(this.f11885b);
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Void r22 = (Void) obj;
        Bundle i10 = a4.a.i("afterSignup", this.f11885b);
        ch0 ch0Var = new ch0();
        ch0Var.l0(i10);
        return ch0Var;
    }
}
