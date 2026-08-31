package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ic;
public final class q7 implements Runnable {
    public final int f14640a;
    public final s7 f14641b;

    public q7(s7 s7Var, int i10) {
        this.f14640a = i10;
        this.f14641b = s7Var;
    }

    @Override
    public final void run() {
        int i10 = this.f14640a;
        s7 s7Var = this.f14641b;
        switch (i10) {
            case 0:
                s7Var.b();
                return;
            case 1:
                s7Var.a();
                return;
            default:
                ic icVar = s7Var.d;
                t7 t7Var = s7Var.f14762q;
                q7 q7Var = s7Var.f14761p;
                MessageObject messageObject = s7Var.f14749b;
                if (!s7Var.f14757l) {
                    s7Var.f14757l = true;
                    messageObject.addPaidReactions((int) s7Var.f14756k, true, s7Var.c());
                    long j10 = t7Var.f14833g;
                    int i11 = t7Var.f14828a;
                    t7Var.f14833g = j10 + s7Var.f14756k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    s7Var.f14756k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!s7Var.f14758m) {
                    s7Var.f14758m = true;
                    s7Var.f14752f.f25559b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(q7Var);
                    AndroidUtilities.runOnUIThread(q7Var, 5000L);
                    icVar.k(true);
                    icVar.v = q7Var;
                }
                s7Var.f14751e.f25910b.setText(s7Var.d());
                return;
        }
    }
}
