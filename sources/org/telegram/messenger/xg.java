package org.telegram.messenger;

import java.util.ArrayList;
public final class xg implements Runnable {
    public final int f20094a;
    public final NotificationsController f20095b;
    public final ArrayList f20096c;

    public xg(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f20094a = i10;
        this.f20095b = notificationsController;
        this.f20096c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20094a) {
            case 0:
                this.f20095b.lambda$forceShowPopupForReply$7(this.f20096c);
                return;
            case 1:
                this.f20095b.lambda$processReadMessages$21(this.f20096c);
                return;
            case 2:
                this.f20095b.lambda$processDialogsUpdateRead$29(this.f20096c);
                return;
            case 3:
                this.f20095b.lambda$removeDeletedMessagesFromNotifications$9(this.f20096c);
                return;
            default:
                this.f20095b.lambda$removeDeletedHisoryFromNotifications$12(this.f20096c);
                return;
        }
    }
}
