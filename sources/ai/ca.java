package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class ca implements Runnable {
    public final int f1104a;
    public final ea f1105b;

    public ca(ea eaVar, int i10) {
        this.f1104a = i10;
        this.f1105b = eaVar;
    }

    @Override
    public final void run() {
        int i10 = this.f1104a;
        ea eaVar = this.f1105b;
        switch (i10) {
            case 0:
                eaVar.b();
                return;
            case 1:
                eaVar.a();
                return;
            default:
                org.telegram.ui.Components.qc qcVar = eaVar.d;
                fa faVar = eaVar.f1267q;
                ca caVar = eaVar.f1266p;
                MessageObject messageObject = eaVar.f1255b;
                if (!eaVar.f1262l) {
                    eaVar.f1262l = true;
                    messageObject.addPaidReactions((int) eaVar.f1261k, true, eaVar.c());
                    long j10 = faVar.f1315g;
                    int i11 = faVar.f1311a;
                    faVar.f1315g = j10 + eaVar.f1261k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    eaVar.f1261k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!eaVar.f1263m) {
                    eaVar.f1263m = true;
                    eaVar.f1257f.f27495b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(caVar);
                    AndroidUtilities.runOnUIThread(caVar, 5000L);
                    qcVar.k(true);
                    qcVar.v = caVar;
                }
                eaVar.e.f27834b.setText(eaVar.d());
                return;
        }
    }
}
