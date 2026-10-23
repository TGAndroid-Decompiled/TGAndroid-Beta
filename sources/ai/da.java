package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class da implements Runnable {
    public final int f1152a;
    public final fa f1153b;

    public da(fa faVar, int i10) {
        this.f1152a = i10;
        this.f1153b = faVar;
    }

    @Override
    public final void run() {
        int i10 = this.f1152a;
        fa faVar = this.f1153b;
        switch (i10) {
            case 0:
                faVar.b();
                return;
            case 1:
                faVar.a();
                return;
            default:
                org.telegram.ui.Components.qc qcVar = faVar.d;
                ha haVar = faVar.f1321q;
                da daVar = faVar.f1320p;
                MessageObject messageObject = faVar.f1309b;
                if (!faVar.f1316l) {
                    faVar.f1316l = true;
                    messageObject.addPaidReactions((int) faVar.f1315k, true, faVar.c());
                    long j10 = haVar.f1417g;
                    int i11 = haVar.f1413a;
                    haVar.f1417g = j10 + faVar.f1315k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    faVar.f1315k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!faVar.f1317m) {
                    faVar.f1317m = true;
                    faVar.f1311f.f27663b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(daVar);
                    AndroidUtilities.runOnUIThread(daVar, 5000L);
                    qcVar.k(true);
                    qcVar.v = daVar;
                }
                faVar.e.f28002b.setText(faVar.d());
                return;
        }
    }
}
