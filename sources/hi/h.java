package hi;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
public final class h implements Runnable {
    public final int f12153a;
    public final o f12154b;

    public h(o oVar, int i10) {
        this.f12153a = i10;
        this.f12154b = oVar;
    }

    @Override
    public final void run() {
        int i10 = this.f12153a;
        o oVar = this.f12154b;
        switch (i10) {
            case 0:
                o.W(oVar);
                return;
            default:
                oVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_CHAT));
                return;
        }
    }
}
