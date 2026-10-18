package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class ah implements Runnable {
    public final int f17880a;
    public final NotificationsController f17881b;
    public final LongSparseIntArray f17882c;
    public final ArrayList d;

    public ah(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f17880a = i10;
        this.f17881b = notificationsController;
        this.f17882c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17880a) {
            case 0:
                this.f17881b.lambda$processDialogsUpdateRead$31(this.f17882c, this.d);
                return;
            default:
                this.f17881b.lambda$removeDeletedHisoryFromNotifications$14(this.f17882c, this.d);
                return;
        }
    }
}
