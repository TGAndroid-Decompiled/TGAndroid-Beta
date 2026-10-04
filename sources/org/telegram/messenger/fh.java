package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class fh implements Runnable {
    public final int f17865a;
    public final NotificationsController f17866b;
    public final LongSparseIntArray f17867c;
    public final ArrayList d;

    public fh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f17865a = i10;
        this.f17866b = notificationsController;
        this.f17867c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17865a) {
            case 0:
                this.f17866b.lambda$processDialogsUpdateRead$30(this.f17867c, this.d);
                return;
            default:
                this.f17866b.lambda$removeDeletedHisoryFromNotifications$13(this.f17867c, this.d);
                return;
        }
    }
}
