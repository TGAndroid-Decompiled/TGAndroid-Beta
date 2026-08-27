package cg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;

public final class r0 implements Runnable {

    public final int f2809a;

    public final d1 f2810b;

    public r0(d1 d1Var, int i10) {
        this.f2809a = i10;
        this.f2810b = d1Var;
    }

    @Override
    public final void run() {
        int i10 = this.f2809a;
        d1 d1Var = this.f2810b;
        switch (i10) {
            case 0:
                AndroidUtilities.hideKeyboard(d1Var.d);
                break;
            case 1:
                d1Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, d1Var.X, Boolean.TRUE);
                break;
            case 2:
                d1Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, d1Var.X, Boolean.FALSE);
                break;
            case 3:
                d1.R(d1Var);
                break;
            default:
                d1.S(d1Var);
                break;
        }
    }
}
