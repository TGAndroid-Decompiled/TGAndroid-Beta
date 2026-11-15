package di;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
public final class e9 implements Runnable {
    public final int f8504a;
    public final org.telegram.ui.ActionBar.u2[] f8505b;
    public final long f8506c;

    public e9(org.telegram.ui.ActionBar.u2[] u2VarArr, long j3, int i7) {
        this.f8504a = i7;
        this.f8505b = u2VarArr;
        this.f8506c = j3;
    }

    @Override
    public final void run() {
        switch (this.f8504a) {
            case 0:
                this.f8505b[0].dismiss();
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(an.ua(this.f8506c));
                    return;
                }
                return;
            case 1:
                this.f8505b[0].dismiss();
                org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(new ki.k(this.f8506c));
                    return;
                }
                return;
            case 2:
                this.f8505b[0].dismiss();
                org.telegram.ui.ActionBar.e2 T3 = LaunchActivity.T();
                if (T3 != null) {
                    T3.presentFragment(ProfileActivity.C4(this.f8506c));
                    return;
                }
                return;
            case 3:
                this.f8505b[0].dismiss();
                org.telegram.ui.ActionBar.e2 T4 = LaunchActivity.T();
                if (T4 != null) {
                    T4.presentFragment(ProfileActivity.C4(this.f8506c));
                    return;
                }
                return;
            case 4:
                this.f8505b[0].dismiss();
                org.telegram.ui.ActionBar.e2 T5 = LaunchActivity.T();
                if (T5 != null) {
                    T5.presentFragment(ProfileActivity.C4(this.f8506c));
                    return;
                }
                return;
            case 5:
                this.f8505b[0].dismiss();
                org.telegram.ui.ActionBar.e2 T6 = LaunchActivity.T();
                if (T6 != null) {
                    T6.presentFragment(an.ua(this.f8506c));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.u2 u2Var = this.f8505b[0];
                if (u2Var != null) {
                    u2Var.dismiss();
                }
                org.telegram.ui.ActionBar.e2 T7 = LaunchActivity.T();
                if (T7 != null) {
                    T7.presentFragment(an.ua(this.f8506c));
                    return;
                }
                return;
        }
    }
}
