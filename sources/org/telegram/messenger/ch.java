package org.telegram.messenger;

import java.util.ArrayList;
public final class ch implements Runnable {
    public final int f16092a;
    public final NotificationsController f16093b;
    public final ArrayList f16094c;

    public ch(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f16092a = i10;
        this.f16093b = notificationsController;
        this.f16094c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16092a) {
            case 0:
                this.f16093b.lambda$removeDeletedHisoryFromNotifications$11(this.f16094c);
                return;
            case 1:
                this.f16093b.lambda$processReadMessages$20(this.f16094c);
                return;
            case 2:
                this.f16093b.lambda$forceShowPopupForReply$6(this.f16094c);
                return;
            case 3:
                this.f16093b.lambda$removeDeletedMessagesFromNotifications$8(this.f16094c);
                return;
            default:
                this.f16093b.lambda$processDialogsUpdateRead$28(this.f16094c);
                return;
        }
    }
}
