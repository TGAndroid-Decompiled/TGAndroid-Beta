package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class vj implements Runnable {
    public final int f25945a;
    public final cs f25946b;
    public final Cloneable f25947c;
    public final Cloneable d;
    public final Cloneable f25948e;
    public final Cloneable f25949f;
    public final Cloneable h;
    public final Cloneable f25950n;
    public final Cloneable f25951r;
    public final Object f25952s;
    public final Cloneable f25953w;

    public vj(hp hpVar, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i3) {
        this.f25945a = i3;
        this.f25946b = hpVar;
        this.f25947c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.f25948e = sparseIntArray;
        this.f25949f = hVar;
        this.h = hVar2;
        this.f25950n = hVar3;
        this.f25951r = hVar4;
        this.f25952s = hVar5;
        this.f25953w = longSparseIntArray3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vj.run():void");
    }

    public vj(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f25945a = 2;
        this.f25946b = notificationsSettingsActivity;
        this.f25947c = arrayList;
        this.d = arrayList2;
        this.f25953w = arrayList3;
        this.f25948e = arrayList4;
        this.f25949f = arrayList5;
        this.h = arrayList6;
        this.f25950n = arrayList7;
        this.f25951r = arrayList8;
        this.f25952s = runnable;
    }
}
