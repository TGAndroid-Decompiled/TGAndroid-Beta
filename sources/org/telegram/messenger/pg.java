package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class pg implements Runnable {
    public final int f17597a = 1;
    public final ArrayList f17598b;
    public final long f17599c;
    public final int d;
    public final int e;
    public final boolean f17600f;
    public final f1 h;
    public final Object f17601n;

    public pg(vi viVar, boolean z10, ArrayList arrayList, int i10, long j10, int i11, Runnable runnable) {
        this.h = viVar;
        this.f17600f = z10;
        this.f17598b = arrayList;
        this.d = i10;
        this.f17599c = j10;
        this.e = i11;
        this.f17601n = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.pg.run():void");
    }

    public pg(pt ptVar, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j10, int i10, int i11, boolean z10) {
        this.h = ptVar;
        this.f17601n = longSparseIntArray;
        this.f17598b = arrayList;
        this.f17599c = j10;
        this.d = i10;
        this.e = i11;
        this.f17600f = z10;
    }
}
