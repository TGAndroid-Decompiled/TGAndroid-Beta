package org.telegram.messenger;

import java.util.ArrayList;
public final class ch implements Runnable {
    public final int f16140a;
    public final NotificationsController f16141b;
    public final ArrayList f16142c;

    public ch(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f16140a = i10;
        this.f16141b = notificationsController;
        this.f16142c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16140a) {
            case 0:
                this.f16141b.lambda$removeDeletedHisoryFromNotifications$11(this.f16142c);
                return;
            case 1:
                this.f16141b.lambda$processReadMessages$20(this.f16142c);
                return;
            case 2:
                this.f16141b.lambda$forceShowPopupForReply$6(this.f16142c);
                return;
            case 3:
                this.f16141b.lambda$removeDeletedMessagesFromNotifications$8(this.f16142c);
                return;
            default:
                this.f16141b.lambda$processDialogsUpdateRead$28(this.f16142c);
                return;
        }
    }
}
