package org.telegram.messenger;

import java.util.List;
public final class tq implements Runnable {
    public final int f27072a;
    public final c1 f27073b;
    public final long f27074c;
    public final boolean d;
    public final int f27075e;
    public final Object f27076f;

    public tq(c1 c1Var, long j3, List list, boolean z10, int i7, int i10) {
        this.f27072a = i10;
        this.f27073b = c1Var;
        this.f27074c = j3;
        this.f27076f = list;
        this.d = z10;
        this.f27075e = i7;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.tq.run():void");
    }

    public tq(tr trVar, boolean z10, String str, long j3, int i7, String str2) {
        this.f27072a = 0;
        this.f27073b = trVar;
        this.d = z10;
        this.f27076f = str;
        this.f27074c = j3;
        this.f27075e = i7;
    }
}
