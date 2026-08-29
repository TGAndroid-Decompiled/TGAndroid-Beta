package jh;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.tn;
public final class r9 implements Runnable {
    public final int f12736a;
    public final long f12737b;

    public r9(long j10, int i10) {
        this.f12736a = i10;
        this.f12737b = j10;
    }

    @Override
    public final void run() {
        switch (this.f12736a) {
            case 0:
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(tn.R9(this.f12737b));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(tn.R9(this.f12737b));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(tn.R9(this.f12737b));
                    return;
                }
                return;
        }
    }
}
