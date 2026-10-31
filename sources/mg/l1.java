package mg;

import ag.f3;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.ActionBar.z2;
public final class l1 implements Runnable {
    public final int f13185a;
    public final z2 f13186b;

    public l1(z2 z2Var, int i10) {
        this.f13185a = i10;
        this.f13186b = z2Var;
    }

    @Override
    public final void run() {
        switch (this.f13185a) {
            case 0:
                this.f13186b.dismiss();
                zs.f(d20.f15147s0).k(189, new Object[0]);
                org.telegram.messenger.i0.h3(new f3(8), 220L);
                return;
            case 1:
                z2 z2Var = this.f13186b;
                p2 p2Var = z2Var.f21589c;
                org.telegram.messenger.i0.E2(p2Var);
                z2Var.f21598f1.getLayoutContainer().addView(p2Var);
                return;
            case 2:
                this.f13186b.dismiss();
                return;
            default:
                try {
                    this.f13186b.L();
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
        }
    }
}
