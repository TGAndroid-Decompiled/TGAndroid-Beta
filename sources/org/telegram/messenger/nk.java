package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class nk implements Runnable {
    public final int f17134a;
    public final us f17135b;
    public final Cloneable f17136c;
    public final Cloneable d;
    public final Cloneable e;
    public final Cloneable f17137f;
    public final Cloneable h;
    public final Cloneable f17138n;
    public final Cloneable f17139r;
    public final Object f17140s;
    public final Cloneable f17141w;

    public nk(vp vpVar, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f17134a = i10;
        this.f17135b = vpVar;
        this.f17136c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f17137f = hVar;
        this.h = hVar2;
        this.f17138n = hVar3;
        this.f17139r = hVar4;
        this.f17140s = hVar5;
        this.f17141w = longSparseIntArray3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.nk.run():void");
    }

    public nk(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f17134a = 2;
        this.f17135b = notificationsSettingsActivity;
        this.f17136c = arrayList;
        this.d = arrayList2;
        this.f17141w = arrayList3;
        this.e = arrayList4;
        this.f17137f = arrayList5;
        this.h = arrayList6;
        this.f17138n = arrayList7;
        this.f17139r = arrayList8;
        this.f17140s = runnable;
    }
}
