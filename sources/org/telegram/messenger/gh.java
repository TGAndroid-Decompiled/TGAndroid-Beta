package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class gh implements Runnable {
    public final int f16466a;
    public final NotificationsController f16467b;
    public final LongSparseIntArray f16468c;
    public final ArrayList d;

    public gh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f16466a = i10;
        this.f16467b = notificationsController;
        this.f16468c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16466a) {
            case 0:
                this.f16467b.lambda$processDialogsUpdateRead$30(this.f16468c, this.d);
                return;
            default:
                this.f16467b.lambda$removeDeletedHisoryFromNotifications$13(this.f16468c, this.d);
                return;
        }
    }
}
