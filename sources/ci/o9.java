package ci;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.wm;
public final class o9 implements Runnable {
    public final int f5703a;
    public final org.telegram.ui.ActionBar.t2[] f5704b;
    public final long f5705c;

    public o9(org.telegram.ui.ActionBar.t2[] t2VarArr, long j10, int i3) {
        this.f5703a = i3;
        this.f5704b = t2VarArr;
        this.f5705c = j10;
    }

    @Override
    public final void run() {
        switch (this.f5703a) {
            case 0:
                this.f5704b[0].dismiss();
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(wm.ra(this.f5705c));
                    return;
                }
                return;
            case 1:
                this.f5704b[0].dismiss();
                org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(new ii.k(this.f5705c));
                    return;
                }
                return;
            case 2:
                this.f5704b[0].dismiss();
                org.telegram.ui.ActionBar.d2 T3 = LaunchActivity.T();
                if (T3 != null) {
                    T3.presentFragment(ProfileActivity.A4(this.f5705c));
                    return;
                }
                return;
            case 3:
                this.f5704b[0].dismiss();
                org.telegram.ui.ActionBar.d2 T4 = LaunchActivity.T();
                if (T4 != null) {
                    T4.presentFragment(ProfileActivity.A4(this.f5705c));
                    return;
                }
                return;
            case 4:
                this.f5704b[0].dismiss();
                org.telegram.ui.ActionBar.d2 T5 = LaunchActivity.T();
                if (T5 != null) {
                    T5.presentFragment(ProfileActivity.A4(this.f5705c));
                    return;
                }
                return;
            case 5:
                this.f5704b[0].dismiss();
                org.telegram.ui.ActionBar.d2 T6 = LaunchActivity.T();
                if (T6 != null) {
                    T6.presentFragment(wm.ra(this.f5705c));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.t2 t2Var = this.f5704b[0];
                if (t2Var != null) {
                    t2Var.dismiss();
                }
                org.telegram.ui.ActionBar.d2 T7 = LaunchActivity.T();
                if (T7 != null) {
                    T7.presentFragment(wm.ra(this.f5705c));
                    return;
                }
                return;
        }
    }
}
