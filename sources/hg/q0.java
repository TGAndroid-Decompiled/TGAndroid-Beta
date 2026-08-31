package hg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public final class q0 implements Runnable {
    public final int f7590a;
    public final b1 f7591b;

    public q0(b1 b1Var, int i10) {
        this.f7590a = i10;
        this.f7591b = b1Var;
    }

    @Override
    public final void run() {
        int i10 = this.f7590a;
        b1 b1Var = this.f7591b;
        switch (i10) {
            case 0:
                AndroidUtilities.hideKeyboard(b1Var.d);
                return;
            case 1:
                b1Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, b1Var.Y, Boolean.TRUE);
                return;
            case 2:
                b1Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, b1Var.Y, Boolean.FALSE);
                return;
            case 3:
                b1.R(b1Var);
                return;
            default:
                b1.S(b1Var);
                return;
        }
    }
}
