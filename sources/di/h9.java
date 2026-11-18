package di;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
public final class h9 implements Runnable {
    public final int f8978a;
    public final org.telegram.ui.ActionBar.x2[] f8979b;
    public final long f8980c;

    public h9(org.telegram.ui.ActionBar.x2[] x2VarArr, long j3, int i7) {
        this.f8978a = i7;
        this.f8979b = x2VarArr;
        this.f8980c = j3;
    }

    @Override
    public final void run() {
        switch (this.f8978a) {
            case 0:
                this.f8979b[0].dismiss();
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(bn.ua(this.f8980c));
                    return;
                }
                return;
            case 1:
                this.f8979b[0].dismiss();
                org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(new ki.k(this.f8980c));
                    return;
                }
                return;
            case 2:
                this.f8979b[0].dismiss();
                org.telegram.ui.ActionBar.h2 T3 = LaunchActivity.T();
                if (T3 != null) {
                    T3.presentFragment(ProfileActivity.D4(this.f8980c));
                    return;
                }
                return;
            case 3:
                this.f8979b[0].dismiss();
                org.telegram.ui.ActionBar.h2 T4 = LaunchActivity.T();
                if (T4 != null) {
                    T4.presentFragment(ProfileActivity.D4(this.f8980c));
                    return;
                }
                return;
            case 4:
                this.f8979b[0].dismiss();
                org.telegram.ui.ActionBar.h2 T5 = LaunchActivity.T();
                if (T5 != null) {
                    T5.presentFragment(ProfileActivity.D4(this.f8980c));
                    return;
                }
                return;
            case 5:
                this.f8979b[0].dismiss();
                org.telegram.ui.ActionBar.h2 T6 = LaunchActivity.T();
                if (T6 != null) {
                    T6.presentFragment(bn.ua(this.f8980c));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.x2 x2Var = this.f8979b[0];
                if (x2Var != null) {
                    x2Var.dismiss();
                }
                org.telegram.ui.ActionBar.h2 T7 = LaunchActivity.T();
                if (T7 != null) {
                    T7.presentFragment(bn.ua(this.f8980c));
                    return;
                }
                return;
        }
    }
}
