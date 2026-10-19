package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class oc implements Runnable {
    public final int f19169a;
    public final NotificationCenter.NotificationCenterDelegate f19170b;
    public final Cloneable f19171c;
    public final Cloneable d;
    public final Cloneable e;
    public final Cloneable f19172f;
    public final Cloneable h;
    public final Cloneable f19173n;
    public final Cloneable f19174r;
    public final Object f19175s;
    public final Cloneable v;

    public oc(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f19169a = i10;
        this.f19170b = messagesController;
        this.f19171c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f19172f = hVar;
        this.h = hVar2;
        this.f19173n = hVar3;
        this.f19174r = hVar4;
        this.f19175s = hVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f19169a) {
            case 0:
                ((MessagesController) this.f19170b).lambda$processUpdateArray$420((LongSparseIntArray) this.f19171c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.h) this.f19172f, (a0.h) this.h, (a0.h) this.f19173n, (a0.h) this.f19174r, (a0.h) this.f19175s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f19170b).lambda$processUpdateArray$419((LongSparseIntArray) this.f19171c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.h) this.f19172f, (a0.h) this.h, (a0.h) this.f19173n, (a0.h) this.f19174r, (a0.h) this.f19175s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f19170b, (ArrayList) this.f19171c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.e, (ArrayList) this.f19172f, (ArrayList) this.h, (ArrayList) this.f19173n, (ArrayList) this.f19174r, (Runnable) this.f19175s);
                return;
        }
    }

    public oc(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f19169a = 2;
        this.f19170b = notificationsSettingsActivity;
        this.f19171c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.e = arrayList4;
        this.f19172f = arrayList5;
        this.h = arrayList6;
        this.f19173n = arrayList7;
        this.f19174r = arrayList8;
        this.f19175s = runnable;
    }
}
