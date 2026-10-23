package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class eh implements Runnable {
    public final int f18295a;
    public final NotificationsController f18296b;
    public final LongSparseIntArray f18297c;
    public final ArrayList d;

    public eh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f18295a = i10;
        this.f18296b = notificationsController;
        this.f18297c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18295a) {
            case 0:
                this.f18296b.lambda$processDialogsUpdateRead$31(this.f18297c, this.d);
                return;
            default:
                this.f18296b.lambda$removeDeletedHisoryFromNotifications$14(this.f18297c, this.d);
                return;
        }
    }
}
