package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class fh implements Runnable {
    public final int f17728a;
    public final NotificationsController f17729b;
    public final LongSparseIntArray f17730c;
    public final ArrayList d;

    public fh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f17728a = i10;
        this.f17729b = notificationsController;
        this.f17730c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17728a) {
            case 0:
                this.f17729b.lambda$processDialogsUpdateRead$30(this.f17730c, this.d);
                return;
            default:
                this.f17729b.lambda$removeDeletedHisoryFromNotifications$13(this.f17730c, this.d);
                return;
        }
    }
}
