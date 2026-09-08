package gi;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
public final class h implements Runnable {
    public final int f10718a;
    public final p f10719b;

    public h(p pVar, int i10) {
        this.f10718a = i10;
        this.f10719b = pVar;
    }

    @Override
    public final void run() {
        int i10 = this.f10718a;
        p pVar = this.f10719b;
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
