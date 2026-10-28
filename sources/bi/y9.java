package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class y9 implements Runnable {
    public final int f5775a;
    public final aa f5776b;

    public y9(aa aaVar, int i10) {
        this.f5775a = i10;
        this.f5776b = aaVar;
    }

    @Override
    public final void run() {
        int i10 = this.f5775a;
        aa aaVar = this.f5776b;
        switch (i10) {
            case 0:
                aaVar.b();
                return;
            case 1:
                aaVar.a();
                return;
            default:
                org.telegram.ui.Components.qc qcVar = aaVar.d;
                ca caVar = aaVar.f4283q;
                y9 y9Var = aaVar.f4282p;
                MessageObject messageObject = aaVar.f4271b;
                if (!aaVar.f4278l) {
                    aaVar.f4278l = true;
                    messageObject.addPaidReactions((int) aaVar.f4277k, true, aaVar.c());
                    long j10 = caVar.f4445g;
                    int i11 = caVar.f4441a;
                    caVar.f4445g = j10 + aaVar.f4277k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    aaVar.f4277k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!aaVar.f4279m) {
                    aaVar.f4279m = true;
                    aaVar.f4273f.f29634b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(y9Var);
                    AndroidUtilities.runOnUIThread(y9Var, 5000L);
                    qcVar.k(true);
                    qcVar.f31873w = y9Var;
                }
                aaVar.e.f29926b.setText(aaVar.d());
                return;
        }
    }
}
