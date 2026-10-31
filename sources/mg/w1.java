package mg;

import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.ui;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.PrivacyControlActivity;
public final class w1 implements Runnable {
    public final int f13281a;
    public final i2 f13282b;

    public w1(i2 i2Var, int i10) {
        this.f13281a = i10;
        this.f13282b = i2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f13281a;
        i2 i2Var = this.f13282b;
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
                f2Var.f45543b.r(cd.L0(2131745853, null), true);
                return;
            case 4:
                f2 f2Var2 = i2Var.R1;
                f2Var2.f45543b.r(cd.L0(2131749659, null), true);
                return;
            case 5:
                i2Var.e1();
                i2Var.p1(true, false);
                return;
            case 6:
                ArrayList arrayList = i2Var.f13138b2;
                if (arrayList.isEmpty()) {
                    arrayList.addAll(ui.b0(i2Var.f21583a).f18325i1);
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
                k2 k2Var = i2Var.f26669o1;
                if (k2Var != 0) {
                    ?? obj = new Object();
                    obj.f20389a = true;
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
