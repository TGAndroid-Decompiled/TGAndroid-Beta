package org.telegram.messenger;

import java.util.ArrayList;
public final class dh implements Runnable {
    public final int f19921a;
    public final NotificationsController f19922b;
    public final ArrayList f19923c;

    public dh(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f19921a = i10;
        this.f19922b = notificationsController;
        this.f19923c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19921a) {
            case 0:
                this.f19922b.lambda$forceShowPopupForReply$7(this.f19923c);
                return;
            case 1:
                this.f19922b.lambda$processReadMessages$21(this.f19923c);
                return;
            case 2:
                this.f19922b.lambda$processDialogsUpdateRead$29(this.f19923c);
                return;
            case 3:
                this.f19922b.lambda$removeDeletedMessagesFromNotifications$9(this.f19923c);
                return;
            default:
                this.f19922b.lambda$removeDeletedHisoryFromNotifications$12(this.f19923c);
                return;
        }
    }
}
