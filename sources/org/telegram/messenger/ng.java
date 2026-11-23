package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class ng implements Runnable {
    public final int f26012a = 0;
    public final ArrayList f26013b;
    public final long f26014c;
    public final int d;
    public final int f26015e;
    public final boolean f26016f;
    public final c1 h;
    public final Object f26017n;

    public ng(ri riVar, boolean z10, ArrayList arrayList, int i7, long j3, int i10, Runnable runnable) {
        this.h = riVar;
        this.f26016f = z10;
        this.f26013b = arrayList;
        this.d = i7;
        this.f26014c = j3;
        this.f26015e = i10;
        this.f26017n = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ng.run():void");
    }

    public ng(xs xsVar, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i7, int i10, boolean z10) {
        this.h = xsVar;
        this.f26017n = longSparseIntArray;
        this.f26013b = arrayList;
        this.f26014c = j3;
        this.d = i7;
        this.f26015e = i10;
        this.f26016f = z10;
    }
}
