package org.telegram.messenger;

import java.util.List;
public final class tq implements Runnable {
    public final int f27141a;
    public final c1 f27142b;
    public final long f27143c;
    public final boolean d;
    public final int f27144e;
    public final Object f27145f;

    public tq(c1 c1Var, long j3, List list, boolean z10, int i7, int i10) {
        this.f27141a = i10;
        this.f27142b = c1Var;
        this.f27143c = j3;
        this.f27145f = list;
        this.d = z10;
        this.f27144e = i7;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.tq.run():void");
    }

    public tq(tr trVar, boolean z10, String str, long j3, int i7, String str2) {
        this.f27141a = 0;
        this.f27142b = trVar;
        this.d = z10;
        this.f27145f = str;
        this.f27143c = j3;
        this.f27144e = i7;
    }
}
