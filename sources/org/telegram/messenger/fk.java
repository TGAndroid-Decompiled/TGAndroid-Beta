package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class fk implements Runnable {
    public final int f22405a;
    public final ls f22406b;
    public final Cloneable f22407c;
    public final Cloneable d;
    public final Cloneable f22408e;
    public final Cloneable f22409f;
    public final Cloneable h;
    public final Cloneable f22410n;
    public final Cloneable f22411r;
    public final Object f22412s;
    public final Cloneable f22413w;

    public fk(qp qpVar, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i7) {
        this.f22405a = i7;
        this.f22406b = qpVar;
        this.f22407c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.f22408e = sparseIntArray;
        this.f22409f = hVar;
        this.h = hVar2;
        this.f22410n = hVar3;
        this.f22411r = hVar4;
        this.f22412s = hVar5;
        this.f22413w = longSparseIntArray3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.fk.run():void");
    }

    public fk(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f22405a = 2;
        this.f22406b = notificationsSettingsActivity;
        this.f22407c = arrayList;
        this.d = arrayList2;
        this.f22413w = arrayList3;
        this.f22408e = arrayList4;
        this.f22409f = arrayList5;
        this.h = arrayList6;
        this.f22410n = arrayList7;
        this.f22411r = arrayList8;
        this.f22412s = runnable;
    }
}
