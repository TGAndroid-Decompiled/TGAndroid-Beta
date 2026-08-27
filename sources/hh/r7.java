package hh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ec;

public final class r7 implements Runnable {

    public final int f9998a;

    public final t7 f9999b;

    public r7(t7 t7Var, int i10) {
        this.f9998a = i10;
        this.f9999b = t7Var;
    }

    @Override
    public final void run() {
        int i10 = this.f9998a;
        t7 t7Var = this.f9999b;
        switch (i10) {
            case 0:
                t7Var.b();
                break;
            case 1:
                t7Var.a();
                break;
            default:
                ec ecVar = t7Var.d;
                u7 u7Var = t7Var.f10100q;
                r7 r7Var = t7Var.f10099p;
                MessageObject messageObject = t7Var.f10087b;
                if (!t7Var.f10095l) {
                    t7Var.f10095l = true;
                    messageObject.addPaidReactions((int) t7Var.f10094k, true, t7Var.c());
                    long j10 = u7Var.f10156g;
                    int i11 = u7Var.f10151a;
                    u7Var.f10156g = j10 + t7Var.f10094k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    t7Var.f10094k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!t7Var.f10096m) {
                    t7Var.f10096m = true;
                    t7Var.f10090f.f34571b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(r7Var);
                    AndroidUtilities.runOnUIThread(r7Var, 5000L);
                    ecVar.k(true);
                    ecVar.v = r7Var;
                }
                t7Var.f10089e.f34876b.setText(t7Var.d());
                break;
        }
    }
}
