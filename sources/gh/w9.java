package gh;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qn;
public final class w9 implements Runnable {
    public final int f9118a;
    public final long f9119b;

    public w9(long j10, int i9) {
        this.f9118a = i9;
        this.f9119b = j10;
    }

    @Override
    public final void run() {
        switch (this.f9118a) {
            case 0:
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(qn.R9(this.f9119b));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(qn.R9(this.f9119b));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(qn.R9(this.f9119b));
                    return;
                }
                return;
        }
    }
}
