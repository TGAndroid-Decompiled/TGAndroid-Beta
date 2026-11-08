package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class d8 implements Runnable {
    public final int f22002a = 0;
    public final int f22003b;
    public final long f22004c;
    public final int d;
    public final int f22005e;
    public final Object f22006f;
    public final Serializable h;

    public d8(f8 f8Var, long j3, int i7, int i10, String str, int i11) {
        this.f22006f = f8Var;
        this.f22004c = j3;
        this.f22003b = i7;
        this.d = i10;
        this.h = str;
        this.f22005e = i11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.d8.run():void");
    }

    public d8(yr yrVar, int i7, long j3, int i10, ArrayList arrayList, int i11) {
        this.f22006f = yrVar;
        this.f22003b = i7;
        this.f22004c = j3;
        this.d = i10;
        this.h = arrayList;
        this.f22005e = i11;
    }
}
