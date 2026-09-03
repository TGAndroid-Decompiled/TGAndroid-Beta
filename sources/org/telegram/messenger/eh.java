package org.telegram.messenger;

import java.util.ArrayList;
public final class eh implements Runnable {
    public final int f18598a;
    public final NotificationsController f18599b;
    public final ArrayList f18600c;

    public eh(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f18598a = i10;
        this.f18599b = notificationsController;
        this.f18600c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18598a) {
            case 0:
                this.f18599b.lambda$removeDeletedHisoryFromNotifications$11(this.f18600c);
                return;
            case 1:
                this.f18599b.lambda$processReadMessages$20(this.f18600c);
                return;
            case 2:
                this.f18599b.lambda$forceShowPopupForReply$6(this.f18600c);
                return;
            case 3:
                this.f18599b.lambda$removeDeletedMessagesFromNotifications$8(this.f18600c);
                return;
            default:
                this.f18599b.lambda$processDialogsUpdateRead$28(this.f18600c);
                return;
        }
    }
}
