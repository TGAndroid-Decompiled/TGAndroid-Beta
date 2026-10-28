package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class oc implements Runnable {
    public final int f20855a;
    public final NotificationCenter.NotificationCenterDelegate f20856b;
    public final Cloneable f20857c;
    public final Cloneable d;
    public final Cloneable e;
    public final Cloneable f20858f;
    public final Cloneable h;
    public final Cloneable f20859n;
    public final Cloneable f20860r;
    public final Object f20861s;
    public final Cloneable v;

    public oc(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f20855a = i10;
        this.f20856b = messagesController;
        this.f20857c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f20858f = hVar;
        this.h = hVar2;
        this.f20859n = hVar3;
        this.f20860r = hVar4;
        this.f20861s = hVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f20855a) {
            case 0:
                ((MessagesController) this.f20856b).lambda$processUpdateArray$423((LongSparseIntArray) this.f20857c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.h) this.f20858f, (a0.h) this.h, (a0.h) this.f20859n, (a0.h) this.f20860r, (a0.h) this.f20861s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f20856b).lambda$processUpdateArray$422((LongSparseIntArray) this.f20857c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.h) this.f20858f, (a0.h) this.h, (a0.h) this.f20859n, (a0.h) this.f20860r, (a0.h) this.f20861s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) this.f20856b, (ArrayList) this.f20857c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.e, (ArrayList) this.f20858f, (ArrayList) this.h, (ArrayList) this.f20859n, (ArrayList) this.f20860r, (Runnable) this.f20861s);
                return;
        }
    }

    public oc(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f20855a = 2;
        this.f20856b = notificationsSettingsActivity;
        this.f20857c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.e = arrayList4;
        this.f20858f = arrayList5;
        this.h = arrayList6;
        this.f20859n = arrayList7;
        this.f20860r = arrayList8;
        this.f20861s = runnable;
    }
}
