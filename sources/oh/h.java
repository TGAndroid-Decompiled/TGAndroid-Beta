package oh;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;

public final class h implements Runnable {

    public final int f19491a;

    public final o f19492b;

    public h(o oVar, int i10) {
        this.f19491a = i10;
        this.f19492b = oVar;
    }

    @Override
    public final void run() {
        int i10 = this.f19491a;
        o oVar = this.f19492b;
        switch (i10) {
            case 0:
                o.W(oVar);
                break;
            default:
                oVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_CHAT));
                break;
        }
    }
}
