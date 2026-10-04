package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class fh implements Runnable {
    public final int f17872a;
    public final NotificationsController f17873b;
    public final LongSparseIntArray f17874c;
    public final ArrayList d;

    public fh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f17872a = i10;
        this.f17873b = notificationsController;
        this.f17874c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17872a) {
            case 0:
                this.f17873b.lambda$processDialogsUpdateRead$30(this.f17874c, this.d);
                return;
            default:
                this.f17873b.lambda$removeDeletedHisoryFromNotifications$13(this.f17874c, this.d);
                return;
        }
    }
}
