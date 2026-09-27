package i2;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.bh0;
public final class y implements e2.m, e2.h, p.a, GenericProvider {
    public final int f10912a;
    public final boolean f10913b;

    public y(int i10, boolean z10) {
        this.f10912a = i10;
        this.f10913b = z10;
    }

    @Override
    public qc a(xc xcVar) {
        return xcVar.k(this.f10913b);
    }

    @Override
    public void accept(Object obj) {
        switch (this.f10912a) {
            case 2:
                ((m4.e1) obj).X(this.f10913b);
                return;
            case 3:
                ((m4.e1) obj).o0(this.f10913b);
                return;
            default:
                ((m4.e1) obj).x(this.f10913b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f10912a) {
            case 0:
                ((b2.z0) obj).onShuffleModeEnabledChanged(this.f10913b);
                return;
            default:
                ((b2.z0) obj).onSkipSilenceEnabledChanged(this.f10913b);
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Void r22 = (Void) obj;
        Bundle i10 = a4.a.i("afterSignup", this.f10913b);
        bh0 bh0Var = new bh0();
        bh0Var.l0(i10);
        return bh0Var;
    }
}
