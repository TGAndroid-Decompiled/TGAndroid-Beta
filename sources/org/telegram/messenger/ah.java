package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class ah implements Runnable {
    public final int f17871a;
    public final NotificationsController f17872b;
    public final LongSparseIntArray f17873c;
    public final ArrayList d;

    public ah(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f17871a = i10;
        this.f17872b = notificationsController;
        this.f17873c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17871a) {
            case 0:
                this.f17872b.lambda$processDialogsUpdateRead$31(this.f17873c, this.d);
                return;
            default:
                this.f17872b.lambda$removeDeletedHisoryFromNotifications$14(this.f17873c, this.d);
                return;
        }
    }
}
