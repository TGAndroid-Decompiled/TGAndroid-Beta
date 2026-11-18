package di;

import android.content.DialogInterface;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
public final class ba implements DialogInterface.OnDismissListener {
    public final int f8573a = 0;
    public final int f8574b;
    public final fs f8575c;

    public ba(int i7, oa oaVar) {
        this.f8574b = i7;
        this.f8575c = oaVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f8573a) {
            case 0:
                ks.f(this.f8574b).n((oa) this.f8575c, 225);
                return;
            default:
                tg.g0 g0Var = (tg.g0) this.f8575c;
                g0Var.o0(false);
                g0Var.B0(this.f8574b);
                return;
        }
    }

    public ba(tg.g0 g0Var, int i7) {
        this.f8575c = g0Var;
        this.f8574b = i7;
    }
}
