package i2;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.yg0;
public final class y implements e2.m, e2.h, p.a, GenericProvider {
    public final int f10923a;
    public final boolean f10924b;

    public y(int i10, boolean z10) {
        this.f10923a = i10;
        this.f10924b = z10;
    }

    @Override
    public rc a(yc ycVar) {
        return ycVar.k(this.f10924b);
    }

    @Override
    public void accept(Object obj) {
        switch (this.f10923a) {
            case 2:
                ((m4.e1) obj).X(this.f10924b);
                return;
            case 3:
                ((m4.e1) obj).o0(this.f10924b);
                return;
            default:
                ((m4.e1) obj).x(this.f10924b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f10923a) {
            case 0:
                ((b2.z0) obj).onShuffleModeEnabledChanged(this.f10924b);
                return;
            default:
                ((b2.z0) obj).onSkipSilenceEnabledChanged(this.f10924b);
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Void r22 = (Void) obj;
        Bundle i10 = a4.a.i("afterSignup", this.f10924b);
        yg0 yg0Var = new yg0();
        yg0Var.l0(i10);
        return yg0Var;
    }
}
