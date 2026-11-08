package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class ek implements Runnable {
    public final int f22245a;
    public final ls f22246b;
    public final Cloneable f22247c;
    public final Cloneable d;
    public final Cloneable f22248e;
    public final Cloneable f22249f;
    public final Cloneable h;
    public final Cloneable f22250n;
    public final Cloneable f22251r;
    public final Object f22252s;
    public final Cloneable f22253w;

    public ek(qp qpVar, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i7) {
        this.f22245a = i7;
        this.f22246b = qpVar;
        this.f22247c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.f22248e = sparseIntArray;
        this.f22249f = hVar;
        this.h = hVar2;
        this.f22250n = hVar3;
        this.f22251r = hVar4;
        this.f22252s = hVar5;
        this.f22253w = longSparseIntArray3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ek.run():void");
    }

    public ek(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f22245a = 2;
        this.f22246b = notificationsSettingsActivity;
        this.f22247c = arrayList;
        this.d = arrayList2;
        this.f22253w = arrayList3;
        this.f22248e = arrayList4;
        this.f22249f = arrayList5;
        this.h = arrayList6;
        this.f22250n = arrayList7;
        this.f22251r = arrayList8;
        this.f22252s = runnable;
    }
}
