package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class bk implements Runnable {
    public final int f23088a;
    public final fs f23089b;
    public final Cloneable f23090c;
    public final Cloneable d;
    public final Cloneable f23091e;
    public final Cloneable f23092f;
    public final Cloneable h;
    public final Cloneable f23093n;
    public final Cloneable f23094r;
    public final Object f23095s;
    public final Cloneable f23096w;

    public bk(mp mpVar, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i7) {
        this.f23088a = i7;
        this.f23089b = mpVar;
        this.f23090c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.f23091e = sparseIntArray;
        this.f23092f = hVar;
        this.h = hVar2;
        this.f23093n = hVar3;
        this.f23094r = hVar4;
        this.f23095s = hVar5;
        this.f23096w = longSparseIntArray3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.bk.run():void");
    }

    public bk(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f23088a = 2;
        this.f23089b = notificationsSettingsActivity;
        this.f23090c = arrayList;
        this.d = arrayList2;
        this.f23096w = arrayList3;
        this.f23091e = arrayList4;
        this.f23092f = arrayList5;
        this.h = arrayList6;
        this.f23093n = arrayList7;
        this.f23094r = arrayList8;
        this.f23095s = runnable;
    }
}
