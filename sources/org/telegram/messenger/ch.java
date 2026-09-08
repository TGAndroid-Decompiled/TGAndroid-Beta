package org.telegram.messenger;

import java.util.ArrayList;
public final class ch implements Runnable {
    public final int f17437a;
    public final NotificationsController f17438b;
    public final ArrayList f17439c;

    public ch(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f17437a = i10;
        this.f17438b = notificationsController;
        this.f17439c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17437a) {
            case 0:
                this.f17438b.lambda$removeDeletedHisoryFromNotifications$11(this.f17439c);
                return;
            case 1:
                this.f17438b.lambda$processReadMessages$20(this.f17439c);
                return;
            case 2:
                this.f17438b.lambda$forceShowPopupForReply$6(this.f17439c);
                return;
            case 3:
                this.f17438b.lambda$removeDeletedMessagesFromNotifications$8(this.f17439c);
                return;
            default:
                this.f17438b.lambda$processDialogsUpdateRead$28(this.f17439c);
                return;
        }
    }
}
