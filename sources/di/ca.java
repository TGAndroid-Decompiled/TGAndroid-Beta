package di;

import android.content.DialogInterface;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
public final class ca implements DialogInterface.OnDismissListener {
    public final int f8648a = 0;
    public final int f8649b;
    public final fs f8650c;

    public ca(int i7, oa oaVar) {
        this.f8649b = i7;
        this.f8650c = oaVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f8648a) {
            case 0:
                ks.f(this.f8649b).n((oa) this.f8650c, 225);
                return;
            default:
                tg.h0 h0Var = (tg.h0) this.f8650c;
                h0Var.o0(false);
                h0Var.B0(this.f8649b);
                return;
        }
    }

    public ca(tg.h0 h0Var, int i7) {
        this.f8650c = h0Var;
        this.f8649b = i7;
    }
}
