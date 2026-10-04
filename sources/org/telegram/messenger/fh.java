package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class fh implements Runnable {
    public final int f17871a;
    public final NotificationsController f17872b;
    public final LongSparseIntArray f17873c;
    public final ArrayList d;

    public fh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f17871a = i10;
        this.f17872b = notificationsController;
        this.f17873c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17871a) {
            case 0:
                this.f17872b.lambda$processDialogsUpdateRead$30(this.f17873c, this.d);
                return;
            default:
                this.f17872b.lambda$removeDeletedHisoryFromNotifications$13(this.f17873c, this.d);
                return;
        }
    }
}
