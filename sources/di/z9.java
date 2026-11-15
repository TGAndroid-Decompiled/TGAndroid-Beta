package di;

import android.content.DialogInterface;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
public final class z9 implements DialogInterface.OnDismissListener {
    public final int f9847a = 0;
    public final int f9848b;
    public final is f9849c;

    public z9(int i7, la laVar) {
        this.f9848b = i7;
        this.f9849c = laVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9847a) {
            case 0:
                ns.f(this.f9848b).n((la) this.f9849c, 223);
                return;
            default:
                tg.g0 g0Var = (tg.g0) this.f9849c;
                g0Var.o0(false);
                g0Var.B0(this.f9848b);
                return;
        }
    }

    public z9(tg.g0 g0Var, int i7) {
        this.f9849c = g0Var;
        this.f9848b = i7;
    }
}
