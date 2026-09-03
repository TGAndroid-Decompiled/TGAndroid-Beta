package lh;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zn;
public final class s9 implements Runnable {
    public final int f13081a;
    public final long f13082b;

    public s9(long j10, int i10) {
        this.f13081a = i10;
        this.f13082b = j10;
    }

    @Override
    public final void run() {
        switch (this.f13081a) {
            case 0:
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(zn.R9(this.f13082b));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(zn.R9(this.f13082b));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(zn.R9(this.f13082b));
                    return;
                }
                return;
        }
    }
}
