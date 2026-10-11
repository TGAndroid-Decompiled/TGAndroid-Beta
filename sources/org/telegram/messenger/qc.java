package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class qc implements Runnable {
    public final int f18932a;
    public final NotificationCenter.NotificationCenterDelegate f18933b;
    public final Cloneable f18934c;
    public final Cloneable d;
    public final Cloneable f18935e;
    public final Cloneable f18936f;
    public final Cloneable h;
    public final Cloneable f18937n;
    public final Cloneable f18938r;
    public final Object f18939s;
    public final Cloneable v;

    public qc(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.i iVar, a0.i iVar2, a0.i iVar3, a0.i iVar4, a0.i iVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f18932a = i10;
        this.f18933b = messagesController;
        this.f18934c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.f18935e = sparseIntArray;
        this.f18936f = iVar;
        this.h = iVar2;
        this.f18937n = iVar3;
        this.f18938r = iVar4;
        this.f18939s = iVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f18932a) {
            case 0:
                ((MessagesController) this.f18933b).lambda$processUpdateArray$420((LongSparseIntArray) this.f18934c, (LongSparseIntArray) this.d, (SparseIntArray) this.f18935e, (a0.i) this.f18936f, (a0.i) this.h, (a0.i) this.f18937n, (a0.i) this.f18938r, (a0.i) this.f18939s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f18933b).lambda$processUpdateArray$419((LongSparseIntArray) this.f18934c, (LongSparseIntArray) this.d, (SparseIntArray) this.f18935e, (a0.i) this.f18936f, (a0.i) this.h, (a0.i) this.f18937n, (a0.i) this.f18938r, (a0.i) this.f18939s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f18933b, (ArrayList) this.f18934c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.f18935e, (ArrayList) this.f18936f, (ArrayList) this.h, (ArrayList) this.f18937n, (ArrayList) this.f18938r, (Runnable) this.f18939s);
                return;
        }
    }

    public qc(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f18932a = 2;
        this.f18933b = notificationsSettingsActivity;
        this.f18934c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.f18935e = arrayList4;
        this.f18936f = arrayList5;
        this.h = arrayList6;
        this.f18937n = arrayList7;
        this.f18938r = arrayList8;
        this.f18939s = runnable;
    }
}
