package eg;

import android.content.Context;
import org.telegram.messenger.MessagesController;
public final class u1 implements Runnable {
    public final int f5518a;
    public final e2 f5519b;

    public u1(e2 e2Var, int i10) {
        this.f5518a = i10;
        this.f5519b = e2Var;
    }

    @Override
    public final void run() {
        switch (this.f5518a) {
            case 0:
                e2 e2Var = this.f5519b;
                Context context = e2Var.getContext();
                af.g.s(context, "https://" + MessagesController.getInstance(e2Var.V).linkPrefix + "/nft/" + e2Var.A0.slug);
                return;
            case 1:
                e2 e2Var2 = this.f5519b;
                try {
                    e2Var2.container.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                e2Var2.f5269l0.c(e2Var2.H0);
                return;
            default:
                this.f5519b.L0[0].setVisibility(8);
                return;
        }
    }
}
