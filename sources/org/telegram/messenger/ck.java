package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class ck implements Runnable {
    public final int f22891a;
    public final is f22892b;
    public final Cloneable f22893c;
    public final Cloneable d;
    public final Cloneable f22894e;
    public final Cloneable f22895f;
    public final Cloneable h;
    public final Cloneable f22896n;
    public final Cloneable f22897r;
    public final Object f22898s;
    public final Cloneable f22899w;

    public ck(np npVar, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i7) {
        this.f22891a = i7;
        this.f22892b = npVar;
        this.f22893c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.f22894e = sparseIntArray;
        this.f22895f = hVar;
        this.h = hVar2;
        this.f22896n = hVar3;
        this.f22897r = hVar4;
        this.f22898s = hVar5;
        this.f22899w = longSparseIntArray3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ck.run():void");
    }

    public ck(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f22891a = 2;
        this.f22892b = notificationsSettingsActivity;
        this.f22893c = arrayList;
        this.d = arrayList2;
        this.f22899w = arrayList3;
        this.f22894e = arrayList4;
        this.f22895f = arrayList5;
        this.h = arrayList6;
        this.f22896n = arrayList7;
        this.f22897r = arrayList8;
        this.f22898s = runnable;
    }
}
