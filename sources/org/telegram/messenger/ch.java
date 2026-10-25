package org.telegram.messenger;

import java.util.ArrayList;
public final class ch implements Runnable {
    public final int f19836a;
    public final NotificationsController f19837b;
    public final ArrayList f19838c;

    public ch(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f19836a = i10;
        this.f19837b = notificationsController;
        this.f19838c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19836a) {
            case 0:
                this.f19837b.lambda$forceShowPopupForReply$7(this.f19838c);
                return;
            case 1:
                this.f19837b.lambda$processReadMessages$21(this.f19838c);
                return;
            case 2:
                this.f19837b.lambda$processDialogsUpdateRead$29(this.f19838c);
                return;
            case 3:
                this.f19837b.lambda$removeDeletedMessagesFromNotifications$9(this.f19838c);
                return;
            default:
                this.f19837b.lambda$removeDeletedHisoryFromNotifications$12(this.f19838c);
                return;
        }
    }
}
