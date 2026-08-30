package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class ac implements Runnable {
    public final int f16746a;
    public final NotificationCenter.NotificationCenterDelegate f16747b;
    public final Cloneable f16748c;
    public final Cloneable d;
    public final Cloneable e;
    public final Cloneable f16749f;
    public final Cloneable h;
    public final Cloneable f16750n;
    public final Cloneable f16751r;
    public final Object f16752s;
    public final Cloneable v;

    public ac(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f16746a = i10;
        this.f16747b = messagesController;
        this.f16748c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f16749f = hVar;
        this.h = hVar2;
        this.f16750n = hVar3;
        this.f16751r = hVar4;
        this.f16752s = hVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f16746a) {
            case 0:
                ((MessagesController) this.f16747b).lambda$processUpdateArray$416((LongSparseIntArray) this.f16748c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.h) this.f16749f, (a0.h) this.h, (a0.h) this.f16750n, (a0.h) this.f16751r, (a0.h) this.f16752s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f16747b).lambda$processUpdateArray$417((LongSparseIntArray) this.f16748c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.h) this.f16749f, (a0.h) this.h, (a0.h) this.f16750n, (a0.h) this.f16751r, (a0.h) this.f16752s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f16747b, (ArrayList) this.f16748c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.e, (ArrayList) this.f16749f, (ArrayList) this.h, (ArrayList) this.f16750n, (ArrayList) this.f16751r, (Runnable) this.f16752s);
                return;
        }
    }

    public ac(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f16746a = 2;
        this.f16747b = notificationsSettingsActivity;
        this.f16748c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.e = arrayList4;
        this.f16749f = arrayList5;
        this.h = arrayList6;
        this.f16750n = arrayList7;
        this.f16751r = arrayList8;
        this.f16752s = runnable;
    }
}
