package ii;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
public final class h implements Runnable {
    public final int f14351a;
    public final o f14352b;

    public h(o oVar, int i10) {
        this.f14351a = i10;
        this.f14352b = oVar;
    }

    @Override
    public final void run() {
        int i10 = this.f14351a;
        o oVar = this.f14352b;
        switch (i10) {
            case 0:
                o.X(oVar);
                return;
            default:
                oVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_CHAT));
                return;
        }
    }
}
