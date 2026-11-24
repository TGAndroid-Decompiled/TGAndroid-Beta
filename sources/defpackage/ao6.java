package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class ao6 implements Runnable {
    public final byte a = 0;
    public final ArrayList b;
    public final long c;
    public final int d;
    public final int e;
    public final boolean f;
    public final pf0 h;
    public final Object n;

    public ao6(hq6 hq6Var, boolean z, ArrayList arrayList, int i, long j, int i2, Runnable runnable) {
        this.h = hq6Var;
        this.f = z;
        this.b = arrayList;
        this.d = i;
        this.c = j;
        this.e = i2;
        this.n = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao6.run():void");
    }

    public ao6(im7 im7Var, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j, int i, int i2, boolean z) {
        this.h = im7Var;
        this.n = longSparseIntArray;
        this.b = arrayList;
        this.c = j;
        this.d = i;
        this.e = i2;
        this.f = z;
    }
}
