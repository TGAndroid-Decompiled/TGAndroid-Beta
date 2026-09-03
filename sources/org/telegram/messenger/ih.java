package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class ih implements Runnable {
    public final int f18981a;
    public final NotificationsController f18982b;
    public final LongSparseIntArray f18983c;
    public final ArrayList d;

    public ih(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f18981a = i10;
        this.f18982b = notificationsController;
        this.f18983c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18981a) {
            case 0:
                this.f18982b.lambda$processDialogsUpdateRead$30(this.f18983c, this.d);
                return;
            default:
                this.f18982b.lambda$removeDeletedHisoryFromNotifications$13(this.f18983c, this.d);
                return;
        }
    }
}
