package org.telegram.messenger;

import java.util.ArrayList;
public final class eh implements Runnable {
    public final int f16880a;
    public final NotificationsController f16881b;
    public final ArrayList f16882c;

    public eh(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f16880a = i10;
        this.f16881b = notificationsController;
        this.f16882c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16880a) {
            case 0:
                this.f16881b.lambda$forceShowPopupForReply$7(this.f16882c);
                return;
            case 1:
                this.f16881b.lambda$processReadMessages$21(this.f16882c);
                return;
            case 2:
                this.f16881b.lambda$processDialogsUpdateRead$29(this.f16882c);
                return;
            case 3:
                this.f16881b.lambda$removeDeletedMessagesFromNotifications$9(this.f16882c);
                return;
            default:
                this.f16881b.lambda$removeDeletedHisoryFromNotifications$12(this.f16882c);
                return;
        }
    }
}
