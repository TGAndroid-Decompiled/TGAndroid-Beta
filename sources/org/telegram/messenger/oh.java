package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class oh implements Runnable {
    public final int f15986a;
    public final NotificationsController f15987b;
    public final LongSparseIntArray f15988c;
    public final ArrayList d;

    public oh(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f15986a = i10;
        this.f15987b = notificationsController;
        this.f15988c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f15986a) {
            case 0:
                this.f15987b.lambda$processDialogsUpdateRead$30(this.f15988c, this.d);
                return;
            default:
                this.f15987b.lambda$removeDeletedHisoryFromNotifications$13(this.f15988c, this.d);
                return;
        }
    }
}
