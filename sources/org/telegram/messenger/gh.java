package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class gh implements Runnable {
    public final int f17815a;
    public final NotificationsController f17816b;
    public final LongSparseIntArray f17817c;
    public final ArrayList d;

    public gh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f17815a = i10;
        this.f17816b = notificationsController;
        this.f17817c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17815a) {
            case 0:
                this.f17816b.lambda$processDialogsUpdateRead$30(this.f17817c, this.d);
                return;
            default:
                this.f17816b.lambda$removeDeletedHisoryFromNotifications$13(this.f17817c, this.d);
                return;
        }
    }
}
