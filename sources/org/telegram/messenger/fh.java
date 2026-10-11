package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class fh implements Runnable {
    public final int f17890a;
    public final NotificationsController f17891b;
    public final LongSparseIntArray f17892c;
    public final ArrayList d;

    public fh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f17890a = i10;
        this.f17891b = notificationsController;
        this.f17892c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17890a) {
            case 0:
                this.f17891b.lambda$processDialogsUpdateRead$31(this.f17892c, this.d);
                return;
            default:
                this.f17891b.lambda$removeDeletedHisoryFromNotifications$14(this.f17892c, this.d);
                return;
        }
    }
}
