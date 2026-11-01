package mg;

import ag.f3;
import org.telegram.messenger.at;
import org.telegram.messenger.e20;
import org.telegram.messenger.f8;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.ActionBar.z2;
public final class l1 implements Runnable {
    public final int f13186a;
    public final z2 f13187b;

    public l1(z2 z2Var, int i10) {
        this.f13186a = i10;
        this.f13187b = z2Var;
    }

    @Override
    public final void run() {
        switch (this.f13186a) {
            case 0:
                this.f13187b.dismiss();
                at.f(e20.f15506s0).k(189, new Object[0]);
                org.telegram.messenger.i0.h3(new f3(8), 220L);
                return;
            case 1:
                z2 z2Var = this.f13187b;
                p2 p2Var = z2Var.f21590c;
                org.telegram.messenger.i0.E2(p2Var);
                z2Var.f21599f1.getLayoutContainer().addView(p2Var);
                return;
            case 2:
                this.f13187b.dismiss();
                return;
            default:
                try {
                    this.f13187b.L();
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
        }
    }
}
