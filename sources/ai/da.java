package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class da implements Runnable {
    public final int f1167a;
    public final fa f1168b;

    public da(fa faVar, int i10) {
        this.f1167a = i10;
        this.f1168b = faVar;
    }

    @Override
    public final void run() {
        int i10 = this.f1167a;
        fa faVar = this.f1168b;
        switch (i10) {
            case 0:
                faVar.b();
                return;
            case 1:
                faVar.a();
                return;
            default:
                org.telegram.ui.Components.qc qcVar = faVar.d;
                ga gaVar = faVar.f1308q;
                da daVar = faVar.f1307p;
                MessageObject messageObject = faVar.f1296b;
                if (!faVar.f1303l) {
                    faVar.f1303l = true;
                    messageObject.addPaidReactions((int) faVar.f1302k, true, faVar.c());
                    long j10 = gaVar.f1358g;
                    int i11 = gaVar.f1354a;
                    gaVar.f1358g = j10 + faVar.f1302k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    faVar.f1302k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!faVar.f1304m) {
                    faVar.f1304m = true;
                    faVar.f1298f.f27502b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(daVar);
                    AndroidUtilities.runOnUIThread(daVar, 5000L);
                    qcVar.k(true);
                    qcVar.v = daVar;
                }
                faVar.e.f27841b.setText(faVar.d());
                return;
        }
    }
}
