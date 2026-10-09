package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class gh implements Runnable {
    public final int f17963a;
    public final NotificationsController f17964b;
    public final LongSparseIntArray f17965c;
    public final ArrayList d;

    public gh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f17963a = i10;
        this.f17964b = notificationsController;
        this.f17965c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17963a) {
            case 0:
                this.f17964b.lambda$processDialogsUpdateRead$31(this.f17965c, this.d);
                return;
            default:
                this.f17964b.lambda$removeDeletedHisoryFromNotifications$14(this.f17965c, this.d);
                return;
        }
    }
}
