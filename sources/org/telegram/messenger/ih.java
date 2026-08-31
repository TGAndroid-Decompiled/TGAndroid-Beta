package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class ih implements Runnable {
    public final int f18979a;
    public final NotificationsController f18980b;
    public final LongSparseIntArray f18981c;
    public final ArrayList d;

    public ih(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f18979a = i10;
        this.f18980b = notificationsController;
        this.f18981c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18979a) {
            case 0:
                this.f18980b.lambda$processDialogsUpdateRead$30(this.f18981c, this.d);
                return;
            default:
                this.f18980b.lambda$removeDeletedHisoryFromNotifications$13(this.f18981c, this.d);
                return;
        }
    }
}
