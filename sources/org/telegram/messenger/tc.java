package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class tc implements Runnable {
    public final int f18181a;
    public final NotificationCenter.NotificationCenterDelegate f18182b;
    public final Cloneable f18183c;
    public final Cloneable d;
    public final Cloneable e;
    public final Cloneable f18184f;
    public final Cloneable h;
    public final Cloneable f18185n;
    public final Cloneable f18186r;
    public final Object f18187s;
    public final Cloneable v;

    public tc(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f18181a = i10;
        this.f18182b = messagesController;
        this.f18183c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f18184f = hVar;
        this.h = hVar2;
        this.f18185n = hVar3;
        this.f18186r = hVar4;
        this.f18187s = hVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f18181a) {
            case 0:
                ((MessagesController) this.f18182b).lambda$processUpdateArray$420((LongSparseIntArray) this.f18183c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.h) this.f18184f, (a0.h) this.h, (a0.h) this.f18185n, (a0.h) this.f18186r, (a0.h) this.f18187s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f18182b).lambda$processUpdateArray$419((LongSparseIntArray) this.f18183c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.h) this.f18184f, (a0.h) this.h, (a0.h) this.f18185n, (a0.h) this.f18186r, (a0.h) this.f18187s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f18182b, (ArrayList) this.f18183c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.e, (ArrayList) this.f18184f, (ArrayList) this.h, (ArrayList) this.f18185n, (ArrayList) this.f18186r, (Runnable) this.f18187s);
                return;
        }
    }

    public tc(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f18181a = 2;
        this.f18182b = notificationsSettingsActivity;
        this.f18183c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.e = arrayList4;
        this.f18184f = arrayList5;
        this.h = arrayList6;
        this.f18185n = arrayList7;
        this.f18186r = arrayList8;
        this.f18187s = runnable;
    }
}
