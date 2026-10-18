package org.telegram.messenger;

import java.util.ArrayList;
public final class wg implements Runnable {
    public final int f20012a;
    public final NotificationsController f20013b;
    public final ArrayList f20014c;

    public wg(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f20012a = i10;
        this.f20013b = notificationsController;
        this.f20014c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20012a) {
            case 0:
                this.f20013b.lambda$forceShowPopupForReply$7(this.f20014c);
                return;
            case 1:
                this.f20013b.lambda$processReadMessages$21(this.f20014c);
                return;
            case 2:
                this.f20013b.lambda$processDialogsUpdateRead$29(this.f20014c);
                return;
            case 3:
                this.f20013b.lambda$removeDeletedMessagesFromNotifications$9(this.f20014c);
                return;
            default:
                this.f20013b.lambda$removeDeletedHisoryFromNotifications$12(this.f20014c);
                return;
        }
    }
}
