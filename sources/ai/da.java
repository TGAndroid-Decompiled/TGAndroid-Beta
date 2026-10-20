package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class da implements Runnable {
    public final int f1158a;
    public final fa f1159b;

    public da(fa faVar, int i10) {
        this.f1158a = i10;
        this.f1159b = faVar;
    }

    @Override
    public final void run() {
        int i10 = this.f1158a;
        fa faVar = this.f1159b;
        switch (i10) {
            case 0:
                faVar.b();
                return;
            case 1:
                faVar.a();
                return;
            default:
                org.telegram.ui.Components.qc qcVar = faVar.d;
                ga gaVar = faVar.f1318q;
                da daVar = faVar.f1317p;
                MessageObject messageObject = faVar.f1306b;
                if (!faVar.f1313l) {
                    faVar.f1313l = true;
                    messageObject.addPaidReactions((int) faVar.f1312k, true, faVar.c());
                    long j10 = gaVar.f1367g;
                    int i11 = gaVar.f1363a;
                    gaVar.f1367g = j10 + faVar.f1312k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    faVar.f1312k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!faVar.f1314m) {
                    faVar.f1314m = true;
                    faVar.f1308f.f27492b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(daVar);
                    AndroidUtilities.runOnUIThread(daVar, 5000L);
                    qcVar.k(true);
                    qcVar.v = daVar;
                }
                faVar.e.f27844b.setText(faVar.d());
                return;
        }
    }
}
