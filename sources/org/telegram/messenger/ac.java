package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class ac implements Runnable {
    public final int f16727a;
    public final NotificationCenter.NotificationCenterDelegate f16728b;
    public final Cloneable f16729c;
    public final Cloneable d;
    public final Cloneable e;
    public final Cloneable f16730f;
    public final Cloneable h;
    public final Cloneable f16731n;
    public final Cloneable f16732r;
    public final Object f16733s;
    public final Cloneable v;

    public ac(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f16727a = i10;
        this.f16728b = messagesController;
        this.f16729c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f16730f = hVar;
        this.h = hVar2;
        this.f16731n = hVar3;
        this.f16732r = hVar4;
        this.f16733s = hVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f16727a) {
            case 0:
                ((MessagesController) this.f16728b).lambda$processUpdateArray$416((LongSparseIntArray) this.f16729c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.h) this.f16730f, (a0.h) this.h, (a0.h) this.f16731n, (a0.h) this.f16732r, (a0.h) this.f16733s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f16728b).lambda$processUpdateArray$417((LongSparseIntArray) this.f16729c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.h) this.f16730f, (a0.h) this.h, (a0.h) this.f16731n, (a0.h) this.f16732r, (a0.h) this.f16733s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f16728b, (ArrayList) this.f16729c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.e, (ArrayList) this.f16730f, (ArrayList) this.h, (ArrayList) this.f16731n, (ArrayList) this.f16732r, (Runnable) this.f16733s);
                return;
        }
    }

    public ac(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f16727a = 2;
        this.f16728b = notificationsSettingsActivity;
        this.f16729c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.e = arrayList4;
        this.f16730f = arrayList5;
        this.h = arrayList6;
        this.f16731n = arrayList7;
        this.f16732r = arrayList8;
        this.f16733s = runnable;
    }
}
