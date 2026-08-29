package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class fh implements Runnable {
    public final int f20249a;
    public final NotificationsController f20250b;
    public final LongSparseIntArray f20251c;
    public final ArrayList d;

    public fh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f20249a = i10;
        this.f20250b = notificationsController;
        this.f20251c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20249a) {
            case 0:
                this.f20250b.lambda$processDialogsUpdateRead$30(this.f20251c, this.d);
                return;
            default:
                this.f20250b.lambda$removeDeletedHisoryFromNotifications$13(this.f20251c, this.d);
                return;
        }
    }
}
