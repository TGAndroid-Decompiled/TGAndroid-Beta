package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class ch implements Runnable {
    public final int f18100a;
    public final NotificationsController f18101b;
    public final LongSparseIntArray f18102c;
    public final ArrayList d;

    public ch(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f18100a = i10;
        this.f18101b = notificationsController;
        this.f18102c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18100a) {
            case 0:
                this.f18101b.lambda$processDialogsUpdateRead$31(this.f18102c, this.d);
                return;
            default:
                this.f18101b.lambda$removeDeletedHisoryFromNotifications$14(this.f18102c, this.d);
                return;
        }
    }
}
