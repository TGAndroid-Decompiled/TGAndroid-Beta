package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ic;
public final class q7 implements Runnable {
    public final int f12970a;
    public final s7 f12971b;

    public q7(s7 s7Var, int i10) {
        this.f12970a = i10;
        this.f12971b = s7Var;
    }

    @Override
    public final void run() {
        int i10 = this.f12970a;
        s7 s7Var = this.f12971b;
        switch (i10) {
            case 0:
                s7Var.b();
                return;
            case 1:
                s7Var.a();
                return;
            default:
                ic icVar = s7Var.d;
                t7 t7Var = s7Var.f13076q;
                q7 q7Var = s7Var.f13075p;
                MessageObject messageObject = s7Var.f13064b;
                if (!s7Var.f13071l) {
                    s7Var.f13071l = true;
                    messageObject.addPaidReactions((int) s7Var.f13070k, true, s7Var.c());
                    long j10 = t7Var.f13137g;
                    int i11 = t7Var.f13133a;
                    t7Var.f13137g = j10 + s7Var.f13070k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    s7Var.f13070k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!s7Var.f13072m) {
                    s7Var.f13072m = true;
                    s7Var.f13066f.f23614b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(q7Var);
                    AndroidUtilities.runOnUIThread(q7Var, 5000L);
                    icVar.k(true);
                    icVar.v = q7Var;
                }
                s7Var.e.f23921b.setText(s7Var.d());
                return;
        }
    }
}
