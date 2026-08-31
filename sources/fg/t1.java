package fg;

import android.content.Context;
import org.telegram.messenger.MessagesController;
public final class t1 implements Runnable {
    public final int f6555a;
    public final d2 f6556b;

    public t1(d2 d2Var, int i10) {
        this.f6555a = i10;
        this.f6556b = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f6555a) {
            case 0:
                d2 d2Var = this.f6556b;
                Context context = d2Var.getContext();
                af.g.s(context, "https://" + MessagesController.getInstance(d2Var.V).linkPrefix + "/nft/" + d2Var.A0.slug);
                return;
            case 1:
                d2 d2Var2 = this.f6556b;
                try {
                    d2Var2.container.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                d2Var2.f6285l0.c(d2Var2.H0);
                return;
            default:
                this.f6556b.L0[0].setVisibility(8);
                return;
        }
    }
}
