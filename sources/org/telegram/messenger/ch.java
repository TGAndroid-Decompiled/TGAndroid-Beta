package org.telegram.messenger;

import java.util.ArrayList;
public final class ch implements Runnable {
    public final int f15900a;
    public final NotificationsController f15901b;
    public final ArrayList f15902c;

    public ch(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f15900a = i10;
        this.f15901b = notificationsController;
        this.f15902c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f15900a) {
            case 0:
                this.f15901b.lambda$removeDeletedHisoryFromNotifications$11(this.f15902c);
                return;
            case 1:
                this.f15901b.lambda$processReadMessages$20(this.f15902c);
                return;
            case 2:
                this.f15901b.lambda$forceShowPopupForReply$6(this.f15902c);
                return;
            case 3:
                this.f15901b.lambda$removeDeletedMessagesFromNotifications$8(this.f15902c);
                return;
            default:
                this.f15901b.lambda$processDialogsUpdateRead$28(this.f15902c);
                return;
        }
    }
}
