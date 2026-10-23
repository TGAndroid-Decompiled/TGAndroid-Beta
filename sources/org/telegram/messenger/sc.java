package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class sc implements Runnable {
    public final int f19577a;
    public final NotificationCenter.NotificationCenterDelegate f19578b;
    public final Cloneable f19579c;
    public final Cloneable d;
    public final Cloneable e;
    public final Cloneable f19580f;
    public final Cloneable h;
    public final Cloneable f19581n;
    public final Cloneable f19582r;
    public final Object f19583s;
    public final Cloneable v;

    public sc(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f19577a = i10;
        this.f19578b = messagesController;
        this.f19579c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f19580f = hVar;
        this.h = hVar2;
        this.f19581n = hVar3;
        this.f19582r = hVar4;
        this.f19583s = hVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f19577a) {
            case 0:
                ((MessagesController) this.f19578b).lambda$processUpdateArray$420((LongSparseIntArray) this.f19579c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.h) this.f19580f, (a0.h) this.h, (a0.h) this.f19581n, (a0.h) this.f19582r, (a0.h) this.f19583s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f19578b).lambda$processUpdateArray$419((LongSparseIntArray) this.f19579c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.h) this.f19580f, (a0.h) this.h, (a0.h) this.f19581n, (a0.h) this.f19582r, (a0.h) this.f19583s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f19578b, (ArrayList) this.f19579c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.e, (ArrayList) this.f19580f, (ArrayList) this.h, (ArrayList) this.f19581n, (ArrayList) this.f19582r, (Runnable) this.f19583s);
                return;
        }
    }

    public sc(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f19577a = 2;
        this.f19578b = notificationsSettingsActivity;
        this.f19579c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.e = arrayList4;
        this.f19580f = arrayList5;
        this.h = arrayList6;
        this.f19581n = arrayList7;
        this.f19582r = arrayList8;
        this.f19583s = runnable;
    }
}
