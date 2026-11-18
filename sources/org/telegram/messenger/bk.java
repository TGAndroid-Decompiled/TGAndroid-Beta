package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class bk implements Runnable {
    public final int f23085a;
    public final fs f23086b;
    public final Cloneable f23087c;
    public final Cloneable d;
    public final Cloneable f23088e;
    public final Cloneable f23089f;
    public final Cloneable h;
    public final Cloneable f23090n;
    public final Cloneable f23091r;
    public final Object f23092s;
    public final Cloneable f23093w;

    public bk(mp mpVar, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i7) {
        this.f23085a = i7;
        this.f23086b = mpVar;
        this.f23087c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.f23088e = sparseIntArray;
        this.f23089f = hVar;
        this.h = hVar2;
        this.f23090n = hVar3;
        this.f23091r = hVar4;
        this.f23092s = hVar5;
        this.f23093w = longSparseIntArray3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.bk.run():void");
    }

    public bk(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f23085a = 2;
        this.f23086b = notificationsSettingsActivity;
        this.f23087c = arrayList;
        this.d = arrayList2;
        this.f23093w = arrayList3;
        this.f23088e = arrayList4;
        this.f23089f = arrayList5;
        this.h = arrayList6;
        this.f23090n = arrayList7;
        this.f23091r = arrayList8;
        this.f23092s = runnable;
    }
}
