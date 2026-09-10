package ei;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
public final class h implements Runnable {
    public final int f7552a;
    public final p f7553b;

    public h(p pVar, int i10) {
        this.f7552a = i10;
        this.f7553b = pVar;
    }

    @Override
    public final void run() {
        int i10 = this.f7552a;
        p pVar = this.f7553b;
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
