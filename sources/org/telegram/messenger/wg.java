package org.telegram.messenger;

import java.util.ArrayList;
public final class wg implements Runnable {
    public final int f20006a;
    public final NotificationsController f20007b;
    public final ArrayList f20008c;

    public wg(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f20006a = i10;
        this.f20007b = notificationsController;
        this.f20008c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20006a) {
            case 0:
                this.f20007b.lambda$forceShowPopupForReply$7(this.f20008c);
                return;
            case 1:
                this.f20007b.lambda$processReadMessages$21(this.f20008c);
                return;
            case 2:
                this.f20007b.lambda$processDialogsUpdateRead$29(this.f20008c);
                return;
            case 3:
                this.f20007b.lambda$removeDeletedMessagesFromNotifications$9(this.f20008c);
                return;
            default:
                this.f20007b.lambda$removeDeletedHisoryFromNotifications$12(this.f20008c);
                return;
        }
    }
}
