package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class gh implements Runnable {
    public final int f20183a;
    public final NotificationsController f20184b;
    public final LongSparseIntArray f20185c;
    public final ArrayList d;

    public gh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f20183a = i10;
        this.f20184b = notificationsController;
        this.f20185c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20183a) {
            case 0:
                this.f20184b.lambda$processDialogsUpdateRead$31(this.f20185c, this.d);
                return;
            default:
                this.f20184b.lambda$removeDeletedHisoryFromNotifications$14(this.f20185c, this.d);
                return;
        }
    }
}
