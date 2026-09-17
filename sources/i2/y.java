package i2;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.eh0;
public final class y implements e2.m, p.a, GenericProvider {
    public final int f11778a;
    public final boolean f11779b;

    public y(int i10, boolean z10) {
        this.f11778a = i10;
        this.f11779b = z10;
    }

    @Override
    public qc c(yc ycVar) {
        return ycVar.k(this.f11779b);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f11778a) {
            case 0:
                ((b2.z0) obj).onShuffleModeEnabledChanged(this.f11779b);
                return;
            default:
                ((b2.z0) obj).onSkipSilenceEnabledChanged(this.f11779b);
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Void r22 = (Void) obj;
        Bundle i10 = a4.a.i("afterSignup", this.f11779b);
        eh0 eh0Var = new eh0();
        eh0Var.l0(i10);
        return eh0Var;
    }
}
