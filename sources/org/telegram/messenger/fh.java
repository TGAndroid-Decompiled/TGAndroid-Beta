package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class fh implements Runnable {
    public final int f18363a;
    public final NotificationsController f18364b;
    public final LongSparseIntArray f18365c;
    public final ArrayList d;

    public fh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f18363a = i10;
        this.f18364b = notificationsController;
        this.f18365c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18363a) {
            case 0:
                this.f18364b.lambda$processDialogsUpdateRead$31(this.f18365c, this.d);
                return;
            default:
                this.f18364b.lambda$removeDeletedHisoryFromNotifications$14(this.f18365c, this.d);
                return;
        }
    }
}
