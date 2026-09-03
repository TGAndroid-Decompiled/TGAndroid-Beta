package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class ac implements Runnable {
    public final int f18142a;
    public final NotificationCenter.NotificationCenterDelegate f18143b;
    public final Cloneable f18144c;
    public final Cloneable d;
    public final Cloneable f18145e;
    public final Cloneable f18146f;
    public final Cloneable h;
    public final Cloneable f18147n;
    public final Cloneable f18148r;
    public final Object f18149s;
    public final Cloneable v;

    public ac(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f18142a = i10;
        this.f18143b = messagesController;
        this.f18144c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.f18145e = sparseIntArray;
        this.f18146f = hVar;
        this.h = hVar2;
        this.f18147n = hVar3;
        this.f18148r = hVar4;
        this.f18149s = hVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f18142a) {
            case 0:
                ((MessagesController) this.f18143b).lambda$processUpdateArray$416((LongSparseIntArray) this.f18144c, (LongSparseIntArray) this.d, (SparseIntArray) this.f18145e, (a0.h) this.f18146f, (a0.h) this.h, (a0.h) this.f18147n, (a0.h) this.f18148r, (a0.h) this.f18149s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f18143b).lambda$processUpdateArray$417((LongSparseIntArray) this.f18144c, (LongSparseIntArray) this.d, (SparseIntArray) this.f18145e, (a0.h) this.f18146f, (a0.h) this.h, (a0.h) this.f18147n, (a0.h) this.f18148r, (a0.h) this.f18149s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f18143b, (ArrayList) this.f18144c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.f18145e, (ArrayList) this.f18146f, (ArrayList) this.h, (ArrayList) this.f18147n, (ArrayList) this.f18148r, (Runnable) this.f18149s);
                return;
        }
    }

    public ac(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f18142a = 2;
        this.f18143b = notificationsSettingsActivity;
        this.f18144c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.f18145e = arrayList4;
        this.f18146f = arrayList5;
        this.h = arrayList6;
        this.f18147n = arrayList7;
        this.f18148r = arrayList8;
        this.f18149s = runnable;
    }
}
