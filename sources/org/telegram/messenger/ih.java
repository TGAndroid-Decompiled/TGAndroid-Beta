package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class ih implements Runnable {
    public final int f17500a;
    public final NotificationsController f17501b;
    public final LongSparseIntArray f17502c;
    public final ArrayList d;

    public ih(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f17500a = i10;
        this.f17501b = notificationsController;
        this.f17502c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17500a) {
            case 0:
                this.f17501b.lambda$processDialogsUpdateRead$31(this.f17502c, this.d);
                return;
            default:
                this.f17501b.lambda$removeDeletedHisoryFromNotifications$14(this.f17502c, this.d);
                return;
        }
    }
}
