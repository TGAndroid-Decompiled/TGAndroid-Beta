package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class bk implements Runnable {
    public final int f23113a;
    public final fs f23114b;
    public final Cloneable f23115c;
    public final Cloneable d;
    public final Cloneable f23116e;
    public final Cloneable f23117f;
    public final Cloneable h;
    public final Cloneable f23118n;
    public final Cloneable f23119r;
    public final Object f23120s;
    public final Cloneable f23121w;

    public bk(mp mpVar, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i7) {
        this.f23113a = i7;
        this.f23114b = mpVar;
        this.f23115c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.f23116e = sparseIntArray;
        this.f23117f = hVar;
        this.h = hVar2;
        this.f23118n = hVar3;
        this.f23119r = hVar4;
        this.f23120s = hVar5;
        this.f23121w = longSparseIntArray3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.bk.run():void");
    }

    public bk(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f23113a = 2;
        this.f23114b = notificationsSettingsActivity;
        this.f23115c = arrayList;
        this.d = arrayList2;
        this.f23121w = arrayList3;
        this.f23116e = arrayList4;
        this.f23117f = arrayList5;
        this.h = arrayList6;
        this.f23118n = arrayList7;
        this.f23119r = arrayList8;
        this.f23120s = runnable;
    }
}
