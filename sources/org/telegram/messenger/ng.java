package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class ng implements Runnable {
    public final int f25918a = 0;
    public final ArrayList f25919b;
    public final long f25920c;
    public final int d;
    public final int f25921e;
    public final boolean f25922f;
    public final c1 h;
    public final Object f25923n;

    public ng(ri riVar, boolean z10, ArrayList arrayList, int i7, long j3, int i10, Runnable runnable) {
        this.h = riVar;
        this.f25922f = z10;
        this.f25919b = arrayList;
        this.d = i7;
        this.f25920c = j3;
        this.f25921e = i10;
        this.f25923n = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ng.run():void");
    }

    public ng(xs xsVar, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i7, int i10, boolean z10) {
        this.h = xsVar;
        this.f25923n = longSparseIntArray;
        this.f25919b = arrayList;
        this.f25920c = j3;
        this.d = i7;
        this.f25921e = i10;
        this.f25922f = z10;
    }
}
