package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class ok implements Runnable {
    public final int f17471a;
    public final vs f17472b;
    public final Cloneable f17473c;
    public final Cloneable d;
    public final Cloneable e;
    public final Cloneable f17474f;
    public final Cloneable h;
    public final Cloneable f17475n;
    public final Cloneable f17476r;
    public final Object f17477s;
    public final Cloneable f17478w;

    public ok(wp wpVar, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f17471a = i10;
        this.f17472b = wpVar;
        this.f17473c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f17474f = hVar;
        this.h = hVar2;
        this.f17475n = hVar3;
        this.f17476r = hVar4;
        this.f17477s = hVar5;
        this.f17478w = longSparseIntArray3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ok.run():void");
    }

    public ok(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f17471a = 2;
        this.f17472b = notificationsSettingsActivity;
        this.f17473c = arrayList;
        this.d = arrayList2;
        this.f17478w = arrayList3;
        this.e = arrayList4;
        this.f17474f = arrayList5;
        this.h = arrayList6;
        this.f17475n = arrayList7;
        this.f17476r = arrayList8;
        this.f17477s = runnable;
    }
}
