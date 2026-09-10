package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class fc implements Runnable {
    public final int f15166a;
    public final NotificationCenter.NotificationCenterDelegate f15167b;
    public final Cloneable f15168c;
    public final Cloneable d;
    public final Cloneable e;
    public final Cloneable f15169f;
    public final Cloneable h;
    public final Cloneable f15170n;
    public final Cloneable f15171r;
    public final Object f15172s;
    public final Cloneable v;

    public fc(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.i iVar, a0.i iVar2, a0.i iVar3, a0.i iVar4, a0.i iVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f15166a = i10;
        this.f15167b = messagesController;
        this.f15168c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f15169f = iVar;
        this.h = iVar2;
        this.f15170n = iVar3;
        this.f15171r = iVar4;
        this.f15172s = iVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f15166a) {
            case 0:
                ((MessagesController) this.f15167b).lambda$processUpdateArray$416((LongSparseIntArray) this.f15168c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.i) this.f15169f, (a0.i) this.h, (a0.i) this.f15170n, (a0.i) this.f15171r, (a0.i) this.f15172s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f15167b).lambda$processUpdateArray$417((LongSparseIntArray) this.f15168c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.i) this.f15169f, (a0.i) this.h, (a0.i) this.f15170n, (a0.i) this.f15171r, (a0.i) this.f15172s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f15167b, (ArrayList) this.f15168c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.e, (ArrayList) this.f15169f, (ArrayList) this.h, (ArrayList) this.f15170n, (ArrayList) this.f15171r, (Runnable) this.f15172s);
                return;
        }
    }

    public fc(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f15166a = 2;
        this.f15167b = notificationsSettingsActivity;
        this.f15168c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.e = arrayList4;
        this.f15169f = arrayList5;
        this.h = arrayList6;
        this.f15170n = arrayList7;
        this.f15171r = arrayList8;
        this.f15172s = runnable;
    }
}
