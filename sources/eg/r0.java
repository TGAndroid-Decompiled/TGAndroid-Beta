package eg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public final class r0 implements Runnable {
    public final int f6121a;
    public final c1 f6122b;

    public r0(c1 c1Var, int i10) {
        this.f6121a = i10;
        this.f6122b = c1Var;
    }

    @Override
    public final void run() {
        int i10 = this.f6121a;
        c1 c1Var = this.f6122b;
        switch (i10) {
            case 0:
                AndroidUtilities.hideKeyboard(c1Var.d);
                return;
            case 1:
                c1Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, c1Var.X, Boolean.TRUE);
                return;
            case 2:
                c1Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, c1Var.X, Boolean.FALSE);
                return;
            case 3:
                c1.R(c1Var);
                return;
            default:
                c1.S(c1Var);
                return;
        }
    }
}
