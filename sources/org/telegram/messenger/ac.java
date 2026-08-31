package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class ac implements Runnable {
    public final int f18140a;
    public final NotificationCenter.NotificationCenterDelegate f18141b;
    public final Cloneable f18142c;
    public final Cloneable d;
    public final Cloneable f18143e;
    public final Cloneable f18144f;
    public final Cloneable h;
    public final Cloneable f18145n;
    public final Cloneable f18146r;
    public final Object f18147s;
    public final Cloneable v;

    public ac(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f18140a = i10;
        this.f18141b = messagesController;
        this.f18142c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.f18143e = sparseIntArray;
        this.f18144f = hVar;
        this.h = hVar2;
        this.f18145n = hVar3;
        this.f18146r = hVar4;
        this.f18147s = hVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f18140a) {
            case 0:
                ((MessagesController) this.f18141b).lambda$processUpdateArray$416((LongSparseIntArray) this.f18142c, (LongSparseIntArray) this.d, (SparseIntArray) this.f18143e, (a0.h) this.f18144f, (a0.h) this.h, (a0.h) this.f18145n, (a0.h) this.f18146r, (a0.h) this.f18147s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f18141b).lambda$processUpdateArray$417((LongSparseIntArray) this.f18142c, (LongSparseIntArray) this.d, (SparseIntArray) this.f18143e, (a0.h) this.f18144f, (a0.h) this.h, (a0.h) this.f18145n, (a0.h) this.f18146r, (a0.h) this.f18147s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f18141b, (ArrayList) this.f18142c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.f18143e, (ArrayList) this.f18144f, (ArrayList) this.h, (ArrayList) this.f18145n, (ArrayList) this.f18146r, (Runnable) this.f18147s);
                return;
        }
    }

    public ac(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f18140a = 2;
        this.f18141b = notificationsSettingsActivity;
        this.f18142c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.f18143e = arrayList4;
        this.f18144f = arrayList5;
        this.h = arrayList6;
        this.f18145n = arrayList7;
        this.f18146r = arrayList8;
        this.f18147s = runnable;
    }
}
