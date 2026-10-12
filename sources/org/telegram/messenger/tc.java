package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class tc implements Runnable {
    public final int f18975a;
    public final NotificationCenter.NotificationCenterDelegate f18976b;
    public final Cloneable f18977c;
    public final Cloneable d;
    public final Cloneable f18978e;
    public final Cloneable f18979f;
    public final Cloneable h;
    public final Cloneable f18980n;
    public final Cloneable f18981r;
    public final Object f18982s;
    public final Cloneable v;

    public tc(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.i iVar, a0.i iVar2, a0.i iVar3, a0.i iVar4, a0.i iVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f18975a = i10;
        this.f18976b = messagesController;
        this.f18977c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.f18978e = sparseIntArray;
        this.f18979f = iVar;
        this.h = iVar2;
        this.f18980n = iVar3;
        this.f18981r = iVar4;
        this.f18982s = iVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f18975a) {
            case 0:
                ((MessagesController) this.f18976b).lambda$processUpdateArray$420((LongSparseIntArray) this.f18977c, (LongSparseIntArray) this.d, (SparseIntArray) this.f18978e, (a0.i) this.f18979f, (a0.i) this.h, (a0.i) this.f18980n, (a0.i) this.f18981r, (a0.i) this.f18982s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f18976b).lambda$processUpdateArray$419((LongSparseIntArray) this.f18977c, (LongSparseIntArray) this.d, (SparseIntArray) this.f18978e, (a0.i) this.f18979f, (a0.i) this.h, (a0.i) this.f18980n, (a0.i) this.f18981r, (a0.i) this.f18982s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f18976b, (ArrayList) this.f18977c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.f18978e, (ArrayList) this.f18979f, (ArrayList) this.h, (ArrayList) this.f18980n, (ArrayList) this.f18981r, (Runnable) this.f18982s);
                return;
        }
    }

    public tc(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f18975a = 2;
        this.f18976b = notificationsSettingsActivity;
        this.f18977c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.f18978e = arrayList4;
        this.f18979f = arrayList5;
        this.h = arrayList6;
        this.f18980n = arrayList7;
        this.f18981r = arrayList8;
        this.f18982s = runnable;
    }
}
