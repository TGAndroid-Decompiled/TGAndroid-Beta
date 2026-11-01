package mg;

import java.util.ArrayList;
import org.telegram.messenger.dd;
import org.telegram.messenger.vi;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.PrivacyControlActivity;
public final class w1 implements Runnable {
    public final int f13282a;
    public final i2 f13283b;

    public w1(i2 i2Var, int i10) {
        this.f13282a = i10;
        this.f13283b = i2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f13282a;
        i2 i2Var = this.f13283b;
        switch (i10) {
            case 0:
                i2Var.j1(true);
                return;
            case 1:
                i2Var.V1.setVisibility(8);
                return;
            case 2:
                i2Var.e1();
                i2Var.p1(true, false);
                return;
            case 3:
                f2 f2Var = i2Var.R1;
                f2Var.f45554b.r(dd.L0(2131745853, null), true);
                return;
            case 4:
                f2 f2Var2 = i2Var.R1;
                f2Var2.f45554b.r(dd.L0(2131749659, null), true);
                return;
            case 5:
                i2Var.e1();
                i2Var.p1(true, false);
                return;
            case 6:
                ArrayList arrayList = i2Var.f13139b2;
                if (arrayList.isEmpty()) {
                    arrayList.addAll(vi.b0(i2Var.f21584a).f18654i1);
                    i2Var.o1(true, true);
                    return;
                }
                return;
            case 7:
                i2Var.V1.setVisibility(8);
                return;
            case 8:
                i2Var.e1();
                i2Var.p1(true, false);
                return;
            case 9:
                k2 k2Var = i2Var.f26727o1;
                if (k2Var != 0) {
                    ?? obj = new Object();
                    obj.f20390a = true;
                    k2Var.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
            case 10:
                i2Var.o1(true, true);
                return;
            case 11:
                i2Var.dismiss();
                return;
            default:
                i2Var.e1();
                i2Var.p1(true, false);
                return;
        }
    }
}
