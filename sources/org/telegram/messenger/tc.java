package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class tc implements Runnable {
    public final int f18976a;
    public final NotificationCenter.NotificationCenterDelegate f18977b;
    public final Cloneable f18978c;
    public final Cloneable d;
    public final Cloneable f18979e;
    public final Cloneable f18980f;
    public final Cloneable h;
    public final Cloneable f18981n;
    public final Cloneable f18982r;
    public final Object f18983s;
    public final Cloneable v;

    public tc(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.i iVar, a0.i iVar2, a0.i iVar3, a0.i iVar4, a0.i iVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f18976a = i10;
        this.f18977b = messagesController;
        this.f18978c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.f18979e = sparseIntArray;
        this.f18980f = iVar;
        this.h = iVar2;
        this.f18981n = iVar3;
        this.f18982r = iVar4;
        this.f18983s = iVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f18976a) {
            case 0:
                ((MessagesController) this.f18977b).lambda$processUpdateArray$420((LongSparseIntArray) this.f18978c, (LongSparseIntArray) this.d, (SparseIntArray) this.f18979e, (a0.i) this.f18980f, (a0.i) this.h, (a0.i) this.f18981n, (a0.i) this.f18982r, (a0.i) this.f18983s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f18977b).lambda$processUpdateArray$419((LongSparseIntArray) this.f18978c, (LongSparseIntArray) this.d, (SparseIntArray) this.f18979e, (a0.i) this.f18980f, (a0.i) this.h, (a0.i) this.f18981n, (a0.i) this.f18982r, (a0.i) this.f18983s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f18977b, (ArrayList) this.f18978c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.f18979e, (ArrayList) this.f18980f, (ArrayList) this.h, (ArrayList) this.f18981n, (ArrayList) this.f18982r, (Runnable) this.f18983s);
                return;
        }
    }

    public tc(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f18976a = 2;
        this.f18977b = notificationsSettingsActivity;
        this.f18978c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.f18979e = arrayList4;
        this.f18980f = arrayList5;
        this.h = arrayList6;
        this.f18981n = arrayList7;
        this.f18982r = arrayList8;
        this.f18983s = runnable;
    }
}
