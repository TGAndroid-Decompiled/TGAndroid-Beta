package ai;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.sn;
public final class la implements Runnable {
    public final int f1774a;
    public final org.telegram.ui.ActionBar.h3[] f1775b;
    public final long f1776c;

    public la(org.telegram.ui.ActionBar.h3[] h3VarArr, long j10, int i10) {
        this.f1774a = i10;
        this.f1775b = h3VarArr;
        this.f1776c = j10;
    }

    @Override
    public final void run() {
        switch (this.f1774a) {
            case 0:
                this.f1775b[0].dismiss();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.o4(this.f1776c));
                    return;
                }
                return;
            case 1:
                this.f1775b[0].dismiss();
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(sn.W9(this.f1776c));
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.h3 h3Var = this.f1775b[0];
                if (h3Var != null) {
                    h3Var.dismiss();
                }
                org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(sn.W9(this.f1776c));
                    return;
                }
                return;
            case 3:
                this.f1775b[0].dismiss();
                org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                if (U4 != null) {
                    U4.presentFragment(sn.W9(this.f1776c));
                    return;
                }
                return;
            case 4:
                this.f1775b[0].dismiss();
                org.telegram.ui.ActionBar.o2 U5 = LaunchActivity.U();
                if (U5 != null) {
                    U5.presentFragment(new gi.l(this.f1776c));
                    return;
                }
                return;
            case 5:
                this.f1775b[0].dismiss();
                org.telegram.ui.ActionBar.o2 U6 = LaunchActivity.U();
                if (U6 != null) {
                    U6.presentFragment(ProfileActivity.o4(this.f1776c));
                    return;
                }
                return;
            default:
                this.f1775b[0].dismiss();
                org.telegram.ui.ActionBar.o2 U7 = LaunchActivity.U();
                if (U7 != null) {
                    U7.presentFragment(ProfileActivity.o4(this.f1776c));
                    return;
                }
                return;
        }
    }
}
