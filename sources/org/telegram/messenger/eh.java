package org.telegram.messenger;

import java.util.ArrayList;
public final class eh implements Runnable {
    public final int f17183a;
    public final NotificationsController f17184b;
    public final ArrayList f17185c;

    public eh(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f17183a = i10;
        this.f17184b = notificationsController;
        this.f17185c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17183a) {
            case 0:
                this.f17184b.lambda$forceShowPopupForReply$7(this.f17185c);
                return;
            case 1:
                this.f17184b.lambda$processReadMessages$21(this.f17185c);
                return;
            case 2:
                this.f17184b.lambda$processDialogsUpdateRead$29(this.f17185c);
                return;
            case 3:
                this.f17184b.lambda$removeDeletedMessagesFromNotifications$9(this.f17185c);
                return;
            default:
                this.f17184b.lambda$removeDeletedHisoryFromNotifications$12(this.f17185c);
                return;
        }
    }
}
