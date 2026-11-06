package bi;

import android.content.DialogInterface;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
public final class mb implements DialogInterface.OnDismissListener {
    public final int f4373a = 0;
    public final int f4374b;
    public final ls f4375c;

    public mb(int i7, zb zbVar) {
        this.f4374b = i7;
        this.f4375c = zbVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f4373a) {
            case 0:
                qs.f(this.f4374b).n((zb) this.f4375c, 223);
                return;
            default:
                tg.g0 g0Var = (tg.g0) this.f4375c;
                g0Var.o0(false);
                g0Var.B0(this.f4374b);
                return;
        }
    }

    public mb(tg.g0 g0Var, int i7) {
        this.f4375c = g0Var;
        this.f4374b = i7;
    }
}
