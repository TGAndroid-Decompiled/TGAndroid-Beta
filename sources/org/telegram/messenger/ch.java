package org.telegram.messenger;

import java.util.ArrayList;
public final class ch implements Runnable {
    public final int f17578a;
    public final NotificationsController f17579b;
    public final ArrayList f17580c;

    public ch(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f17578a = i10;
        this.f17579b = notificationsController;
        this.f17580c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17578a) {
            case 0:
                this.f17579b.lambda$forceShowPopupForReply$7(this.f17580c);
                return;
            case 1:
                this.f17579b.lambda$processReadMessages$21(this.f17580c);
                return;
            case 2:
                this.f17579b.lambda$processDialogsUpdateRead$29(this.f17580c);
                return;
            case 3:
                this.f17579b.lambda$removeDeletedMessagesFromNotifications$9(this.f17580c);
                return;
            default:
                this.f17579b.lambda$removeDeletedHisoryFromNotifications$12(this.f17580c);
                return;
        }
    }
}
