package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class fh implements Runnable {
    public final int f16393a;
    public final NotificationsController f16394b;
    public final LongSparseIntArray f16395c;
    public final ArrayList d;

    public fh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f16393a = i10;
        this.f16394b = notificationsController;
        this.f16395c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16393a) {
            case 0:
                this.f16394b.lambda$processDialogsUpdateRead$30(this.f16395c, this.d);
                return;
            default:
                this.f16394b.lambda$removeDeletedHisoryFromNotifications$13(this.f16395c, this.d);
                return;
        }
    }
}
