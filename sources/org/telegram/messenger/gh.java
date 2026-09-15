package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class gh implements Runnable {
    public final int f16246a;
    public final NotificationsController f16247b;
    public final LongSparseIntArray f16248c;
    public final ArrayList d;

    public gh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f16246a = i10;
        this.f16247b = notificationsController;
        this.f16248c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16246a) {
            case 0:
                this.f16247b.lambda$processDialogsUpdateRead$30(this.f16248c, this.d);
                return;
            default:
                this.f16247b.lambda$removeDeletedHisoryFromNotifications$13(this.f16248c, this.d);
                return;
        }
    }
}
