package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class fh implements Runnable {
    public final int f16410a;
    public final NotificationsController f16411b;
    public final LongSparseIntArray f16412c;
    public final ArrayList d;

    public fh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f16410a = i10;
        this.f16411b = notificationsController;
        this.f16412c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16410a) {
            case 0:
                this.f16411b.lambda$processDialogsUpdateRead$30(this.f16412c, this.d);
                return;
            default:
                this.f16411b.lambda$removeDeletedHisoryFromNotifications$13(this.f16412c, this.d);
                return;
        }
    }
}
