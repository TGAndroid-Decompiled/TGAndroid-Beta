package fi;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
public final class h implements Runnable {
    public final int f9896a;
    public final p f9897b;

    public h(p pVar, int i10) {
        this.f9896a = i10;
        this.f9897b = pVar;
    }

    @Override
    public final void run() {
        int i10 = this.f9896a;
        p pVar = this.f9897b;
        switch (i10) {
            case 0:
                p.U(pVar);
                return;
            default:
                pVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_CHAT));
                return;
        }
    }
}
