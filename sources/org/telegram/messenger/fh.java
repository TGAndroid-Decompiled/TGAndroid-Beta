package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class fh implements Runnable {
    public final int f17870a;
    public final NotificationsController f17871b;
    public final LongSparseIntArray f17872c;
    public final ArrayList d;

    public fh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f17870a = i10;
        this.f17871b = notificationsController;
        this.f17872c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17870a) {
            case 0:
                this.f17871b.lambda$processDialogsUpdateRead$30(this.f17872c, this.d);
                return;
            default:
                this.f17871b.lambda$removeDeletedHisoryFromNotifications$13(this.f17872c, this.d);
                return;
        }
    }
}
