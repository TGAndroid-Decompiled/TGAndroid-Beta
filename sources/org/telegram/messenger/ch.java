package org.telegram.messenger;

import java.util.ArrayList;
public final class ch implements Runnable {
    public final int f16125a;
    public final NotificationsController f16126b;
    public final ArrayList f16127c;

    public ch(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f16125a = i10;
        this.f16126b = notificationsController;
        this.f16127c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16125a) {
            case 0:
                this.f16126b.lambda$removeDeletedHisoryFromNotifications$11(this.f16127c);
                return;
            case 1:
                this.f16126b.lambda$processReadMessages$20(this.f16127c);
                return;
            case 2:
                this.f16126b.lambda$forceShowPopupForReply$6(this.f16127c);
                return;
            case 3:
                this.f16126b.lambda$removeDeletedMessagesFromNotifications$8(this.f16127c);
                return;
            default:
                this.f16126b.lambda$processDialogsUpdateRead$28(this.f16127c);
                return;
        }
    }
}
