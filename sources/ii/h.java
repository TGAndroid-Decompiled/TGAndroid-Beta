package ii;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
public final class h implements Runnable {
    public final int f14350a;
    public final o f14351b;

    public h(o oVar, int i10) {
        this.f14350a = i10;
        this.f14351b = oVar;
    }

    @Override
    public final void run() {
        int i10 = this.f14350a;
        o oVar = this.f14351b;
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
