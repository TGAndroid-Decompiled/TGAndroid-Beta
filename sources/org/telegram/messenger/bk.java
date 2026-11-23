package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class bk implements Runnable {
    public final int f23210a;
    public final fs f23211b;
    public final Cloneable f23212c;
    public final Cloneable d;
    public final Cloneable f23213e;
    public final Cloneable f23214f;
    public final Cloneable h;
    public final Cloneable f23215n;
    public final Cloneable f23216r;
    public final Object f23217s;
    public final Cloneable f23218w;

    public bk(mp mpVar, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i7) {
        this.f23210a = i7;
        this.f23211b = mpVar;
        this.f23212c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.f23213e = sparseIntArray;
        this.f23214f = hVar;
        this.h = hVar2;
        this.f23215n = hVar3;
        this.f23216r = hVar4;
        this.f23217s = hVar5;
        this.f23218w = longSparseIntArray3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.bk.run():void");
    }

    public bk(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f23210a = 2;
        this.f23211b = notificationsSettingsActivity;
        this.f23212c = arrayList;
        this.d = arrayList2;
        this.f23218w = arrayList3;
        this.f23213e = arrayList4;
        this.f23214f = arrayList5;
        this.h = arrayList6;
        this.f23215n = arrayList7;
        this.f23216r = arrayList8;
        this.f23217s = runnable;
    }
}
