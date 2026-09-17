package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.aj0;
public final class a5 implements Utilities.Callback4 {
    public final int f2780a;
    public final f5 f2781b;
    public final l5 f2782c;

    public a5(f5 f5Var, l5 l5Var, int i10) {
        this.f2780a = i10;
        this.f2781b = f5Var;
        this.f2782c = l5Var;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f2780a) {
            case 0:
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l10 = (Long) obj4;
                long currentTimeMillis = System.currentTimeMillis();
                o5 o5Var = this.f2781b.f2999l;
                n5 n5Var = o5Var.M2;
                ob obVar = (ob) n5Var.f3393c;
                if (obVar == null) {
                    ((gb) o5Var.Q1).g(false);
                    o5Var.setActive(true);
                    o5Var.U3 = false;
                    o5Var.f3456i1 = new a3(1, runnable);
                    if (bool.booleanValue()) {
                        o5Var.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                    return;
                }
                obVar.firstFrameRendered = false;
                n5Var.f3391a = false;
                obVar.setOnReadyListener(new b3(1, currentTimeMillis, runnable));
                ((gb) o5Var.Q1).g(false);
                aj0 aj0Var = o5Var.f3507z0;
                if (aj0Var != null) {
                    aj0Var.setAnimation(this.f2782c.f3293u);
                }
                if (o5Var.R2 > 0 && l4.longValue() > o5Var.R2 - 1400) {
                    l4 = 0L;
                }
                o5Var.T0(l4.longValue(), true);
                o5Var.U3 = false;
                AndroidUtilities.runOnUIThread(runnable, 400L);
                if (bool.booleanValue()) {
                    o5Var.f1(false);
                    return;
                }
                return;
            default:
                Long l11 = (Long) obj;
                Runnable runnable2 = (Runnable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Long l12 = (Long) obj4;
                long currentTimeMillis2 = System.currentTimeMillis();
                o5 o5Var2 = this.f2781b.f2999l;
                n5 n5Var2 = o5Var2.M2;
                ob obVar2 = (ob) n5Var2.f3393c;
                if (obVar2 == null) {
                    ((gb) o5Var2.Q1).g(false);
                    o5Var2.setActive(true);
                    o5Var2.U3 = false;
                    o5Var2.f3456i1 = new a3(2, runnable2);
                    if (bool2.booleanValue()) {
                        o5Var2.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    return;
                }
                obVar2.firstFrameRendered = false;
                n5Var2.f3391a = false;
                obVar2.setOnReadyListener(new b3(2, currentTimeMillis2, runnable2));
                ((gb) o5Var2.Q1).g(false);
                aj0 aj0Var2 = o5Var2.f3507z0;
                if (aj0Var2 != null) {
                    aj0Var2.setAnimation(this.f2782c.f3293u);
                }
                if (o5Var2.R2 > 0 && l11.longValue() > o5Var2.R2 - 1400) {
                    l11 = 0L;
                }
                o5Var2.T0(l11.longValue(), true);
                o5Var2.U3 = false;
                AndroidUtilities.runOnUIThread(runnable2, 400L);
                if (bool2.booleanValue()) {
                    o5Var2.f1(false);
                    return;
                }
                return;
        }
    }
}
