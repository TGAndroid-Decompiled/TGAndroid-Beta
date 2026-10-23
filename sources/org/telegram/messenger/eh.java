package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class eh implements Runnable {
    public final int f18360a;
    public final NotificationsController f18361b;
    public final LongSparseIntArray f18362c;
    public final ArrayList d;

    public eh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f18360a = i10;
        this.f18361b = notificationsController;
        this.f18362c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18360a) {
            case 0:
                this.f18361b.lambda$processDialogsUpdateRead$31(this.f18362c, this.d);
                return;
            default:
                this.f18361b.lambda$removeDeletedHisoryFromNotifications$14(this.f18362c, this.d);
                return;
        }
    }
}
