package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class fh implements Runnable {
    public final int f16385a;
    public final NotificationsController f16386b;
    public final LongSparseIntArray f16387c;
    public final ArrayList d;

    public fh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f16385a = i10;
        this.f16386b = notificationsController;
        this.f16387c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16385a) {
            case 0:
                this.f16386b.lambda$processDialogsUpdateRead$30(this.f16387c, this.d);
                return;
            default:
                this.f16386b.lambda$removeDeletedHisoryFromNotifications$13(this.f16387c, this.d);
                return;
        }
    }
}
