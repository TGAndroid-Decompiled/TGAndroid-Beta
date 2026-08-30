package lh;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xn;
public final class w7 implements Runnable {
    public final int f13298a;
    public final org.telegram.ui.ActionBar.g3[] f13299b;
    public final long f13300c;

    public w7(org.telegram.ui.ActionBar.g3[] g3VarArr, long j10, int i10) {
        this.f13298a = i10;
        this.f13299b = g3VarArr;
        this.f13300c = j10;
    }

    @Override
    public final void run() {
        switch (this.f13298a) {
            case 0:
                this.f13299b[0].dismiss();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(this.f13300c));
                    return;
                }
                return;
            case 1:
                this.f13299b[0].dismiss();
                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(xn.R9(this.f13300c));
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.g3 g3Var = this.f13299b[0];
                if (g3Var != null) {
                    g3Var.dismiss();
                }
                org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(xn.R9(this.f13300c));
                    return;
                }
                return;
            case 3:
                this.f13299b[0].dismiss();
                org.telegram.ui.ActionBar.p2 U4 = LaunchActivity.U();
                if (U4 != null) {
                    U4.presentFragment(xn.R9(this.f13300c));
                    return;
                }
                return;
            case 4:
                this.f13299b[0].dismiss();
                org.telegram.ui.ActionBar.p2 U5 = LaunchActivity.U();
                if (U5 != null) {
                    U5.presentFragment(new rh.k(this.f13300c));
                    return;
                }
                return;
            case 5:
                this.f13299b[0].dismiss();
                org.telegram.ui.ActionBar.p2 U6 = LaunchActivity.U();
                if (U6 != null) {
                    U6.presentFragment(ProfileActivity.m4(this.f13300c));
                    return;
                }
                return;
            default:
                this.f13299b[0].dismiss();
                org.telegram.ui.ActionBar.p2 U7 = LaunchActivity.U();
                if (U7 != null) {
                    U7.presentFragment(ProfileActivity.m4(this.f13300c));
                    return;
                }
                return;
        }
    }
}
