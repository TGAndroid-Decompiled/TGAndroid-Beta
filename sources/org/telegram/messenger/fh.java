package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class fh implements Runnable {
    public final int f17701a;
    public final NotificationsController f17702b;
    public final LongSparseIntArray f17703c;
    public final ArrayList d;

    public fh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f17701a = i10;
        this.f17702b = notificationsController;
        this.f17703c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17701a) {
            case 0:
                this.f17702b.lambda$processDialogsUpdateRead$30(this.f17703c, this.d);
                return;
            default:
                this.f17702b.lambda$removeDeletedHisoryFromNotifications$13(this.f17703c, this.d);
                return;
        }
    }
}
