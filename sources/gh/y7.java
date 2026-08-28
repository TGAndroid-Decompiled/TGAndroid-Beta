package gh;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.qn;
public final class y7 implements Runnable {
    public final int f9229a;
    public final org.telegram.ui.ActionBar.f3[] f9230b;
    public final long f9231c;

    public y7(org.telegram.ui.ActionBar.f3[] f3VarArr, long j10, int i9) {
        this.f9229a = i9;
        this.f9230b = f3VarArr;
        this.f9231c = j10;
    }

    @Override
    public final void run() {
        switch (this.f9229a) {
            case 0:
                this.f9230b[0].dismiss();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(this.f9231c));
                    return;
                }
                return;
            case 1:
                this.f9230b[0].dismiss();
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(qn.R9(this.f9231c));
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.f3 f3Var = this.f9230b[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(qn.R9(this.f9231c));
                    return;
                }
                return;
            case 3:
                this.f9230b[0].dismiss();
                org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                if (U4 != null) {
                    U4.presentFragment(qn.R9(this.f9231c));
                    return;
                }
                return;
            case 4:
                this.f9230b[0].dismiss();
                org.telegram.ui.ActionBar.o2 U5 = LaunchActivity.U();
                if (U5 != null) {
                    U5.presentFragment(new mh.l(this.f9231c));
                    return;
                }
                return;
            case 5:
                this.f9230b[0].dismiss();
                org.telegram.ui.ActionBar.o2 U6 = LaunchActivity.U();
                if (U6 != null) {
                    U6.presentFragment(ProfileActivity.m4(this.f9231c));
                    return;
                }
                return;
            default:
                this.f9230b[0].dismiss();
                org.telegram.ui.ActionBar.o2 U7 = LaunchActivity.U();
                if (U7 != null) {
                    U7.presentFragment(ProfileActivity.m4(this.f9231c));
                    return;
                }
                return;
        }
    }
}
