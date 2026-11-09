package bi;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cn;
public final class qa implements Runnable {
    public final int f4584a;
    public final org.telegram.ui.ActionBar.v2[] f4585b;
    public final long f4586c;

    public qa(org.telegram.ui.ActionBar.v2[] v2VarArr, long j3, int i7) {
        this.f4584a = i7;
        this.f4585b = v2VarArr;
        this.f4586c = j3;
    }

    @Override
    public final void run() {
        switch (this.f4584a) {
            case 0:
                this.f4585b[0].dismiss();
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(cn.ta(this.f4586c));
                    return;
                }
                return;
            case 1:
                this.f4585b[0].dismiss();
                org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(new hi.j(this.f4586c));
                    return;
                }
                return;
            case 2:
                this.f4585b[0].dismiss();
                org.telegram.ui.ActionBar.f2 T3 = LaunchActivity.T();
                if (T3 != null) {
                    T3.presentFragment(ProfileActivity.D4(this.f4586c));
                    return;
                }
                return;
            case 3:
                this.f4585b[0].dismiss();
                org.telegram.ui.ActionBar.f2 T4 = LaunchActivity.T();
                if (T4 != null) {
                    T4.presentFragment(ProfileActivity.D4(this.f4586c));
                    return;
                }
                return;
            case 4:
                this.f4585b[0].dismiss();
                org.telegram.ui.ActionBar.f2 T5 = LaunchActivity.T();
                if (T5 != null) {
                    T5.presentFragment(ProfileActivity.D4(this.f4586c));
                    return;
                }
                return;
            case 5:
                this.f4585b[0].dismiss();
                org.telegram.ui.ActionBar.f2 T6 = LaunchActivity.T();
                if (T6 != null) {
                    T6.presentFragment(cn.ta(this.f4586c));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.v2 v2Var = this.f4585b[0];
                if (v2Var != null) {
                    v2Var.dismiss();
                }
                org.telegram.ui.ActionBar.f2 T7 = LaunchActivity.T();
                if (T7 != null) {
                    T7.presentFragment(cn.ta(this.f4586c));
                    return;
                }
                return;
        }
    }
}
