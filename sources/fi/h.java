package fi;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
public final class h implements Runnable {
    public final int f9105a;
    public final p f9106b;

    public h(p pVar, int i10) {
        this.f9105a = i10;
        this.f9106b = pVar;
    }

    @Override
    public final void run() {
        int i10 = this.f9105a;
        p pVar = this.f9106b;
        switch (i10) {
            case 0:
                p.W(pVar);
                return;
            default:
                pVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_CHAT));
                return;
        }
    }
}
