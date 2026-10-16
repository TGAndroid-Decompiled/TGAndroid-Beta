package gi;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
public final class h implements Runnable {
    public final int f10187a;
    public final p f10188b;

    public h(p pVar, int i10) {
        this.f10187a = i10;
        this.f10188b = pVar;
    }

    @Override
    public final void run() {
        int i10 = this.f10187a;
        p pVar = this.f10188b;
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
