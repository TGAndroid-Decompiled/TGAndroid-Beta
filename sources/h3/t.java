package h3;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.mc;
import org.telegram.ui.qg0;

public final class t implements d5.k, p.a, GenericProvider {

    public final int f8157a;

    public final boolean f8158b;

    public t(int i10, boolean z10) {
        this.f8157a = i10;
        this.f8158b = z10;
    }

    @Override
    public ec c(mc mcVar) {
        return mcVar.k(this.f8158b);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f8157a) {
            case 0:
                ((a2) obj).onShuffleModeEnabledChanged(this.f8158b);
                break;
            default:
                ((a2) obj).onSkipSilenceEnabledChanged(this.f8158b);
                break;
        }
    }

    @Override
    public Object provide(Object obj) {
        Bundle bundleH = a9.p.h("afterSignup", this.f8158b);
        qg0 qg0Var = new qg0();
        qg0Var.l0(bundleH);
        return qg0Var;
    }
}
