package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class tb implements Runnable {
    public final int f21559a;
    public final NotificationCenter.NotificationCenterDelegate f21560b;
    public final Cloneable f21561c;
    public final Cloneable d;
    public final Cloneable f21562e;
    public final Cloneable f21563f;
    public final Cloneable h;
    public final Cloneable f21564n;
    public final Cloneable f21565r;
    public final Object f21566s;
    public final Cloneable v;

    public tb(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i9) {
        this.f21559a = i9;
        this.f21560b = messagesController;
        this.f21561c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.f21562e = sparseIntArray;
        this.f21563f = hVar;
        this.h = hVar2;
        this.f21564n = hVar3;
        this.f21565r = hVar4;
        this.f21566s = hVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f21559a) {
            case 0:
                ((MessagesController) this.f21560b).lambda$processUpdateArray$416((LongSparseIntArray) this.f21561c, (LongSparseIntArray) this.d, (SparseIntArray) this.f21562e, (a0.h) this.f21563f, (a0.h) this.h, (a0.h) this.f21564n, (a0.h) this.f21565r, (a0.h) this.f21566s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f21560b).lambda$processUpdateArray$417((LongSparseIntArray) this.f21561c, (LongSparseIntArray) this.d, (SparseIntArray) this.f21562e, (a0.h) this.f21563f, (a0.h) this.h, (a0.h) this.f21564n, (a0.h) this.f21565r, (a0.h) this.f21566s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.T((NotificationsSettingsActivity) this.f21560b, (ArrayList) this.f21561c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.f21562e, (ArrayList) this.f21563f, (ArrayList) this.h, (ArrayList) this.f21564n, (ArrayList) this.f21565r, (Runnable) this.f21566s);
                return;
        }
    }

    public tb(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f21559a = 2;
        this.f21560b = notificationsSettingsActivity;
        this.f21561c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.f21562e = arrayList4;
        this.f21563f = arrayList5;
        this.h = arrayList6;
        this.f21564n = arrayList7;
        this.f21565r = arrayList8;
        this.f21566s = runnable;
    }
}
