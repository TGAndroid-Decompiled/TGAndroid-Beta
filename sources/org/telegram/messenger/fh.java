package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class fh implements Runnable {
    public final int f16394a;
    public final NotificationsController f16395b;
    public final LongSparseIntArray f16396c;
    public final ArrayList d;

    public fh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f16394a = i10;
        this.f16395b = notificationsController;
        this.f16396c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16394a) {
            case 0:
                this.f16395b.lambda$processDialogsUpdateRead$30(this.f16396c, this.d);
                return;
            default:
                this.f16395b.lambda$removeDeletedHisoryFromNotifications$13(this.f16396c, this.d);
                return;
        }
    }
}
