package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class qc implements Runnable {
    public final int f18927a;
    public final NotificationCenter.NotificationCenterDelegate f18928b;
    public final Cloneable f18929c;
    public final Cloneable d;
    public final Cloneable f18930e;
    public final Cloneable f18931f;
    public final Cloneable h;
    public final Cloneable f18932n;
    public final Cloneable f18933r;
    public final Object f18934s;
    public final Cloneable v;

    public qc(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.i iVar, a0.i iVar2, a0.i iVar3, a0.i iVar4, a0.i iVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f18927a = i10;
        this.f18928b = messagesController;
        this.f18929c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.f18930e = sparseIntArray;
        this.f18931f = iVar;
        this.h = iVar2;
        this.f18932n = iVar3;
        this.f18933r = iVar4;
        this.f18934s = iVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f18927a) {
            case 0:
                ((MessagesController) this.f18928b).lambda$processUpdateArray$420((LongSparseIntArray) this.f18929c, (LongSparseIntArray) this.d, (SparseIntArray) this.f18930e, (a0.i) this.f18931f, (a0.i) this.h, (a0.i) this.f18932n, (a0.i) this.f18933r, (a0.i) this.f18934s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f18928b).lambda$processUpdateArray$419((LongSparseIntArray) this.f18929c, (LongSparseIntArray) this.d, (SparseIntArray) this.f18930e, (a0.i) this.f18931f, (a0.i) this.h, (a0.i) this.f18932n, (a0.i) this.f18933r, (a0.i) this.f18934s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f18928b, (ArrayList) this.f18929c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.f18930e, (ArrayList) this.f18931f, (ArrayList) this.h, (ArrayList) this.f18932n, (ArrayList) this.f18933r, (Runnable) this.f18934s);
                return;
        }
    }

    public qc(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f18927a = 2;
        this.f18928b = notificationsSettingsActivity;
        this.f18929c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.f18930e = arrayList4;
        this.f18931f = arrayList5;
        this.h = arrayList6;
        this.f18932n = arrayList7;
        this.f18933r = arrayList8;
        this.f18934s = runnable;
    }
}
