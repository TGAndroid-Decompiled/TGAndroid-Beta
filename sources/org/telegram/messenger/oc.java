package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class oc implements Runnable {
    public final int f19170a;
    public final NotificationCenter.NotificationCenterDelegate f19171b;
    public final Cloneable f19172c;
    public final Cloneable d;
    public final Cloneable e;
    public final Cloneable f19173f;
    public final Cloneable h;
    public final Cloneable f19174n;
    public final Cloneable f19175r;
    public final Object f19176s;
    public final Cloneable v;

    public oc(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f19170a = i10;
        this.f19171b = messagesController;
        this.f19172c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f19173f = hVar;
        this.h = hVar2;
        this.f19174n = hVar3;
        this.f19175r = hVar4;
        this.f19176s = hVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f19170a) {
            case 0:
                ((MessagesController) this.f19171b).lambda$processUpdateArray$420((LongSparseIntArray) this.f19172c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.h) this.f19173f, (a0.h) this.h, (a0.h) this.f19174n, (a0.h) this.f19175r, (a0.h) this.f19176s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f19171b).lambda$processUpdateArray$419((LongSparseIntArray) this.f19172c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.h) this.f19173f, (a0.h) this.h, (a0.h) this.f19174n, (a0.h) this.f19175r, (a0.h) this.f19176s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f19171b, (ArrayList) this.f19172c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.e, (ArrayList) this.f19173f, (ArrayList) this.h, (ArrayList) this.f19174n, (ArrayList) this.f19175r, (Runnable) this.f19176s);
                return;
        }
    }

    public oc(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f19170a = 2;
        this.f19171b = notificationsSettingsActivity;
        this.f19172c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.e = arrayList4;
        this.f19173f = arrayList5;
        this.h = arrayList6;
        this.f19174n = arrayList7;
        this.f19175r = arrayList8;
        this.f19176s = runnable;
    }
}
