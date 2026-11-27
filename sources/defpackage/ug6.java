package defpackage;

import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PremiumPreviewFragment;
public final class ug6 implements Runnable {
    public final byte a;
    public final zg6 b;

    public ug6(zg6 zg6Var, byte b) {
        this.a = b;
        this.b = zg6Var;
    }

    @Override
    public final void run() {
        int i;
        byte b = this.a;
        zg6 zg6Var = this.b;
        switch (b) {
            case 0:
                zg6Var.o();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                qh6 qh6Var = zg6Var.w;
                i = ((e) qh6Var).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i);
                qh6Var.presentFragment(premiumPreviewFragment);
                return;
            case 2:
                qh6 qh6Var2 = zg6Var.w;
                qh6Var2.J1(0, true, null, true);
                qh6Var2.z1(ob6.M0(2131745798, null), ob6.M0(2131751986, null));
                return;
            case 3:
                qh6 qh6Var3 = zg6Var.w;
                qh6Var3.J1(0, true, null, true);
                qh6Var3.z1(ob6.M0(2131745798, null), ob6.M0(2131751986, null));
                return;
            default:
                zg6Var.b.setLoading(false);
                return;
        }
    }
}
