package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class hg implements Runnable {
    public final int f22922a = 0;
    public final ArrayList f22923b;
    public final long f22924c;
    public final int d;
    public final int f22925e;
    public final boolean f22926f;
    public final c1 h;
    public final Object f22927n;

    public hg(li liVar, boolean z10, ArrayList arrayList, int i3, long j10, int i10, Runnable runnable) {
        this.h = liVar;
        this.f22926f = z10;
        this.f22923b = arrayList;
        this.d = i3;
        this.f22924c = j10;
        this.f22925e = i10;
        this.f22927n = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hg.run():void");
    }

    public hg(us usVar, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j10, int i3, int i10, boolean z10) {
        this.h = usVar;
        this.f22927n = longSparseIntArray;
        this.f22923b = arrayList;
        this.f22924c = j10;
        this.d = i3;
        this.f22925e = i10;
        this.f22926f = z10;
    }
}
