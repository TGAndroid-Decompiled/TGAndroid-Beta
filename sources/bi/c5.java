package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.bk0;
public final class c5 implements Utilities.Callback4 {
    public final int f2899a;
    public final h5 f2900b;
    public final n5 f2901c;

    public c5(h5 h5Var, n5 n5Var, int i10) {
        this.f2899a = i10;
        this.f2900b = h5Var;
        this.f2901c = n5Var;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f2899a) {
            case 0:
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l10 = (Long) obj4;
                long currentTimeMillis = System.currentTimeMillis();
                q5 q5Var = this.f2900b.f3126l;
                p5 p5Var = q5Var.M2;
                rb rbVar = (rb) p5Var.f3470c;
                if (rbVar == null) {
                    ((jb) q5Var.Q1).g(false);
                    q5Var.setActive(true);
                    q5Var.U3 = false;
                    q5Var.f3535i1 = new d3(1, runnable);
                    if (bool.booleanValue()) {
                        q5Var.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                    return;
                }
                rbVar.firstFrameRendered = false;
                p5Var.f3468a = false;
                rbVar.setOnReadyListener(new e3(1, currentTimeMillis, runnable));
                ((jb) q5Var.Q1).g(false);
                bk0 bk0Var = q5Var.f3587z0;
                if (bk0Var != null) {
                    bk0Var.setAnimation(this.f2901c.f3380u);
                }
                if (q5Var.R2 > 0 && l4.longValue() > q5Var.R2 - 1400) {
                    l4 = 0L;
                }
                q5Var.T0(l4.longValue(), true);
                q5Var.U3 = false;
                AndroidUtilities.runOnUIThread(runnable, 400L);
                if (bool.booleanValue()) {
                    q5Var.f1(false);
                    return;
                }
                return;
            default:
                Long l11 = (Long) obj;
                Runnable runnable2 = (Runnable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Long l12 = (Long) obj4;
                long currentTimeMillis2 = System.currentTimeMillis();
                q5 q5Var2 = this.f2900b.f3126l;
                p5 p5Var2 = q5Var2.M2;
                rb rbVar2 = (rb) p5Var2.f3470c;
                if (rbVar2 == null) {
                    ((jb) q5Var2.Q1).g(false);
                    q5Var2.setActive(true);
                    q5Var2.U3 = false;
                    q5Var2.f3535i1 = new d3(2, runnable2);
                    if (bool2.booleanValue()) {
                        q5Var2.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    return;
                }
                rbVar2.firstFrameRendered = false;
                p5Var2.f3468a = false;
                rbVar2.setOnReadyListener(new e3(2, currentTimeMillis2, runnable2));
                ((jb) q5Var2.Q1).g(false);
                bk0 bk0Var2 = q5Var2.f3587z0;
                if (bk0Var2 != null) {
                    bk0Var2.setAnimation(this.f2901c.f3380u);
                }
                if (q5Var2.R2 > 0 && l11.longValue() > q5Var2.R2 - 1400) {
                    l11 = 0L;
                }
                q5Var2.T0(l11.longValue(), true);
                q5Var2.U3 = false;
                AndroidUtilities.runOnUIThread(runnable2, 400L);
                if (bool2.booleanValue()) {
                    q5Var2.f1(false);
                    return;
                }
                return;
        }
    }
}
