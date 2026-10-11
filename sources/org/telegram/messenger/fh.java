package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class fh implements Runnable {
    public final int f17854a;
    public final NotificationsController f17855b;
    public final LongSparseIntArray f17856c;
    public final ArrayList d;

    public fh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f17854a = i10;
        this.f17855b = notificationsController;
        this.f17856c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17854a) {
            case 0:
                this.f17855b.lambda$processDialogsUpdateRead$31(this.f17856c, this.d);
                return;
            default:
                this.f17855b.lambda$removeDeletedHisoryFromNotifications$14(this.f17856c, this.d);
                return;
        }
    }
}
