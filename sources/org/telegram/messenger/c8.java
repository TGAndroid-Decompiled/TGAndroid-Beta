package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class c8 implements Runnable {
    public final int f23391a = 0;
    public final int f23392b;
    public final long f23393c;
    public final int d;
    public final int f23394e;
    public final Object f23395f;
    public final Serializable h;

    public c8(e8 e8Var, long j3, int i7, int i10, String str, int i11) {
        this.f23395f = e8Var;
        this.f23393c = j3;
        this.f23392b = i7;
        this.d = i10;
        this.h = str;
        this.f23394e = i11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.c8.run():void");
    }

    public c8(tr trVar, int i7, long j3, int i10, ArrayList arrayList, int i11) {
        this.f23395f = trVar;
        this.f23392b = i7;
        this.f23393c = j3;
        this.d = i10;
        this.h = arrayList;
        this.f23394e = i11;
    }
}
