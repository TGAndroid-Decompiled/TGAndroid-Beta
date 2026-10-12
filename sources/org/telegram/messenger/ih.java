package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class ih implements Runnable {
    public final int f17885a;
    public final NotificationsController f17886b;
    public final LongSparseIntArray f17887c;
    public final ArrayList d;

    public ih(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f17885a = i10;
        this.f17886b = notificationsController;
        this.f17887c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17885a) {
            case 0:
                this.f17886b.lambda$processDialogsUpdateRead$31(this.f17887c, this.d);
                return;
            default:
                this.f17886b.lambda$removeDeletedHisoryFromNotifications$14(this.f17887c, this.d);
                return;
        }
    }
}
