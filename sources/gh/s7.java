package gh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.gc;
public final class s7 implements Runnable {
    public final int f8880a;
    public final u7 f8881b;

    public s7(u7 u7Var, int i9) {
        this.f8880a = i9;
        this.f8881b = u7Var;
    }

    @Override
    public final void run() {
        int i9 = this.f8880a;
        u7 u7Var = this.f8881b;
        switch (i9) {
            case 0:
                u7Var.b();
                return;
            case 1:
                u7Var.a();
                return;
            default:
                gc gcVar = u7Var.d;
                v7 v7Var = u7Var.f8977q;
                s7 s7Var = u7Var.f8976p;
                MessageObject messageObject = u7Var.f8964b;
                if (!u7Var.f8972l) {
                    u7Var.f8972l = true;
                    messageObject.addPaidReactions((int) u7Var.f8971k, true, u7Var.c());
                    long j10 = v7Var.f9050g;
                    int i10 = v7Var.f9045a;
                    v7Var.f9050g = j10 + u7Var.f8971k;
                    NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    u7Var.f8971k = 0L;
                    NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!u7Var.f8973m) {
                    u7Var.f8973m = true;
                    u7Var.f8967f.f35268b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(s7Var);
                    AndroidUtilities.runOnUIThread(s7Var, 5000L);
                    gcVar.k(true);
                    gcVar.v = s7Var;
                }
                u7Var.f8966e.f26755b.setText(u7Var.d());
                return;
        }
    }
}
