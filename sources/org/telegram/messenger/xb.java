package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;

public final class xb implements Runnable {

    public final int f22130a;

    public final NotificationCenter.NotificationCenterDelegate f22131b;

    public final Cloneable f22132c;
    public final Cloneable d;

    public final Cloneable f22133e;

    public final Cloneable f22134f;
    public final Cloneable h;

    public final Cloneable f22135n;

    public final Cloneable f22136r;

    public final Object f22137s;
    public final Cloneable v;

    public xb(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f22130a = i10;
        this.f22131b = messagesController;
        this.f22132c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.f22133e = sparseIntArray;
        this.f22134f = hVar;
        this.h = hVar2;
        this.f22135n = hVar3;
        this.f22136r = hVar4;
        this.f22137s = hVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f22130a) {
            case 0:
                ((MessagesController) this.f22131b).lambda$processUpdateArray$416((LongSparseIntArray) this.f22132c, (LongSparseIntArray) this.d, (SparseIntArray) this.f22133e, (a0.h) this.f22134f, (a0.h) this.h, (a0.h) this.f22135n, (a0.h) this.f22136r, (a0.h) this.f22137s, (LongSparseIntArray) this.v);
                break;
            case 1:
                ((MessagesController) this.f22131b).lambda$processUpdateArray$417((LongSparseIntArray) this.f22132c, (LongSparseIntArray) this.d, (SparseIntArray) this.f22133e, (a0.h) this.f22134f, (a0.h) this.h, (a0.h) this.f22135n, (a0.h) this.f22136r, (a0.h) this.f22137s, (LongSparseIntArray) this.v);
                break;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f22131b, (ArrayList) this.f22132c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.f22133e, (ArrayList) this.f22134f, (ArrayList) this.h, (ArrayList) this.f22135n, (ArrayList) this.f22136r, (Runnable) this.f22137s);
                break;
        }
    }

    public xb(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f22130a = 2;
        this.f22131b = notificationsSettingsActivity;
        this.f22132c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.f22133e = arrayList4;
        this.f22134f = arrayList5;
        this.h = arrayList6;
        this.f22135n = arrayList7;
        this.f22136r = arrayList8;
        this.f22137s = runnable;
    }
}
