package org.telegram.messenger;

import java.util.List;
public final class tq implements Runnable {
    public final int f27044a;
    public final c1 f27045b;
    public final long f27046c;
    public final boolean d;
    public final int f27047e;
    public final Object f27048f;

    public tq(c1 c1Var, long j3, List list, boolean z10, int i7, int i10) {
        this.f27044a = i10;
        this.f27045b = c1Var;
        this.f27046c = j3;
        this.f27048f = list;
        this.d = z10;
        this.f27047e = i7;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.tq.run():void");
    }

    public tq(tr trVar, boolean z10, String str, long j3, int i7, String str2) {
        this.f27044a = 0;
        this.f27045b = trVar;
        this.d = z10;
        this.f27048f = str;
        this.f27046c = j3;
        this.f27047e = i7;
    }
}
