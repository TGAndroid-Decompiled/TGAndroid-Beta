package org.telegram.messenger;

import java.util.ArrayList;
public final class ch implements Runnable {
    public final int f15913a;
    public final NotificationsController f15914b;
    public final ArrayList f15915c;

    public ch(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f15913a = i10;
        this.f15914b = notificationsController;
        this.f15915c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f15913a) {
            case 0:
                this.f15914b.lambda$removeDeletedHisoryFromNotifications$11(this.f15915c);
                return;
            case 1:
                this.f15914b.lambda$processReadMessages$20(this.f15915c);
                return;
            case 2:
                this.f15914b.lambda$forceShowPopupForReply$6(this.f15915c);
                return;
            case 3:
                this.f15914b.lambda$removeDeletedMessagesFromNotifications$8(this.f15915c);
                return;
            default:
                this.f15914b.lambda$processDialogsUpdateRead$28(this.f15915c);
                return;
        }
    }
}
