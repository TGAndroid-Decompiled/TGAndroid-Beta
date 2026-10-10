package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class gh implements Runnable {
    public final int f17967a;
    public final NotificationsController f17968b;
    public final LongSparseIntArray f17969c;
    public final ArrayList d;

    public gh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f17967a = i10;
        this.f17968b = notificationsController;
        this.f17969c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17967a) {
            case 0:
                this.f17968b.lambda$processDialogsUpdateRead$31(this.f17969c, this.d);
                return;
            default:
                this.f17968b.lambda$removeDeletedHisoryFromNotifications$14(this.f17969c, this.d);
                return;
        }
    }
}
