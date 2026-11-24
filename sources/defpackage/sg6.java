package defpackage;

import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PremiumPreviewFragment;
public final class sg6 implements Runnable {
    public final byte a;
    public final wg6 b;

    public sg6(wg6 wg6Var, byte b) {
        this.a = b;
        this.b = wg6Var;
    }

    @Override
    public final void run() {
        int i;
        byte b = this.a;
        wg6 wg6Var = this.b;
        switch (b) {
            case 0:
                wg6Var.o();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                mh6 mh6Var = wg6Var.w;
                i = ((d) mh6Var).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i);
                mh6Var.presentFragment(premiumPreviewFragment);
                return;
            case 2:
                mh6 mh6Var2 = wg6Var.w;
                mh6Var2.J1(0, true, null, true);
                mh6Var2.z1(jb6.M0(2131745804, null), jb6.M0(2131751958, null));
                return;
            case 3:
                mh6 mh6Var3 = wg6Var.w;
                mh6Var3.J1(0, true, null, true);
                mh6Var3.z1(jb6.M0(2131745804, null), jb6.M0(2131751958, null));
                return;
            default:
                wg6Var.b.setLoading(false);
                return;
        }
    }
}
