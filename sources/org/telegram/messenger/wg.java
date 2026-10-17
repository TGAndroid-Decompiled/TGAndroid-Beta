package org.telegram.messenger;

import java.util.ArrayList;
public final class wg implements Runnable {
    public final int f20000a;
    public final NotificationsController f20001b;
    public final ArrayList f20002c;

    public wg(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f20000a = i10;
        this.f20001b = notificationsController;
        this.f20002c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20000a) {
            case 0:
                this.f20001b.lambda$forceShowPopupForReply$7(this.f20002c);
                return;
            case 1:
                this.f20001b.lambda$processReadMessages$21(this.f20002c);
                return;
            case 2:
                this.f20001b.lambda$processDialogsUpdateRead$29(this.f20002c);
                return;
            case 3:
                this.f20001b.lambda$removeDeletedMessagesFromNotifications$9(this.f20002c);
                return;
            default:
                this.f20001b.lambda$removeDeletedHisoryFromNotifications$12(this.f20002c);
                return;
        }
    }
}
