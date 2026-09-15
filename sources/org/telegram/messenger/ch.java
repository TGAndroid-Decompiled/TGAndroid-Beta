package org.telegram.messenger;

import java.util.ArrayList;
public final class ch implements Runnable {
    public final int f15904a;
    public final NotificationsController f15905b;
    public final ArrayList f15906c;

    public ch(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f15904a = i10;
        this.f15905b = notificationsController;
        this.f15906c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f15904a) {
            case 0:
                this.f15905b.lambda$removeDeletedHisoryFromNotifications$11(this.f15906c);
                return;
            case 1:
                this.f15905b.lambda$processReadMessages$20(this.f15906c);
                return;
            case 2:
                this.f15905b.lambda$forceShowPopupForReply$6(this.f15906c);
                return;
            case 3:
                this.f15905b.lambda$removeDeletedMessagesFromNotifications$8(this.f15906c);
                return;
            default:
                this.f15905b.lambda$processDialogsUpdateRead$28(this.f15906c);
                return;
        }
    }
}
