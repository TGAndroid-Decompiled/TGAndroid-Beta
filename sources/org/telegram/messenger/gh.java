package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class gh implements Runnable {
    public final int f16235a;
    public final NotificationsController f16236b;
    public final LongSparseIntArray f16237c;
    public final ArrayList d;

    public gh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f16235a = i10;
        this.f16236b = notificationsController;
        this.f16237c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16235a) {
            case 0:
                this.f16236b.lambda$processDialogsUpdateRead$30(this.f16237c, this.d);
                return;
            default:
                this.f16236b.lambda$removeDeletedHisoryFromNotifications$13(this.f16237c, this.d);
                return;
        }
    }
}
