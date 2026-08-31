package org.telegram.messenger;

import java.util.ArrayList;
public final class eh implements Runnable {
    public final int f18596a;
    public final NotificationsController f18597b;
    public final ArrayList f18598c;

    public eh(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f18596a = i10;
        this.f18597b = notificationsController;
        this.f18598c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18596a) {
            case 0:
                this.f18597b.lambda$removeDeletedHisoryFromNotifications$11(this.f18598c);
                return;
            case 1:
                this.f18597b.lambda$processReadMessages$20(this.f18598c);
                return;
            case 2:
                this.f18597b.lambda$forceShowPopupForReply$6(this.f18598c);
                return;
            case 3:
                this.f18597b.lambda$removeDeletedMessagesFromNotifications$8(this.f18598c);
                return;
            default:
                this.f18597b.lambda$processDialogsUpdateRead$28(this.f18598c);
                return;
        }
    }
}
