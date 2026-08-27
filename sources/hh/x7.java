package hh;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.rn;

public final class x7 implements Runnable {

    public final int f10344a;

    public final org.telegram.ui.ActionBar.e3[] f10345b;

    public final long f10346c;

    public x7(org.telegram.ui.ActionBar.e3[] e3VarArr, long j10, int i10) {
        this.f10344a = i10;
        this.f10345b = e3VarArr;
        this.f10346c = j10;
    }

    @Override
    public final void run() {
        switch (this.f10344a) {
            case 0:
                this.f10345b[0].dismiss();
                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                if (n2VarU != null) {
                    n2VarU.presentFragment(ProfileActivity.m4(this.f10346c));
                }
                break;
            case 1:
                this.f10345b[0].dismiss();
                org.telegram.ui.ActionBar.n2 n2VarU2 = LaunchActivity.U();
                if (n2VarU2 != null) {
                    n2VarU2.presentFragment(rn.R9(this.f10346c));
                }
                break;
            case 2:
                org.telegram.ui.ActionBar.e3 e3Var = this.f10345b[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                }
                org.telegram.ui.ActionBar.n2 n2VarU3 = LaunchActivity.U();
                if (n2VarU3 != null) {
                    n2VarU3.presentFragment(rn.R9(this.f10346c));
                    break;
                }
                break;
            case 3:
                this.f10345b[0].dismiss();
                org.telegram.ui.ActionBar.n2 n2VarU4 = LaunchActivity.U();
                if (n2VarU4 != null) {
                    n2VarU4.presentFragment(rn.R9(this.f10346c));
                }
                break;
            case 4:
                this.f10345b[0].dismiss();
                org.telegram.ui.ActionBar.n2 n2VarU5 = LaunchActivity.U();
                if (n2VarU5 != null) {
                    n2VarU5.presentFragment(new nh.k(this.f10346c));
                }
                break;
            case 5:
                this.f10345b[0].dismiss();
                org.telegram.ui.ActionBar.n2 n2VarU6 = LaunchActivity.U();
                if (n2VarU6 != null) {
                    n2VarU6.presentFragment(ProfileActivity.m4(this.f10346c));
                }
                break;
            default:
                this.f10345b[0].dismiss();
                org.telegram.ui.ActionBar.n2 n2VarU7 = LaunchActivity.U();
                if (n2VarU7 != null) {
                    n2VarU7.presentFragment(ProfileActivity.m4(this.f10346c));
                }
                break;
        }
    }
}
