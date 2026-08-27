package hh;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rn;

public final class v9 implements Runnable {

    public final int f10252a;

    public final long f10253b;

    public v9(long j10, int i10) {
        this.f10252a = i10;
        this.f10253b = j10;
    }

    @Override
    public final void run() {
        switch (this.f10252a) {
            case 0:
                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                if (n2VarU != null) {
                    n2VarU.presentFragment(rn.R9(this.f10253b));
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.n2 n2VarU2 = LaunchActivity.U();
                if (n2VarU2 != null) {
                    n2VarU2.presentFragment(rn.R9(this.f10253b));
                }
                break;
            default:
                org.telegram.ui.ActionBar.n2 n2VarU3 = LaunchActivity.U();
                if (n2VarU3 != null) {
                    n2VarU3.presentFragment(rn.R9(this.f10253b));
                }
                break;
        }
    }
}
