package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;

public final class NotificationsController$$ExternalSyntheticLambda30 implements Runnable {
    public final int $r8$classId;
    public final NotificationsController f$0;
    public final LongSparseIntArray f$1;
    public final ArrayList f$2;

    public NotificationsController$$ExternalSyntheticLambda30(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.f$0 = notificationsController;
        this.f$1 = longSparseIntArray;
        this.f$2 = arrayList;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$removeDeletedHisoryFromNotifications$13(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$processDialogsUpdateRead$30(this.f$1, this.f$2);
                break;
        }
    }
}
