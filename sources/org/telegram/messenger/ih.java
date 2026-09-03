package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class ih implements Runnable {
    public final int f17483a;
    public final NotificationsController f17484b;
    public final LongSparseIntArray f17485c;
    public final ArrayList d;

    public ih(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f17483a = i10;
        this.f17484b = notificationsController;
        this.f17485c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17483a) {
            case 0:
                this.f17484b.lambda$processDialogsUpdateRead$30(this.f17485c, this.d);
                return;
            default:
                this.f17484b.lambda$removeDeletedHisoryFromNotifications$13(this.f17485c, this.d);
                return;
        }
    }
}
