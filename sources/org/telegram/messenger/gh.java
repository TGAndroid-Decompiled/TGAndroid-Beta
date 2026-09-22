package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class gh implements Runnable {
    public final int f16481a;
    public final NotificationsController f16482b;
    public final LongSparseIntArray f16483c;
    public final ArrayList d;

    public gh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f16481a = i10;
        this.f16482b = notificationsController;
        this.f16483c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16481a) {
            case 0:
                this.f16482b.lambda$processDialogsUpdateRead$30(this.f16483c, this.d);
                return;
            default:
                this.f16482b.lambda$removeDeletedHisoryFromNotifications$13(this.f16483c, this.d);
                return;
        }
    }
}
