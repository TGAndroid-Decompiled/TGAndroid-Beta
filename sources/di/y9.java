package di;

import android.content.DialogInterface;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
public final class y9 implements DialogInterface.OnDismissListener {
    public final int f9797a = 0;
    public final int f9798b;
    public final is f9799c;

    public y9(int i7, ka kaVar) {
        this.f9798b = i7;
        this.f9799c = kaVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9797a) {
            case 0:
                ns.f(this.f9798b).n((ka) this.f9799c, 223);
                return;
            default:
                tg.g0 g0Var = (tg.g0) this.f9799c;
                g0Var.o0(false);
                g0Var.B0(this.f9798b);
                return;
        }
    }

    public y9(tg.g0 g0Var, int i7) {
        this.f9799c = g0Var;
        this.f9798b = i7;
    }
}
