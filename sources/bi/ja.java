package bi;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.un;
public final class ja implements Runnable {
    public final int f4910a;
    public final org.telegram.ui.ActionBar.k3[] f4911b;
    public final long f4912c;

    public ja(org.telegram.ui.ActionBar.k3[] k3VarArr, long j10, int i10) {
        this.f4910a = i10;
        this.f4911b = k3VarArr;
        this.f4912c = j10;
    }

    @Override
    public final void run() {
        switch (this.f4910a) {
            case 0:
                this.f4911b[0].dismiss();
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.t4(this.f4912c));
                    return;
                }
                return;
            case 1:
                this.f4911b[0].dismiss();
                org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(ProfileActivity.t4(this.f4912c));
                    return;
                }
                return;
            case 2:
                this.f4911b[0].dismiss();
                org.telegram.ui.ActionBar.r2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(un.ba(this.f4912c));
                    return;
                }
                return;
            case 3:
                org.telegram.ui.ActionBar.k3 k3Var = this.f4911b[0];
                if (k3Var != null) {
                    k3Var.dismiss();
                }
                org.telegram.ui.ActionBar.r2 U4 = LaunchActivity.U();
                if (U4 != null) {
                    U4.presentFragment(un.ba(this.f4912c));
                    return;
                }
                return;
            case 4:
                this.f4911b[0].dismiss();
                org.telegram.ui.ActionBar.r2 U5 = LaunchActivity.U();
                if (U5 != null) {
                    U5.presentFragment(un.ba(this.f4912c));
                    return;
                }
                return;
            case 5:
                this.f4911b[0].dismiss();
                org.telegram.ui.ActionBar.r2 U6 = LaunchActivity.U();
                if (U6 != null) {
                    U6.presentFragment(new hi.k(this.f4912c));
                    return;
                }
                return;
            default:
                this.f4911b[0].dismiss();
                org.telegram.ui.ActionBar.r2 U7 = LaunchActivity.U();
                if (U7 != null) {
                    U7.presentFragment(ProfileActivity.t4(this.f4912c));
                    return;
                }
                return;
        }
    }
}
