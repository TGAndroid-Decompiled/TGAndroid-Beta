package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class pc implements Runnable {
    public final int f19246a;
    public final NotificationCenter.NotificationCenterDelegate f19247b;
    public final Cloneable f19248c;
    public final Cloneable d;
    public final Cloneable e;
    public final Cloneable f19249f;
    public final Cloneable h;
    public final Cloneable f19250n;
    public final Cloneable f19251r;
    public final Object f19252s;
    public final Cloneable v;

    public pc(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f19246a = i10;
        this.f19247b = messagesController;
        this.f19248c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f19249f = hVar;
        this.h = hVar2;
        this.f19250n = hVar3;
        this.f19251r = hVar4;
        this.f19252s = hVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f19246a) {
            case 0:
                ((MessagesController) this.f19247b).lambda$processUpdateArray$420((LongSparseIntArray) this.f19248c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.h) this.f19249f, (a0.h) this.h, (a0.h) this.f19250n, (a0.h) this.f19251r, (a0.h) this.f19252s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f19247b).lambda$processUpdateArray$419((LongSparseIntArray) this.f19248c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.h) this.f19249f, (a0.h) this.h, (a0.h) this.f19250n, (a0.h) this.f19251r, (a0.h) this.f19252s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f19247b, (ArrayList) this.f19248c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.e, (ArrayList) this.f19249f, (ArrayList) this.h, (ArrayList) this.f19250n, (ArrayList) this.f19251r, (Runnable) this.f19252s);
                return;
        }
    }

    public pc(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f19246a = 2;
        this.f19247b = notificationsSettingsActivity;
        this.f19248c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.e = arrayList4;
        this.f19249f = arrayList5;
        this.h = arrayList6;
        this.f19250n = arrayList7;
        this.f19251r = arrayList8;
        this.f19252s = runnable;
    }
}
