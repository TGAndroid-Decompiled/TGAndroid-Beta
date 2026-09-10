package i2;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.fh0;
public final class x implements e2.m, p.a, GenericProvider {
    public final int f10395a;
    public final boolean f10396b;

    public x(int i10, boolean z10) {
        this.f10395a = i10;
        this.f10396b = z10;
    }

    @Override
    public pc c(wc wcVar) {
        return wcVar.k(this.f10396b);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f10395a) {
            case 0:
                ((b2.z0) obj).onShuffleModeEnabledChanged(this.f10396b);
                return;
            default:
                ((b2.z0) obj).onSkipSilenceEnabledChanged(this.f10396b);
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Void r22 = (Void) obj;
        Bundle i10 = a4.a.i("afterSignup", this.f10396b);
        fh0 fh0Var = new fh0();
        fh0Var.l0(i10);
        return fh0Var;
    }
}
