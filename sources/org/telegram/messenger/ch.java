package org.telegram.messenger;

import java.util.ArrayList;
public final class ch implements Runnable {
    public final int f17582a;
    public final NotificationsController f17583b;
    public final ArrayList f17584c;

    public ch(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f17582a = i10;
        this.f17583b = notificationsController;
        this.f17584c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17582a) {
            case 0:
                this.f17583b.lambda$forceShowPopupForReply$7(this.f17584c);
                return;
            case 1:
                this.f17583b.lambda$processReadMessages$21(this.f17584c);
                return;
            case 2:
                this.f17583b.lambda$processDialogsUpdateRead$29(this.f17584c);
                return;
            case 3:
                this.f17583b.lambda$removeDeletedMessagesFromNotifications$9(this.f17584c);
                return;
            default:
                this.f17583b.lambda$removeDeletedHisoryFromNotifications$12(this.f17584c);
                return;
        }
    }
}
