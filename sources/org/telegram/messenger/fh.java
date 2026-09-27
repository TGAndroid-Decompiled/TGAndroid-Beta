package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class fh implements Runnable {
    public final int f16382a;
    public final NotificationsController f16383b;
    public final LongSparseIntArray f16384c;
    public final ArrayList d;

    public fh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f16382a = i10;
        this.f16383b = notificationsController;
        this.f16384c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16382a) {
            case 0:
                this.f16383b.lambda$processDialogsUpdateRead$30(this.f16384c, this.d);
                return;
            default:
                this.f16383b.lambda$removeDeletedHisoryFromNotifications$13(this.f16384c, this.d);
                return;
        }
    }
}
