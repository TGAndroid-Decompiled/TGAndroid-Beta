package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class fh implements Runnable {
    public final int f16370a;
    public final NotificationsController f16371b;
    public final LongSparseIntArray f16372c;
    public final ArrayList d;

    public fh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f16370a = i10;
        this.f16371b = notificationsController;
        this.f16372c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16370a) {
            case 0:
                this.f16371b.lambda$processDialogsUpdateRead$30(this.f16372c, this.d);
                return;
            default:
                this.f16371b.lambda$removeDeletedHisoryFromNotifications$13(this.f16372c, this.d);
                return;
        }
    }
}
