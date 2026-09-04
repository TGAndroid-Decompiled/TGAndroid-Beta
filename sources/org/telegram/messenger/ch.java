package org.telegram.messenger;

import java.util.ArrayList;
public final class ch implements Runnable {
    public final int f17410a;
    public final NotificationsController f17411b;
    public final ArrayList f17412c;

    public ch(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f17410a = i10;
        this.f17411b = notificationsController;
        this.f17412c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17410a) {
            case 0:
                this.f17411b.lambda$removeDeletedHisoryFromNotifications$11(this.f17412c);
                return;
            case 1:
                this.f17411b.lambda$processReadMessages$20(this.f17412c);
                return;
            case 2:
                this.f17411b.lambda$forceShowPopupForReply$6(this.f17412c);
                return;
            case 3:
                this.f17411b.lambda$removeDeletedMessagesFromNotifications$8(this.f17412c);
                return;
            default:
                this.f17411b.lambda$processDialogsUpdateRead$28(this.f17412c);
                return;
        }
    }
}
