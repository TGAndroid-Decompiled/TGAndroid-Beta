package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class fh implements Runnable {
    public final int f16127a;
    public final NotificationsController f16128b;
    public final LongSparseIntArray f16129c;
    public final ArrayList d;

    public fh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f16127a = i10;
        this.f16128b = notificationsController;
        this.f16129c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16127a) {
            case 0:
                this.f16128b.lambda$processDialogsUpdateRead$30(this.f16129c, this.d);
                return;
            default:
                this.f16128b.lambda$removeDeletedHisoryFromNotifications$13(this.f16129c, this.d);
                return;
        }
    }
}
