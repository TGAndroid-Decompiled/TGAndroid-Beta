package cg;

import android.content.Context;
import org.telegram.messenger.MessagesController;
public final class v1 implements Runnable {
    public final int f3426a;
    public final f2 f3427b;

    public v1(f2 f2Var, int i10) {
        this.f3426a = i10;
        this.f3427b = f2Var;
    }

    @Override
    public final void run() {
        switch (this.f3426a) {
            case 0:
                f2 f2Var = this.f3427b;
                Context context = f2Var.getContext();
                ye.d.s(context, "https://" + MessagesController.getInstance(f2Var.U).linkPrefix + "/nft/" + f2Var.f3146z0.slug);
                return;
            case 1:
                f2 f2Var2 = this.f3427b;
                try {
                    f2Var2.container.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                f2Var2.f3132k0.c(f2Var2.G0);
                return;
            default:
                this.f3427b.K0[0].setVisibility(8);
                return;
        }
    }
}
