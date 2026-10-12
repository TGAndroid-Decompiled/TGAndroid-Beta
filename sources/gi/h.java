package gi;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
public final class h implements Runnable {
    public final int f10183a;
    public final p f10184b;

    public h(p pVar, int i10) {
        this.f10183a = i10;
        this.f10184b = pVar;
    }

    @Override
    public final void run() {
        int i10 = this.f10183a;
        p pVar = this.f10184b;
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
