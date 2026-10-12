package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class ih implements Runnable {
    public final int f17884a;
    public final NotificationsController f17885b;
    public final LongSparseIntArray f17886c;
    public final ArrayList d;

    public ih(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f17884a = i10;
        this.f17885b = notificationsController;
        this.f17886c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17884a) {
            case 0:
                this.f17885b.lambda$processDialogsUpdateRead$31(this.f17886c, this.d);
                return;
            default:
                this.f17885b.lambda$removeDeletedHisoryFromNotifications$14(this.f17886c, this.d);
                return;
        }
    }
}
