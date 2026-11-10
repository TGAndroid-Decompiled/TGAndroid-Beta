package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class ek implements Runnable {
    public final int f22249a;
    public final ls f22250b;
    public final Cloneable f22251c;
    public final Cloneable d;
    public final Cloneable f22252e;
    public final Cloneable f22253f;
    public final Cloneable h;
    public final Cloneable f22254n;
    public final Cloneable f22255r;
    public final Object f22256s;
    public final Cloneable f22257w;

    public ek(qp qpVar, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i7) {
        this.f22249a = i7;
        this.f22250b = qpVar;
        this.f22251c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.f22252e = sparseIntArray;
        this.f22253f = hVar;
        this.h = hVar2;
        this.f22254n = hVar3;
        this.f22255r = hVar4;
        this.f22256s = hVar5;
        this.f22257w = longSparseIntArray3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ek.run():void");
    }

    public ek(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f22249a = 2;
        this.f22250b = notificationsSettingsActivity;
        this.f22251c = arrayList;
        this.d = arrayList2;
        this.f22257w = arrayList3;
        this.f22252e = arrayList4;
        this.f22253f = arrayList5;
        this.h = arrayList6;
        this.f22254n = arrayList7;
        this.f22255r = arrayList8;
        this.f22256s = runnable;
    }
}
