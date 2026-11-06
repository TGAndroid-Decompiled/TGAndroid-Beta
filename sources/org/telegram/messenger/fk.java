package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class fk implements Runnable {
    public final int f22398a;
    public final ls f22399b;
    public final Cloneable f22400c;
    public final Cloneable d;
    public final Cloneable f22401e;
    public final Cloneable f22402f;
    public final Cloneable h;
    public final Cloneable f22403n;
    public final Cloneable f22404r;
    public final Object f22405s;
    public final Cloneable f22406w;

    public fk(qp qpVar, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i7) {
        this.f22398a = i7;
        this.f22399b = qpVar;
        this.f22400c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.f22401e = sparseIntArray;
        this.f22402f = hVar;
        this.h = hVar2;
        this.f22403n = hVar3;
        this.f22404r = hVar4;
        this.f22405s = hVar5;
        this.f22406w = longSparseIntArray3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.fk.run():void");
    }

    public fk(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f22398a = 2;
        this.f22399b = notificationsSettingsActivity;
        this.f22400c = arrayList;
        this.d = arrayList2;
        this.f22406w = arrayList3;
        this.f22401e = arrayList4;
        this.f22402f = arrayList5;
        this.h = arrayList6;
        this.f22403n = arrayList7;
        this.f22404r = arrayList8;
        this.f22405s = runnable;
    }
}
