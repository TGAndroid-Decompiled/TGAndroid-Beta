package org.telegram.messenger;

import java.util.ArrayList;
public final class ug implements Runnable {
    public final int f21686a;
    public final NotificationsController f21687b;
    public final ArrayList f21688c;

    public ug(NotificationsController notificationsController, ArrayList arrayList, int i9) {
        this.f21686a = i9;
        this.f21687b = notificationsController;
        this.f21688c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f21686a) {
            case 0:
                this.f21687b.lambda$removeDeletedHisoryFromNotifications$11(this.f21688c);
                return;
            case 1:
                this.f21687b.lambda$processReadMessages$20(this.f21688c);
                return;
            case 2:
                this.f21687b.lambda$forceShowPopupForReply$6(this.f21688c);
                return;
            case 3:
                this.f21687b.lambda$removeDeletedMessagesFromNotifications$8(this.f21688c);
                return;
            default:
                this.f21687b.lambda$processDialogsUpdateRead$28(this.f21688c);
                return;
        }
    }
}
