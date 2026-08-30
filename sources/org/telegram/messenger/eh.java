package org.telegram.messenger;

import java.util.ArrayList;
public final class eh implements Runnable {
    public final int f17151a;
    public final NotificationsController f17152b;
    public final ArrayList f17153c;

    public eh(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f17151a = i10;
        this.f17152b = notificationsController;
        this.f17153c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17151a) {
            case 0:
                this.f17152b.lambda$removeDeletedHisoryFromNotifications$11(this.f17153c);
                return;
            case 1:
                this.f17152b.lambda$processReadMessages$20(this.f17153c);
                return;
            case 2:
                this.f17152b.lambda$forceShowPopupForReply$6(this.f17153c);
                return;
            case 3:
                this.f17152b.lambda$removeDeletedMessagesFromNotifications$8(this.f17153c);
                return;
            default:
                this.f17152b.lambda$processDialogsUpdateRead$28(this.f17153c);
                return;
        }
    }
}
