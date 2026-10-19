package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class ah implements Runnable {
    public final int f17877a;
    public final NotificationsController f17878b;
    public final LongSparseIntArray f17879c;
    public final ArrayList d;

    public ah(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f17877a = i10;
        this.f17878b = notificationsController;
        this.f17879c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17877a) {
            case 0:
                this.f17878b.lambda$processDialogsUpdateRead$31(this.f17879c, this.d);
                return;
            default:
                this.f17878b.lambda$removeDeletedHisoryFromNotifications$14(this.f17879c, this.d);
                return;
        }
    }
}
