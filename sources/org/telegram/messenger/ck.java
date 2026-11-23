package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class ck implements Runnable {
    public final int f23327a;
    public final gs f23328b;
    public final Cloneable f23329c;
    public final Cloneable d;
    public final Cloneable f23330e;
    public final Cloneable f23331f;
    public final Cloneable h;
    public final Cloneable f23332n;
    public final Cloneable f23333r;
    public final Object f23334s;
    public final Cloneable f23335w;

    public ck(np npVar, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i7) {
        this.f23327a = i7;
        this.f23328b = npVar;
        this.f23329c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.f23330e = sparseIntArray;
        this.f23331f = hVar;
        this.h = hVar2;
        this.f23332n = hVar3;
        this.f23333r = hVar4;
        this.f23334s = hVar5;
        this.f23335w = longSparseIntArray3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ck.run():void");
    }

    public ck(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f23327a = 2;
        this.f23328b = notificationsSettingsActivity;
        this.f23329c = arrayList;
        this.d = arrayList2;
        this.f23335w = arrayList3;
        this.f23330e = arrayList4;
        this.f23331f = arrayList5;
        this.h = arrayList6;
        this.f23332n = arrayList7;
        this.f23333r = arrayList8;
        this.f23334s = runnable;
    }
}
