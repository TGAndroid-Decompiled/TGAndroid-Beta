package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class hh implements Runnable {
    public final int f20260a;
    public final NotificationsController f20261b;
    public final LongSparseIntArray f20262c;
    public final ArrayList d;

    public hh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f20260a = i10;
        this.f20261b = notificationsController;
        this.f20262c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20260a) {
            case 0:
                this.f20261b.lambda$processDialogsUpdateRead$31(this.f20262c, this.d);
                return;
            default:
                this.f20261b.lambda$removeDeletedHisoryFromNotifications$14(this.f20262c, this.d);
                return;
        }
    }
}
