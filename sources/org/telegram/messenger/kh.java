package org.telegram.messenger;

import java.util.ArrayList;
public final class kh implements Runnable {
    public final int f15640a;
    public final NotificationsController f15641b;
    public final ArrayList f15642c;

    public kh(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f15640a = i10;
        this.f15641b = notificationsController;
        this.f15642c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f15640a) {
            case 0:
                this.f15641b.lambda$removeDeletedHisoryFromNotifications$11(this.f15642c);
                return;
            case 1:
                this.f15641b.lambda$processReadMessages$20(this.f15642c);
                return;
            case 2:
                this.f15641b.lambda$forceShowPopupForReply$6(this.f15642c);
                return;
            case 3:
                this.f15641b.lambda$removeDeletedMessagesFromNotifications$8(this.f15642c);
                return;
            default:
                this.f15641b.lambda$processDialogsUpdateRead$28(this.f15642c);
                return;
        }
    }
}
