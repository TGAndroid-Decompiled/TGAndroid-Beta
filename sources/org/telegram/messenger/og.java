package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class og implements Runnable {
    public final int f26115a = 0;
    public final ArrayList f26116b;
    public final long f26117c;
    public final int d;
    public final int f26118e;
    public final boolean f26119f;
    public final c1 h;
    public final Object f26120n;

    public og(si siVar, boolean z10, ArrayList arrayList, int i7, long j3, int i10, Runnable runnable) {
        this.h = siVar;
        this.f26119f = z10;
        this.f26116b = arrayList;
        this.d = i7;
        this.f26117c = j3;
        this.f26118e = i10;
        this.f26120n = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.og.run():void");
    }

    public og(ys ysVar, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i7, int i10, boolean z10) {
        this.h = ysVar;
        this.f26120n = longSparseIntArray;
        this.f26116b = arrayList;
        this.f26117c = j3;
        this.d = i7;
        this.f26118e = i10;
        this.f26119f = z10;
    }
}
