package i2;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.jh0;
public final class x implements e2.o, e2.j, p.a, GenericProvider {
    public final int f11215a;
    public final boolean f11216b;

    public x(int i10, boolean z10) {
        this.f11215a = i10;
        this.f11216b = z10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f11215a) {
            case 2:
                ((m4.m1) obj).X(this.f11216b);
                return;
            case 3:
                ((m4.m1) obj).q0(this.f11216b);
                return;
            default:
                ((m4.m1) obj).w(this.f11216b);
                return;
        }
    }

    @Override
    public sc c(zc zcVar) {
        return zcVar.k(this.f11216b);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f11215a) {
            case 0:
                ((b2.e1) obj).onShuffleModeEnabledChanged(this.f11216b);
                return;
            default:
                ((b2.e1) obj).onSkipSilenceEnabledChanged(this.f11216b);
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Void r22 = (Void) obj;
        Bundle h = a1.g.h("afterSignup", this.f11216b);
        jh0 jh0Var = new jh0();
        jh0Var.l0(h);
        return jh0Var;
    }
}
