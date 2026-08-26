package org.telegram.messenger;

import java.util.ArrayList;

public final class NotificationsController$$ExternalSyntheticLambda32 implements Runnable {
    public final int $r8$classId;
    public final NotificationsController f$0;
    public final ArrayList f$1;

    public NotificationsController$$ExternalSyntheticLambda32(NotificationsController notificationsController, ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.f$0 = notificationsController;
        this.f$1 = arrayList;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$removeDeletedMessagesFromNotifications$8(this.f$1);
                break;
            case 1:
                this.f$0.lambda$processDialogsUpdateRead$28(this.f$1);
                break;
            case 2:
                this.f$0.lambda$removeDeletedHisoryFromNotifications$11(this.f$1);
                break;
            case 3:
                this.f$0.lambda$processReadMessages$20(this.f$1);
                break;
            default:
                this.f$0.lambda$forceShowPopupForReply$6(this.f$1);
                break;
        }
    }
}
