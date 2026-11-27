package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class tp6 implements Runnable {
    public final byte a = 1;
    public final ArrayList b;
    public final long c;
    public final int d;
    public final int e;
    public final boolean f;
    public final rf0 h;
    public final Object n;

    public tp6(ls6 ls6Var, boolean z, ArrayList arrayList, int i, long j, int i2, Runnable runnable) {
        this.h = ls6Var;
        this.f = z;
        this.b = arrayList;
        this.d = i;
        this.c = j;
        this.e = i2;
        this.n = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tp6.run():void");
    }

    public tp6(ip7 ip7Var, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j, int i, int i2, boolean z) {
        this.h = ip7Var;
        this.n = longSparseIntArray;
        this.b = arrayList;
        this.c = j;
        this.d = i;
        this.e = i2;
        this.f = z;
    }
}
