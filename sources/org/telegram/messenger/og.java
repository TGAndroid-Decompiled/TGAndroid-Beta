package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class og implements Runnable {
    public final int f25755a = 1;
    public final ArrayList f25756b;
    public final long f25757c;
    public final int d;
    public final int f25758e;
    public final boolean f25759f;
    public final c1 h;
    public final Object f25760n;

    public og(si siVar, boolean z10, ArrayList arrayList, int i7, long j3, int i10, Runnable runnable) {
        this.h = siVar;
        this.f25759f = z10;
        this.f25756b = arrayList;
        this.d = i7;
        this.f25757c = j3;
        this.f25758e = i10;
        this.f25760n = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.og.run():void");
    }

    public og(at atVar, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i7, int i10, boolean z10) {
        this.h = atVar;
        this.f25760n = longSparseIntArray;
        this.f25756b = arrayList;
        this.f25757c = j3;
        this.d = i7;
        this.f25758e = i10;
        this.f25759f = z10;
    }
}
