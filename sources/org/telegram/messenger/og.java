package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class og implements Runnable {
    public final int f26079a = 0;
    public final ArrayList f26080b;
    public final long f26081c;
    public final int d;
    public final int f26082e;
    public final boolean f26083f;
    public final c1 h;
    public final Object f26084n;

    public og(si siVar, boolean z10, ArrayList arrayList, int i7, long j3, int i10, Runnable runnable) {
        this.h = siVar;
        this.f26083f = z10;
        this.f26080b = arrayList;
        this.d = i7;
        this.f26081c = j3;
        this.f26082e = i10;
        this.f26084n = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.og.run():void");
    }

    public og(ys ysVar, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i7, int i10, boolean z10) {
        this.h = ysVar;
        this.f26084n = longSparseIntArray;
        this.f26080b = arrayList;
        this.f26081c = j3;
        this.d = i7;
        this.f26082e = i10;
        this.f26083f = z10;
    }
}
