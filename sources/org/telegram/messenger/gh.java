package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class gh implements Runnable {
    public final int f17788a;
    public final NotificationsController f17789b;
    public final LongSparseIntArray f17790c;
    public final ArrayList d;

    public gh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f17788a = i10;
        this.f17789b = notificationsController;
        this.f17790c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17788a) {
            case 0:
                this.f17789b.lambda$processDialogsUpdateRead$30(this.f17790c, this.d);
                return;
            default:
                this.f17789b.lambda$removeDeletedHisoryFromNotifications$13(this.f17790c, this.d);
                return;
        }
    }
}
