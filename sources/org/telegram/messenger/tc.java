package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class tc implements Runnable {
    public final int f19585a;
    public final NotificationCenter.NotificationCenterDelegate f19586b;
    public final Cloneable f19587c;
    public final Cloneable d;
    public final Cloneable e;
    public final Cloneable f19588f;
    public final Cloneable h;
    public final Cloneable f19589n;
    public final Cloneable f19590r;
    public final Object f19591s;
    public final Cloneable v;

    public tc(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f19585a = i10;
        this.f19586b = messagesController;
        this.f19587c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f19588f = hVar;
        this.h = hVar2;
        this.f19589n = hVar3;
        this.f19590r = hVar4;
        this.f19591s = hVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f19585a) {
            case 0:
                ((MessagesController) this.f19586b).lambda$processUpdateArray$420((LongSparseIntArray) this.f19587c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.h) this.f19588f, (a0.h) this.h, (a0.h) this.f19589n, (a0.h) this.f19590r, (a0.h) this.f19591s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f19586b).lambda$processUpdateArray$419((LongSparseIntArray) this.f19587c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.h) this.f19588f, (a0.h) this.h, (a0.h) this.f19589n, (a0.h) this.f19590r, (a0.h) this.f19591s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f19586b, (ArrayList) this.f19587c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.e, (ArrayList) this.f19588f, (ArrayList) this.h, (ArrayList) this.f19589n, (ArrayList) this.f19590r, (Runnable) this.f19591s);
                return;
        }
    }

    public tc(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f19585a = 2;
        this.f19586b = notificationsSettingsActivity;
        this.f19587c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.e = arrayList4;
        this.f19588f = arrayList5;
        this.h = arrayList6;
        this.f19589n = arrayList7;
        this.f19590r = arrayList8;
        this.f19591s = runnable;
    }
}
