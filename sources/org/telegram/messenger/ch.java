package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;

public final class ch implements Runnable {

    public final int f19973a;

    public final NotificationsController f19974b;

    public final LongSparseIntArray f19975c;
    public final ArrayList d;

    public ch(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.f19973a = i10;
        this.f19974b = notificationsController;
        this.f19975c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19973a) {
            case 0:
                this.f19974b.lambda$processDialogsUpdateRead$30(this.f19975c, this.d);
                break;
            default:
                this.f19974b.lambda$removeDeletedHisoryFromNotifications$13(this.f19975c, this.d);
                break;
        }
    }
}
