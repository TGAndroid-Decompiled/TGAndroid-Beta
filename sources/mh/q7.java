package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ic;
public final class q7 implements Runnable {
    public final int f14642a;
    public final s7 f14643b;

    public q7(s7 s7Var, int i10) {
        this.f14642a = i10;
        this.f14643b = s7Var;
    }

    @Override
    public final void run() {
        int i10 = this.f14642a;
        s7 s7Var = this.f14643b;
        switch (i10) {
            case 0:
                s7Var.b();
                return;
            case 1:
                s7Var.a();
                return;
            default:
                ic icVar = s7Var.d;
                t7 t7Var = s7Var.f14764q;
                q7 q7Var = s7Var.f14763p;
                MessageObject messageObject = s7Var.f14751b;
                if (!s7Var.f14759l) {
                    s7Var.f14759l = true;
                    messageObject.addPaidReactions((int) s7Var.f14758k, true, s7Var.c());
                    long j10 = t7Var.f14835g;
                    int i11 = t7Var.f14830a;
                    t7Var.f14835g = j10 + s7Var.f14758k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    s7Var.f14758k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!s7Var.f14760m) {
                    s7Var.f14760m = true;
                    s7Var.f14754f.f25570b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(q7Var);
                    AndroidUtilities.runOnUIThread(q7Var, 5000L);
                    icVar.k(true);
                    icVar.v = q7Var;
                }
                s7Var.f14753e.f25887b.setText(s7Var.d());
                return;
        }
    }
}
