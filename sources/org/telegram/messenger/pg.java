package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class pg implements Runnable {
    public final int f24551a = 1;
    public final ArrayList f24552b;
    public final long f24553c;
    public final int d;
    public final int f24554e;
    public final boolean f24555f;
    public final c1 h;
    public final Object f24556n;

    public pg(ui uiVar, boolean z9, ArrayList arrayList, int i7, long j3, int i10, Runnable runnable) {
        this.h = uiVar;
        this.f24555f = z9;
        this.f24552b = arrayList;
        this.d = i7;
        this.f24553c = j3;
        this.f24554e = i10;
        this.f24556n = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.pg.run():void");
    }

    public pg(dt dtVar, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i7, int i10, boolean z9) {
        this.h = dtVar;
        this.f24556n = longSparseIntArray;
        this.f24552b = arrayList;
        this.f24553c = j3;
        this.d = i7;
        this.f24554e = i10;
        this.f24555f = z9;
    }
}
