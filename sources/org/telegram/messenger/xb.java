package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class xb implements Runnable {
    public final int f19652a;
    public final NotificationCenter.NotificationCenterDelegate f19653b;
    public final Cloneable f19654c;
    public final Cloneable d;
    public final Cloneable f19655e;
    public final Cloneable f19656f;
    public final Cloneable h;
    public final Cloneable f19657n;
    public final Cloneable f19658r;
    public final Object f19659s;
    public final Cloneable v;

    public xb(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.i iVar, a0.i iVar2, a0.i iVar3, a0.i iVar4, a0.i iVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f19652a = i10;
        this.f19653b = messagesController;
        this.f19654c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.f19655e = sparseIntArray;
        this.f19656f = iVar;
        this.h = iVar2;
        this.f19657n = iVar3;
        this.f19658r = iVar4;
        this.f19659s = iVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f19652a) {
            case 0:
                ((MessagesController) this.f19653b).lambda$processUpdateArray$416((LongSparseIntArray) this.f19654c, (LongSparseIntArray) this.d, (SparseIntArray) this.f19655e, (a0.i) this.f19656f, (a0.i) this.h, (a0.i) this.f19657n, (a0.i) this.f19658r, (a0.i) this.f19659s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f19653b).lambda$processUpdateArray$417((LongSparseIntArray) this.f19654c, (LongSparseIntArray) this.d, (SparseIntArray) this.f19655e, (a0.i) this.f19656f, (a0.i) this.h, (a0.i) this.f19657n, (a0.i) this.f19658r, (a0.i) this.f19659s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f19653b, (ArrayList) this.f19654c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.f19655e, (ArrayList) this.f19656f, (ArrayList) this.h, (ArrayList) this.f19657n, (ArrayList) this.f19658r, (Runnable) this.f19659s);
                return;
        }
    }

    public xb(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f19652a = 2;
        this.f19653b = notificationsSettingsActivity;
        this.f19654c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.f19655e = arrayList4;
        this.f19656f = arrayList5;
        this.h = arrayList6;
        this.f19657n = arrayList7;
        this.f19658r = arrayList8;
        this.f19659s = runnable;
    }
}
