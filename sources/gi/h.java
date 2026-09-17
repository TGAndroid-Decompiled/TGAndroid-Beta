package gi;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
public final class h implements Runnable {
    public final int f10690a;
    public final p f10691b;

    public h(p pVar, int i10) {
        this.f10690a = i10;
        this.f10691b = pVar;
    }

    @Override
    public final void run() {
        int i10 = this.f10690a;
        p pVar = this.f10691b;
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
