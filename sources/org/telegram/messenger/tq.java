package org.telegram.messenger;

import java.util.List;
public final class tq implements Runnable {
    public final int f27046a;
    public final c1 f27047b;
    public final long f27048c;
    public final boolean d;
    public final int f27049e;
    public final Object f27050f;

    public tq(c1 c1Var, long j3, List list, boolean z10, int i7, int i10) {
        this.f27046a = i10;
        this.f27047b = c1Var;
        this.f27048c = j3;
        this.f27050f = list;
        this.d = z10;
        this.f27049e = i7;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.tq.run():void");
    }

    public tq(tr trVar, boolean z10, String str, long j3, int i7, String str2) {
        this.f27046a = 0;
        this.f27047b = trVar;
        this.d = z10;
        this.f27050f = str;
        this.f27048c = j3;
        this.f27049e = i7;
    }
}
