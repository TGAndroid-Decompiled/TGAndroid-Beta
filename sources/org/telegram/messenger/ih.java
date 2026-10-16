package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class ih implements Runnable {
    public final int f17196a;
    public final NotificationsController f17197b;
    public final LongSparseIntArray f17198c;
    public final ArrayList d;

    public ih(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f17196a = i10;
        this.f17197b = notificationsController;
        this.f17198c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17196a) {
            case 0:
                this.f17197b.lambda$processDialogsUpdateRead$31(this.f17198c, this.d);
                return;
            default:
                this.f17197b.lambda$removeDeletedHisoryFromNotifications$14(this.f17198c, this.d);
                return;
        }
    }
}
