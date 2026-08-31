package mh;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xn;
public final class s9 implements Runnable {
    public final int f14768a;
    public final long f14769b;

    public s9(long j10, int i10) {
        this.f14768a = i10;
        this.f14769b = j10;
    }

    @Override
    public final void run() {
        switch (this.f14768a) {
            case 0:
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(xn.R9(this.f14769b));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(xn.R9(this.f14769b));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(xn.R9(this.f14769b));
                    return;
                }
                return;
        }
    }
}
