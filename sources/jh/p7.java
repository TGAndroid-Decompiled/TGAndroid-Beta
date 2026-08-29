package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.mc;
public final class p7 implements Runnable {
    public final int f12620a;
    public final r7 f12621b;

    public p7(r7 r7Var, int i10) {
        this.f12620a = i10;
        this.f12621b = r7Var;
    }

    @Override
    public final void run() {
        int i10 = this.f12620a;
        r7 r7Var = this.f12621b;
        switch (i10) {
            case 0:
                r7Var.b();
                return;
            case 1:
                r7Var.a();
                return;
            default:
                mc mcVar = r7Var.d;
                s7 s7Var = r7Var.f12730q;
                p7 p7Var = r7Var.f12729p;
                MessageObject messageObject = r7Var.f12717b;
                if (!r7Var.f12725l) {
                    r7Var.f12725l = true;
                    messageObject.addPaidReactions((int) r7Var.f12724k, true, r7Var.c());
                    long j10 = s7Var.f12792g;
                    int i11 = s7Var.f12787a;
                    s7Var.f12792g = j10 + r7Var.f12724k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    r7Var.f12724k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!r7Var.f12726m) {
                    r7Var.f12726m = true;
                    r7Var.f12720f.f28371b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(p7Var);
                    AndroidUtilities.runOnUIThread(p7Var, 5000L);
                    mcVar.k(true);
                    mcVar.v = p7Var;
                }
                r7Var.f12719e.f28865b.setText(r7Var.d());
                return;
        }
    }
}
