package org.telegram.messenger;

import java.util.ArrayList;
public final class xg implements Runnable {
    public final int f20091a;
    public final NotificationsController f20092b;
    public final ArrayList f20093c;

    public xg(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f20091a = i10;
        this.f20092b = notificationsController;
        this.f20093c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20091a) {
            case 0:
                this.f20092b.lambda$forceShowPopupForReply$7(this.f20093c);
                return;
            case 1:
                this.f20092b.lambda$processReadMessages$21(this.f20093c);
                return;
            case 2:
                this.f20092b.lambda$processDialogsUpdateRead$29(this.f20093c);
                return;
            case 3:
                this.f20092b.lambda$removeDeletedMessagesFromNotifications$9(this.f20093c);
                return;
            default:
                this.f20092b.lambda$removeDeletedHisoryFromNotifications$12(this.f20093c);
                return;
        }
    }
}
