package i2;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.zg0;
public final class y implements e2.m, e2.h, p.a, GenericProvider {
    public final int f10909a;
    public final boolean f10910b;

    public y(int i10, boolean z10) {
        this.f10909a = i10;
        this.f10910b = z10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f10909a) {
            case 2:
                ((m4.f1) obj).X(this.f10910b);
                return;
            case 3:
                ((m4.f1) obj).o0(this.f10910b);
                return;
            default:
                ((m4.f1) obj).x(this.f10910b);
                return;
        }
    }

    @Override
    public qc b(xc xcVar) {
        return xcVar.k(this.f10910b);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f10909a) {
            case 0:
                ((b2.z0) obj).onShuffleModeEnabledChanged(this.f10910b);
                return;
            default:
                ((b2.z0) obj).onSkipSilenceEnabledChanged(this.f10910b);
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Void r22 = (Void) obj;
        Bundle i10 = a4.a.i("afterSignup", this.f10910b);
        zg0 zg0Var = new zg0();
        zg0Var.l0(i10);
        return zg0Var;
    }
}
