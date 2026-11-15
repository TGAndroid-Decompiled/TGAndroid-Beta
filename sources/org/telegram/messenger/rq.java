package org.telegram.messenger;

import java.util.List;
public final class rq implements Runnable {
    public final int f26333a;
    public final c1 f26334b;
    public final long f26335c;
    public final boolean d;
    public final int f26336e;
    public final Object f26337f;

    public rq(c1 c1Var, long j3, List list, boolean z10, int i7, int i10) {
        this.f26333a = i10;
        this.f26334b = c1Var;
        this.f26335c = j3;
        this.f26337f = list;
        this.d = z10;
        this.f26336e = i7;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.rq.run():void");
    }

    public rq(vr vrVar, boolean z10, String str, long j3, int i7, String str2) {
        this.f26333a = 0;
        this.f26334b = vrVar;
        this.d = z10;
        this.f26337f = str;
        this.f26335c = j3;
        this.f26336e = i7;
    }
}
