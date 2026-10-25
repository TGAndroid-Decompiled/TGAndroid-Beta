package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class qc implements Runnable {
    public final int f21026a;
    public final NotificationCenter.NotificationCenterDelegate f21027b;
    public final Cloneable f21028c;
    public final Cloneable d;
    public final Cloneable e;
    public final Cloneable f21029f;
    public final Cloneable h;
    public final Cloneable f21030n;
    public final Cloneable f21031r;
    public final Object f21032s;
    public final Cloneable v;

    public qc(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f21026a = i10;
        this.f21027b = messagesController;
        this.f21028c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f21029f = hVar;
        this.h = hVar2;
        this.f21030n = hVar3;
        this.f21031r = hVar4;
        this.f21032s = hVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f21026a) {
            case 0:
                ((MessagesController) this.f21027b).lambda$processUpdateArray$422((LongSparseIntArray) this.f21028c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.h) this.f21029f, (a0.h) this.h, (a0.h) this.f21030n, (a0.h) this.f21031r, (a0.h) this.f21032s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f21027b).lambda$processUpdateArray$421((LongSparseIntArray) this.f21028c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.h) this.f21029f, (a0.h) this.h, (a0.h) this.f21030n, (a0.h) this.f21031r, (a0.h) this.f21032s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) this.f21027b, (ArrayList) this.f21028c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.e, (ArrayList) this.f21029f, (ArrayList) this.h, (ArrayList) this.f21030n, (ArrayList) this.f21031r, (Runnable) this.f21032s);
                return;
        }
    }

    public qc(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f21026a = 2;
        this.f21027b = notificationsSettingsActivity;
        this.f21028c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.e = arrayList4;
        this.f21029f = arrayList5;
        this.h = arrayList6;
        this.f21030n = arrayList7;
        this.f21031r = arrayList8;
        this.f21032s = runnable;
    }
}
