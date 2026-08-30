package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ic;
public final class q7 implements Runnable {
    public final int f12986a;
    public final s7 f12987b;

    public q7(s7 s7Var, int i10) {
        this.f12986a = i10;
        this.f12987b = s7Var;
    }

    @Override
    public final void run() {
        int i10 = this.f12986a;
        s7 s7Var = this.f12987b;
        switch (i10) {
            case 0:
                s7Var.b();
                return;
            case 1:
                s7Var.a();
                return;
            default:
                ic icVar = s7Var.d;
                t7 t7Var = s7Var.f13092q;
                q7 q7Var = s7Var.f13091p;
                MessageObject messageObject = s7Var.f13080b;
                if (!s7Var.f13087l) {
                    s7Var.f13087l = true;
                    messageObject.addPaidReactions((int) s7Var.f13086k, true, s7Var.c());
                    long j10 = t7Var.f13153g;
                    int i11 = t7Var.f13149a;
                    t7Var.f13153g = j10 + s7Var.f13086k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    s7Var.f13086k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!s7Var.f13088m) {
                    s7Var.f13088m = true;
                    s7Var.f13082f.f23628b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(q7Var);
                    AndroidUtilities.runOnUIThread(q7Var, 5000L);
                    icVar.k(true);
                    icVar.v = q7Var;
                }
                s7Var.e.f23960b.setText(s7Var.d());
                return;
        }
    }
}
