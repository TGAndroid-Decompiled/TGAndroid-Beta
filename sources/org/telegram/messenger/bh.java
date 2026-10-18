package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class bh implements Runnable {
    public final int f17960a;
    public final NotificationsController f17961b;
    public final LongSparseIntArray f17962c;
    public final ArrayList d;

    public bh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f17960a = i10;
        this.f17961b = notificationsController;
        this.f17962c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17960a) {
            case 0:
                this.f17961b.lambda$processDialogsUpdateRead$31(this.f17962c, this.d);
                return;
            default:
                this.f17961b.lambda$removeDeletedHisoryFromNotifications$14(this.f17962c, this.d);
                return;
        }
    }
}
