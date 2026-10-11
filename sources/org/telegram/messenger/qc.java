package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class qc implements Runnable {
    public final int f18968a;
    public final NotificationCenter.NotificationCenterDelegate f18969b;
    public final Cloneable f18970c;
    public final Cloneable d;
    public final Cloneable f18971e;
    public final Cloneable f18972f;
    public final Cloneable h;
    public final Cloneable f18973n;
    public final Cloneable f18974r;
    public final Object f18975s;
    public final Cloneable v;

    public qc(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.i iVar, a0.i iVar2, a0.i iVar3, a0.i iVar4, a0.i iVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f18968a = i10;
        this.f18969b = messagesController;
        this.f18970c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.f18971e = sparseIntArray;
        this.f18972f = iVar;
        this.h = iVar2;
        this.f18973n = iVar3;
        this.f18974r = iVar4;
        this.f18975s = iVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f18968a) {
            case 0:
                ((MessagesController) this.f18969b).lambda$processUpdateArray$420((LongSparseIntArray) this.f18970c, (LongSparseIntArray) this.d, (SparseIntArray) this.f18971e, (a0.i) this.f18972f, (a0.i) this.h, (a0.i) this.f18973n, (a0.i) this.f18974r, (a0.i) this.f18975s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f18969b).lambda$processUpdateArray$419((LongSparseIntArray) this.f18970c, (LongSparseIntArray) this.d, (SparseIntArray) this.f18971e, (a0.i) this.f18972f, (a0.i) this.h, (a0.i) this.f18973n, (a0.i) this.f18974r, (a0.i) this.f18975s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f18969b, (ArrayList) this.f18970c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.f18971e, (ArrayList) this.f18972f, (ArrayList) this.h, (ArrayList) this.f18973n, (ArrayList) this.f18974r, (Runnable) this.f18975s);
                return;
        }
    }

    public qc(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f18968a = 2;
        this.f18969b = notificationsSettingsActivity;
        this.f18970c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.f18971e = arrayList4;
        this.f18972f = arrayList5;
        this.h = arrayList6;
        this.f18973n = arrayList7;
        this.f18974r = arrayList8;
        this.f18975s = runnable;
    }
}
