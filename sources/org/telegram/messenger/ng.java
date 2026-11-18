package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class ng implements Runnable {
    public final int f25916a = 0;
    public final ArrayList f25917b;
    public final long f25918c;
    public final int d;
    public final int f25919e;
    public final boolean f25920f;
    public final c1 h;
    public final Object f25921n;

    public ng(ri riVar, boolean z10, ArrayList arrayList, int i7, long j3, int i10, Runnable runnable) {
        this.h = riVar;
        this.f25920f = z10;
        this.f25917b = arrayList;
        this.d = i7;
        this.f25918c = j3;
        this.f25919e = i10;
        this.f25921n = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ng.run():void");
    }

    public ng(xs xsVar, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i7, int i10, boolean z10) {
        this.h = xsVar;
        this.f25921n = longSparseIntArray;
        this.f25917b = arrayList;
        this.f25918c = j3;
        this.d = i7;
        this.f25919e = i10;
        this.f25920f = z10;
    }
}
