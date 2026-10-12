package org.telegram.messenger;

import java.util.ArrayList;
public final class eh implements Runnable {
    public final int f17531a;
    public final NotificationsController f17532b;
    public final ArrayList f17533c;

    public eh(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f17531a = i10;
        this.f17532b = notificationsController;
        this.f17533c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17531a) {
            case 0:
                this.f17532b.lambda$forceShowPopupForReply$7(this.f17533c);
                return;
            case 1:
                this.f17532b.lambda$processReadMessages$21(this.f17533c);
                return;
            case 2:
                this.f17532b.lambda$processDialogsUpdateRead$29(this.f17533c);
                return;
            case 3:
                this.f17532b.lambda$removeDeletedMessagesFromNotifications$9(this.f17533c);
                return;
            default:
                this.f17532b.lambda$removeDeletedHisoryFromNotifications$12(this.f17533c);
                return;
        }
    }
}
