package h3;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.ng0;
public final class t implements d5.k, p.a, GenericProvider {
    public final int f9733a;
    public final boolean f9734b;

    public t(int i9, boolean z10) {
        this.f9733a = i9;
        this.f9734b = z10;
    }

    @Override
    public gc c(oc ocVar) {
        return ocVar.k(this.f9734b);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f9733a) {
            case 0:
                ((a2) obj).onShuffleModeEnabledChanged(this.f9734b);
                return;
            default:
                ((a2) obj).onSkipSilenceEnabledChanged(this.f9734b);
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Void r22 = (Void) obj;
        Bundle i9 = aa.d.i("afterSignup", this.f9734b);
        ng0 ng0Var = new ng0();
        ng0Var.k0(i9);
        return ng0Var;
    }
}
