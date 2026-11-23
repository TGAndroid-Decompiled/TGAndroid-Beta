package di;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
public final class i9 implements Runnable {
    public final int f9025a;
    public final org.telegram.ui.ActionBar.w2[] f9026b;
    public final long f9027c;

    public i9(org.telegram.ui.ActionBar.w2[] w2VarArr, long j3, int i7) {
        this.f9025a = i7;
        this.f9026b = w2VarArr;
        this.f9027c = j3;
    }

    @Override
    public final void run() {
        switch (this.f9025a) {
            case 0:
                this.f9026b[0].dismiss();
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(bn.ua(this.f9027c));
                    return;
                }
                return;
            case 1:
                this.f9026b[0].dismiss();
                org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(new ki.j(this.f9027c));
                    return;
                }
                return;
            case 2:
                this.f9026b[0].dismiss();
                org.telegram.ui.ActionBar.g2 T3 = LaunchActivity.T();
                if (T3 != null) {
                    T3.presentFragment(ProfileActivity.D4(this.f9027c));
                    return;
                }
                return;
            case 3:
                this.f9026b[0].dismiss();
                org.telegram.ui.ActionBar.g2 T4 = LaunchActivity.T();
                if (T4 != null) {
                    T4.presentFragment(ProfileActivity.D4(this.f9027c));
                    return;
                }
                return;
            case 4:
                this.f9026b[0].dismiss();
                org.telegram.ui.ActionBar.g2 T5 = LaunchActivity.T();
                if (T5 != null) {
                    T5.presentFragment(ProfileActivity.D4(this.f9027c));
                    return;
                }
                return;
            case 5:
                this.f9026b[0].dismiss();
                org.telegram.ui.ActionBar.g2 T6 = LaunchActivity.T();
                if (T6 != null) {
                    T6.presentFragment(bn.ua(this.f9027c));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.w2 w2Var = this.f9026b[0];
                if (w2Var != null) {
                    w2Var.dismiss();
                }
                org.telegram.ui.ActionBar.g2 T7 = LaunchActivity.T();
                if (T7 != null) {
                    T7.presentFragment(bn.ua(this.f9027c));
                    return;
                }
                return;
        }
    }
}
