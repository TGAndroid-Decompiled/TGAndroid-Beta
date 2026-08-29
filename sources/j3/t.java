package j3;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.ng0;
public final class t implements f5.j, p.a, GenericProvider {
    public final int f10770a;
    public final boolean f10771b;

    public t(int i10, boolean z10) {
        this.f10770a = i10;
        this.f10771b = z10;
    }

    @Override
    public mc c(tc tcVar) {
        return tcVar.k(this.f10771b);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f10770a) {
            case 0:
                ((a2) obj).onShuffleModeEnabledChanged(this.f10771b);
                return;
            default:
                ((a2) obj).onSkipSilenceEnabledChanged(this.f10771b);
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Void r22 = (Void) obj;
        Bundle i10 = a4.w.i("afterSignup", this.f10771b);
        ng0 ng0Var = new ng0();
        ng0Var.l0(i10);
        return ng0Var;
    }
}
