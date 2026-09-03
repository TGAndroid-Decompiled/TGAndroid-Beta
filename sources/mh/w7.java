package mh;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xn;
public final class w7 implements Runnable {
    public final int f14991a;
    public final org.telegram.ui.ActionBar.h3[] f14992b;
    public final long f14993c;

    public w7(org.telegram.ui.ActionBar.h3[] h3VarArr, long j10, int i10) {
        this.f14991a = i10;
        this.f14992b = h3VarArr;
        this.f14993c = j10;
    }

    @Override
    public final void run() {
        switch (this.f14991a) {
            case 0:
                this.f14992b[0].dismiss();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(this.f14993c));
                    return;
                }
                return;
            case 1:
                this.f14992b[0].dismiss();
                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(xn.R9(this.f14993c));
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.h3 h3Var = this.f14992b[0];
                if (h3Var != null) {
                    h3Var.dismiss();
                }
                org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(xn.R9(this.f14993c));
                    return;
                }
                return;
            case 3:
                this.f14992b[0].dismiss();
                org.telegram.ui.ActionBar.p2 U4 = LaunchActivity.U();
                if (U4 != null) {
                    U4.presentFragment(xn.R9(this.f14993c));
                    return;
                }
                return;
            case 4:
                this.f14992b[0].dismiss();
                org.telegram.ui.ActionBar.p2 U5 = LaunchActivity.U();
                if (U5 != null) {
                    U5.presentFragment(new sh.j(this.f14993c));
                    return;
                }
                return;
            case 5:
                this.f14992b[0].dismiss();
                org.telegram.ui.ActionBar.p2 U6 = LaunchActivity.U();
                if (U6 != null) {
                    U6.presentFragment(ProfileActivity.m4(this.f14993c));
                    return;
                }
                return;
            default:
                this.f14992b[0].dismiss();
                org.telegram.ui.ActionBar.p2 U7 = LaunchActivity.U();
                if (U7 != null) {
                    U7.presentFragment(ProfileActivity.m4(this.f14993c));
                    return;
                }
                return;
        }
    }
}
