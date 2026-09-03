package org.telegram.messenger;

import java.util.ArrayList;
public final class eh implements Runnable {
    public final int f17136a;
    public final NotificationsController f17137b;
    public final ArrayList f17138c;

    public eh(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f17136a = i10;
        this.f17137b = notificationsController;
        this.f17138c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17136a) {
            case 0:
                this.f17137b.lambda$removeDeletedHisoryFromNotifications$11(this.f17138c);
                return;
            case 1:
                this.f17137b.lambda$processReadMessages$20(this.f17138c);
                return;
            case 2:
                this.f17137b.lambda$forceShowPopupForReply$6(this.f17138c);
                return;
            case 3:
                this.f17137b.lambda$removeDeletedMessagesFromNotifications$8(this.f17138c);
                return;
            default:
                this.f17137b.lambda$processDialogsUpdateRead$28(this.f17138c);
                return;
        }
    }
}
