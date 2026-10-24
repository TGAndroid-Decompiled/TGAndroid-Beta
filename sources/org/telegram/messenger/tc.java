package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class tc implements Runnable {
    public final int f19652a;
    public final NotificationCenter.NotificationCenterDelegate f19653b;
    public final Cloneable f19654c;
    public final Cloneable d;
    public final Cloneable e;
    public final Cloneable f19655f;
    public final Cloneable h;
    public final Cloneable f19656n;
    public final Cloneable f19657r;
    public final Object f19658s;
    public final Cloneable v;

    public tc(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f19652a = i10;
        this.f19653b = messagesController;
        this.f19654c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f19655f = hVar;
        this.h = hVar2;
        this.f19656n = hVar3;
        this.f19657r = hVar4;
        this.f19658s = hVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f19652a) {
            case 0:
                ((MessagesController) this.f19653b).lambda$processUpdateArray$420((LongSparseIntArray) this.f19654c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.h) this.f19655f, (a0.h) this.h, (a0.h) this.f19656n, (a0.h) this.f19657r, (a0.h) this.f19658s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f19653b).lambda$processUpdateArray$419((LongSparseIntArray) this.f19654c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.h) this.f19655f, (a0.h) this.h, (a0.h) this.f19656n, (a0.h) this.f19657r, (a0.h) this.f19658s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f19653b, (ArrayList) this.f19654c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.e, (ArrayList) this.f19655f, (ArrayList) this.h, (ArrayList) this.f19656n, (ArrayList) this.f19657r, (Runnable) this.f19658s);
                return;
        }
    }

    public tc(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f19652a = 2;
        this.f19653b = notificationsSettingsActivity;
        this.f19654c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.e = arrayList4;
        this.f19655f = arrayList5;
        this.h = arrayList6;
        this.f19656n = arrayList7;
        this.f19657r = arrayList8;
        this.f19658s = runnable;
    }
}
