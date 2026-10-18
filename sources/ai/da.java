package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class da implements Runnable {
    public final int f1170a;
    public final fa f1171b;

    public da(fa faVar, int i10) {
        this.f1170a = i10;
        this.f1171b = faVar;
    }

    @Override
    public final void run() {
        int i10 = this.f1170a;
        fa faVar = this.f1171b;
        switch (i10) {
            case 0:
                faVar.b();
                return;
            case 1:
                faVar.a();
                return;
            default:
                org.telegram.ui.Components.qc qcVar = faVar.d;
                ga gaVar = faVar.f1309q;
                da daVar = faVar.f1308p;
                MessageObject messageObject = faVar.f1297b;
                if (!faVar.f1304l) {
                    faVar.f1304l = true;
                    messageObject.addPaidReactions((int) faVar.f1303k, true, faVar.c());
                    long j10 = gaVar.f1356g;
                    int i11 = gaVar.f1352a;
                    gaVar.f1356g = j10 + faVar.f1303k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    faVar.f1303k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!faVar.f1305m) {
                    faVar.f1305m = true;
                    faVar.f1299f.f27495b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(daVar);
                    AndroidUtilities.runOnUIThread(daVar, 5000L);
                    qcVar.k(true);
                    qcVar.v = daVar;
                }
                faVar.e.f27834b.setText(faVar.d());
                return;
        }
    }
}
