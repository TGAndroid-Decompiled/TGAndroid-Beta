package nh;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
public final class h implements Runnable {
    public final int f18642a;
    public final o f18643b;

    public h(o oVar, int i9) {
        this.f18642a = i9;
        this.f18643b = oVar;
    }

    @Override
    public final void run() {
        int i9 = this.f18642a;
        o oVar = this.f18643b;
        switch (i9) {
            case 0:
                o.V(oVar);
                return;
            default:
                oVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_CHAT));
                return;
        }
    }
}
