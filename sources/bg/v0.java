package bg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public final class v0 implements Runnable {
    public final int f1976a;
    public final h1 f1977b;

    public v0(h1 h1Var, int i9) {
        this.f1976a = i9;
        this.f1977b = h1Var;
    }

    @Override
    public final void run() {
        int i9 = this.f1976a;
        h1 h1Var = this.f1977b;
        switch (i9) {
            case 0:
                AndroidUtilities.hideKeyboard(h1Var.d);
                return;
            case 1:
                h1Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, h1Var.X, Boolean.TRUE);
                return;
            case 2:
                h1Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, h1Var.X, Boolean.FALSE);
                return;
            case 3:
                h1.Q(h1Var);
                return;
            default:
                h1.R(h1Var);
                return;
        }
    }
}
