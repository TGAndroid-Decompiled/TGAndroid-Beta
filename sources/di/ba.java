package di;

import android.content.DialogInterface;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
public final class ba implements DialogInterface.OnDismissListener {
    public final int f8576a = 0;
    public final int f8577b;
    public final fs f8578c;

    public ba(int i7, oa oaVar) {
        this.f8577b = i7;
        this.f8578c = oaVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f8576a) {
            case 0:
                ks.f(this.f8577b).n((oa) this.f8578c, 225);
                return;
            default:
                tg.g0 g0Var = (tg.g0) this.f8578c;
                g0Var.o0(false);
                g0Var.B0(this.f8577b);
                return;
        }
    }

    public ba(tg.g0 g0Var, int i7) {
        this.f8578c = g0Var;
        this.f8577b = i7;
    }
}
