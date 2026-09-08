package i2;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.eh0;
public final class y implements e2.m, p.a, GenericProvider {
    public final int f11804a;
    public final boolean f11805b;

    public y(int i10, boolean z10) {
        this.f11804a = i10;
        this.f11805b = z10;
    }

    @Override
    public qc c(yc ycVar) {
        return ycVar.k(this.f11805b);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f11804a) {
            case 0:
                ((b2.z0) obj).onShuffleModeEnabledChanged(this.f11805b);
                return;
            default:
                ((b2.z0) obj).onSkipSilenceEnabledChanged(this.f11805b);
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Void r22 = (Void) obj;
        Bundle i10 = a4.a.i("afterSignup", this.f11805b);
        eh0 eh0Var = new eh0();
        eh0Var.l0(i10);
        return eh0Var;
    }
}
