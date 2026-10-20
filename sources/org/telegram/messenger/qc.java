package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class qc implements Runnable {
    public final int f19344a;
    public final NotificationCenter.NotificationCenterDelegate f19345b;
    public final Cloneable f19346c;
    public final Cloneable d;
    public final Cloneable e;
    public final Cloneable f19347f;
    public final Cloneable h;
    public final Cloneable f19348n;
    public final Cloneable f19349r;
    public final Object f19350s;
    public final Cloneable v;

    public qc(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f19344a = i10;
        this.f19345b = messagesController;
        this.f19346c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f19347f = hVar;
        this.h = hVar2;
        this.f19348n = hVar3;
        this.f19349r = hVar4;
        this.f19350s = hVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f19344a) {
            case 0:
                ((MessagesController) this.f19345b).lambda$processUpdateArray$420((LongSparseIntArray) this.f19346c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.h) this.f19347f, (a0.h) this.h, (a0.h) this.f19348n, (a0.h) this.f19349r, (a0.h) this.f19350s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f19345b).lambda$processUpdateArray$419((LongSparseIntArray) this.f19346c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.h) this.f19347f, (a0.h) this.h, (a0.h) this.f19348n, (a0.h) this.f19349r, (a0.h) this.f19350s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f19345b, (ArrayList) this.f19346c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.e, (ArrayList) this.f19347f, (ArrayList) this.h, (ArrayList) this.f19348n, (ArrayList) this.f19349r, (Runnable) this.f19350s);
                return;
        }
    }

    public qc(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f19344a = 2;
        this.f19345b = notificationsSettingsActivity;
        this.f19346c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.e = arrayList4;
        this.f19347f = arrayList5;
        this.h = arrayList6;
        this.f19348n = arrayList7;
        this.f19349r = arrayList8;
        this.f19350s = runnable;
    }
}
