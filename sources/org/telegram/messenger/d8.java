package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class d8 implements Runnable {
    public final int f23497a = 0;
    public final int f23498b;
    public final long f23499c;
    public final int d;
    public final int f23500e;
    public final Object f23501f;
    public final Serializable h;

    public d8(f8 f8Var, long j3, int i7, int i10, String str, int i11) {
        this.f23501f = f8Var;
        this.f23499c = j3;
        this.f23498b = i7;
        this.d = i10;
        this.h = str;
        this.f23500e = i11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.d8.run():void");
    }

    public d8(tr trVar, int i7, long j3, int i10, ArrayList arrayList, int i11) {
        this.f23501f = trVar;
        this.f23498b = i7;
        this.f23499c = j3;
        this.d = i10;
        this.h = arrayList;
        this.f23500e = i11;
    }
}
