package defpackage;

import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PremiumPreviewFragment;
public final class re6 implements Runnable {
    public final byte a;
    public final ve6 b;

    public re6(ve6 ve6Var, byte b) {
        this.a = b;
        this.b = ve6Var;
    }

    @Override
    public final void run() {
        int i;
        byte b = this.a;
        ve6 ve6Var = this.b;
        switch (b) {
            case 0:
                ve6Var.o();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                mf6 mf6Var = ve6Var.w;
                i = ((d) mf6Var).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i);
                mf6Var.presentFragment(premiumPreviewFragment);
                return;
            case 2:
                mf6 mf6Var2 = ve6Var.w;
                mf6Var2.I1(0, true, null, true);
                mf6Var2.y1(k96.M0(2131745878, null), k96.M0(2131752009, null));
                return;
            case 3:
                mf6 mf6Var3 = ve6Var.w;
                mf6Var3.I1(0, true, null, true);
                mf6Var3.y1(k96.M0(2131745878, null), k96.M0(2131752009, null));
                return;
            default:
                ve6Var.b.setLoading(false);
                return;
        }
    }
}
