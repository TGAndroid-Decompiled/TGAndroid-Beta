package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class ih implements Runnable {
    public final int f17502a;
    public final NotificationsController f17503b;
    public final LongSparseIntArray f17504c;
    public final ArrayList d;

    public ih(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f17502a = i10;
        this.f17503b = notificationsController;
        this.f17504c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17502a) {
            case 0:
                this.f17503b.lambda$processDialogsUpdateRead$30(this.f17504c, this.d);
                return;
            default:
                this.f17503b.lambda$removeDeletedHisoryFromNotifications$13(this.f17504c, this.d);
                return;
        }
    }
}
