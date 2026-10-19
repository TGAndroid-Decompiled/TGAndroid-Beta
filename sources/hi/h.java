package hi;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
public final class h implements Runnable {
    public final int f12151a;
    public final o f12152b;

    public h(o oVar, int i10) {
        this.f12151a = i10;
        this.f12152b = oVar;
    }

    @Override
    public final void run() {
        int i10 = this.f12151a;
        o oVar = this.f12152b;
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
