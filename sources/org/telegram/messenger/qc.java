package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class qc implements Runnable {
    public final int f19341a;
    public final NotificationCenter.NotificationCenterDelegate f19342b;
    public final Cloneable f19343c;
    public final Cloneable d;
    public final Cloneable e;
    public final Cloneable f19344f;
    public final Cloneable h;
    public final Cloneable f19345n;
    public final Cloneable f19346r;
    public final Object f19347s;
    public final Cloneable v;

    public qc(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f19341a = i10;
        this.f19342b = messagesController;
        this.f19343c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f19344f = hVar;
        this.h = hVar2;
        this.f19345n = hVar3;
        this.f19346r = hVar4;
        this.f19347s = hVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f19341a) {
            case 0:
                ((MessagesController) this.f19342b).lambda$processUpdateArray$420((LongSparseIntArray) this.f19343c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.h) this.f19344f, (a0.h) this.h, (a0.h) this.f19345n, (a0.h) this.f19346r, (a0.h) this.f19347s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f19342b).lambda$processUpdateArray$419((LongSparseIntArray) this.f19343c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.h) this.f19344f, (a0.h) this.h, (a0.h) this.f19345n, (a0.h) this.f19346r, (a0.h) this.f19347s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f19342b, (ArrayList) this.f19343c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.e, (ArrayList) this.f19344f, (ArrayList) this.h, (ArrayList) this.f19345n, (ArrayList) this.f19346r, (Runnable) this.f19347s);
                return;
        }
    }

    public qc(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f19341a = 2;
        this.f19342b = notificationsSettingsActivity;
        this.f19343c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.e = arrayList4;
        this.f19344f = arrayList5;
        this.h = arrayList6;
        this.f19345n = arrayList7;
        this.f19346r = arrayList8;
        this.f19347s = runnable;
    }
}
