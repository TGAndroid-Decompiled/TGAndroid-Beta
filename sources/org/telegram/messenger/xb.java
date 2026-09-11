package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class xb implements Runnable {
    public final int f19625a;
    public final NotificationCenter.NotificationCenterDelegate f19626b;
    public final Cloneable f19627c;
    public final Cloneable d;
    public final Cloneable f19628e;
    public final Cloneable f19629f;
    public final Cloneable h;
    public final Cloneable f19630n;
    public final Cloneable f19631r;
    public final Object f19632s;
    public final Cloneable v;

    public xb(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.i iVar, a0.i iVar2, a0.i iVar3, a0.i iVar4, a0.i iVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f19625a = i10;
        this.f19626b = messagesController;
        this.f19627c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.f19628e = sparseIntArray;
        this.f19629f = iVar;
        this.h = iVar2;
        this.f19630n = iVar3;
        this.f19631r = iVar4;
        this.f19632s = iVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f19625a) {
            case 0:
                ((MessagesController) this.f19626b).lambda$processUpdateArray$416((LongSparseIntArray) this.f19627c, (LongSparseIntArray) this.d, (SparseIntArray) this.f19628e, (a0.i) this.f19629f, (a0.i) this.h, (a0.i) this.f19630n, (a0.i) this.f19631r, (a0.i) this.f19632s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f19626b).lambda$processUpdateArray$417((LongSparseIntArray) this.f19627c, (LongSparseIntArray) this.d, (SparseIntArray) this.f19628e, (a0.i) this.f19629f, (a0.i) this.h, (a0.i) this.f19630n, (a0.i) this.f19631r, (a0.i) this.f19632s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f19626b, (ArrayList) this.f19627c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.f19628e, (ArrayList) this.f19629f, (ArrayList) this.h, (ArrayList) this.f19630n, (ArrayList) this.f19631r, (Runnable) this.f19632s);
                return;
        }
    }

    public xb(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f19625a = 2;
        this.f19626b = notificationsSettingsActivity;
        this.f19627c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.f19628e = arrayList4;
        this.f19629f = arrayList5;
        this.h = arrayList6;
        this.f19630n = arrayList7;
        this.f19631r = arrayList8;
        this.f19632s = runnable;
    }
}
