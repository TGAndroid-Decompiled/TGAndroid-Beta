package org.telegram.messenger;

import java.util.ArrayList;
public final class eh implements Runnable {
    public final int f17532a;
    public final NotificationsController f17533b;
    public final ArrayList f17534c;

    public eh(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f17532a = i10;
        this.f17533b = notificationsController;
        this.f17534c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17532a) {
            case 0:
                this.f17533b.lambda$forceShowPopupForReply$7(this.f17534c);
                return;
            case 1:
                this.f17533b.lambda$processReadMessages$21(this.f17534c);
                return;
            case 2:
                this.f17533b.lambda$processDialogsUpdateRead$29(this.f17534c);
                return;
            case 3:
                this.f17533b.lambda$removeDeletedMessagesFromNotifications$9(this.f17534c);
                return;
            default:
                this.f17533b.lambda$removeDeletedHisoryFromNotifications$12(this.f17534c);
                return;
        }
    }
}
