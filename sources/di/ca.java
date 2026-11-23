package di;

import android.content.DialogInterface;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
public final class ca implements DialogInterface.OnDismissListener {
    public final int f8614a = 0;
    public final int f8615b;
    public final gs f8616c;

    public ca(int i7, oa oaVar) {
        this.f8615b = i7;
        this.f8616c = oaVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f8614a) {
            case 0:
                ls.f(this.f8615b).n((oa) this.f8616c, 225);
                return;
            default:
                tg.h0 h0Var = (tg.h0) this.f8616c;
                h0Var.o0(false);
                h0Var.B0(this.f8615b);
                return;
        }
    }

    public ca(tg.h0 h0Var, int i7) {
        this.f8616c = h0Var;
        this.f8615b = i7;
    }
}
