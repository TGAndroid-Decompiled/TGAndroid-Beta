package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class ck implements Runnable {
    public final int f22895a;
    public final is f22896b;
    public final Cloneable f22897c;
    public final Cloneable d;
    public final Cloneable f22898e;
    public final Cloneable f22899f;
    public final Cloneable h;
    public final Cloneable f22900n;
    public final Cloneable f22901r;
    public final Object f22902s;
    public final Cloneable f22903w;

    public ck(np npVar, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i7) {
        this.f22895a = i7;
        this.f22896b = npVar;
        this.f22897c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.f22898e = sparseIntArray;
        this.f22899f = hVar;
        this.h = hVar2;
        this.f22900n = hVar3;
        this.f22901r = hVar4;
        this.f22902s = hVar5;
        this.f22903w = longSparseIntArray3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ck.run():void");
    }

    public ck(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f22895a = 2;
        this.f22896b = notificationsSettingsActivity;
        this.f22897c = arrayList;
        this.d = arrayList2;
        this.f22903w = arrayList3;
        this.f22898e = arrayList4;
        this.f22899f = arrayList5;
        this.h = arrayList6;
        this.f22900n = arrayList7;
        this.f22901r = arrayList8;
        this.f22902s = runnable;
    }
}
