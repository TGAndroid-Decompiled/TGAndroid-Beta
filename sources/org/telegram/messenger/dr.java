package org.telegram.messenger;

import java.util.List;
public final class dr implements Runnable {
    public final int f15299a;
    public final f1 f15300b;
    public final long f15301c;
    public final boolean d;
    public final int e;
    public final Object f15302f;

    public dr(f1 f1Var, long j10, List list, boolean z10, int i10, int i11) {
        this.f15299a = i11;
        this.f15300b = f1Var;
        this.f15301c = j10;
        this.f15302f = list;
        this.d = z10;
        this.e = i10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dr.run():void");
    }

    public dr(hs hsVar, boolean z10, String str, long j10, int i10, String str2) {
        this.f15299a = 0;
        this.f15300b = hsVar;
        this.d = z10;
        this.f15302f = str;
        this.f15301c = j10;
        this.e = i10;
    }
}
