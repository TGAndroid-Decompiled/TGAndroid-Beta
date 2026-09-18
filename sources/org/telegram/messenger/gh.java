package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class gh implements Runnable {
    public final int f16419a;
    public final NotificationsController f16420b;
    public final LongSparseIntArray f16421c;
    public final ArrayList d;

    public gh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f16419a = i10;
        this.f16420b = notificationsController;
        this.f16421c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16419a) {
            case 0:
                this.f16420b.lambda$processDialogsUpdateRead$30(this.f16421c, this.d);
                return;
            default:
                this.f16420b.lambda$removeDeletedHisoryFromNotifications$13(this.f16421c, this.d);
                return;
        }
    }
}
