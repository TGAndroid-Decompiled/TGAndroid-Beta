package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class qc implements Runnable {
    public final int f18923a;
    public final NotificationCenter.NotificationCenterDelegate f18924b;
    public final Cloneable f18925c;
    public final Cloneable d;
    public final Cloneable f18926e;
    public final Cloneable f18927f;
    public final Cloneable h;
    public final Cloneable f18928n;
    public final Cloneable f18929r;
    public final Object f18930s;
    public final Cloneable v;

    public qc(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.i iVar, a0.i iVar2, a0.i iVar3, a0.i iVar4, a0.i iVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f18923a = i10;
        this.f18924b = messagesController;
        this.f18925c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.f18926e = sparseIntArray;
        this.f18927f = iVar;
        this.h = iVar2;
        this.f18928n = iVar3;
        this.f18929r = iVar4;
        this.f18930s = iVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f18923a) {
            case 0:
                ((MessagesController) this.f18924b).lambda$processUpdateArray$420((LongSparseIntArray) this.f18925c, (LongSparseIntArray) this.d, (SparseIntArray) this.f18926e, (a0.i) this.f18927f, (a0.i) this.h, (a0.i) this.f18928n, (a0.i) this.f18929r, (a0.i) this.f18930s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f18924b).lambda$processUpdateArray$419((LongSparseIntArray) this.f18925c, (LongSparseIntArray) this.d, (SparseIntArray) this.f18926e, (a0.i) this.f18927f, (a0.i) this.h, (a0.i) this.f18928n, (a0.i) this.f18929r, (a0.i) this.f18930s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f18924b, (ArrayList) this.f18925c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.f18926e, (ArrayList) this.f18927f, (ArrayList) this.h, (ArrayList) this.f18928n, (ArrayList) this.f18929r, (Runnable) this.f18930s);
                return;
        }
    }

    public qc(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f18923a = 2;
        this.f18924b = notificationsSettingsActivity;
        this.f18925c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.f18926e = arrayList4;
        this.f18927f = arrayList5;
        this.h = arrayList6;
        this.f18928n = arrayList7;
        this.f18929r = arrayList8;
        this.f18930s = runnable;
    }
}
