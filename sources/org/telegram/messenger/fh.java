package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class fh implements Runnable {
    public final int f18428a;
    public final NotificationsController f18429b;
    public final LongSparseIntArray f18430c;
    public final ArrayList d;

    public fh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f18428a = i10;
        this.f18429b = notificationsController;
        this.f18430c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18428a) {
            case 0:
                this.f18429b.lambda$processDialogsUpdateRead$31(this.f18430c, this.d);
                return;
            default:
                this.f18429b.lambda$removeDeletedHisoryFromNotifications$14(this.f18430c, this.d);
                return;
        }
    }
}
