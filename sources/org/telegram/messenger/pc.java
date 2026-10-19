package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class pc implements Runnable {
    public final int f19249a;
    public final NotificationCenter.NotificationCenterDelegate f19250b;
    public final Cloneable f19251c;
    public final Cloneable d;
    public final Cloneable e;
    public final Cloneable f19252f;
    public final Cloneable h;
    public final Cloneable f19253n;
    public final Cloneable f19254r;
    public final Object f19255s;
    public final Cloneable v;

    public pc(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f19249a = i10;
        this.f19250b = messagesController;
        this.f19251c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f19252f = hVar;
        this.h = hVar2;
        this.f19253n = hVar3;
        this.f19254r = hVar4;
        this.f19255s = hVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f19249a) {
            case 0:
                ((MessagesController) this.f19250b).lambda$processUpdateArray$420((LongSparseIntArray) this.f19251c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.h) this.f19252f, (a0.h) this.h, (a0.h) this.f19253n, (a0.h) this.f19254r, (a0.h) this.f19255s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f19250b).lambda$processUpdateArray$419((LongSparseIntArray) this.f19251c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.h) this.f19252f, (a0.h) this.h, (a0.h) this.f19253n, (a0.h) this.f19254r, (a0.h) this.f19255s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f19250b, (ArrayList) this.f19251c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.e, (ArrayList) this.f19252f, (ArrayList) this.h, (ArrayList) this.f19253n, (ArrayList) this.f19254r, (Runnable) this.f19255s);
                return;
        }
    }

    public pc(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f19249a = 2;
        this.f19250b = notificationsSettingsActivity;
        this.f19251c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.e = arrayList4;
        this.f19252f = arrayList5;
        this.h = arrayList6;
        this.f19253n = arrayList7;
        this.f19254r = arrayList8;
        this.f19255s = runnable;
    }
}
