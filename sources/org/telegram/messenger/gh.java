package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class gh implements Runnable {
    public final int f16255a;
    public final NotificationsController f16256b;
    public final LongSparseIntArray f16257c;
    public final ArrayList d;

    public gh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f16255a = i10;
        this.f16256b = notificationsController;
        this.f16257c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16255a) {
            case 0:
                this.f16256b.lambda$processDialogsUpdateRead$30(this.f16257c, this.d);
                return;
            default:
                this.f16256b.lambda$removeDeletedHisoryFromNotifications$13(this.f16257c, this.d);
                return;
        }
    }
}
