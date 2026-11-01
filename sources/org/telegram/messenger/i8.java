package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class i8 implements Runnable {
    public final int f16239a = 1;
    public final int f16240b;
    public final long f16241c;
    public final int d;
    public final int e;
    public final Object f16242f;
    public final Serializable h;

    public i8(k8 k8Var, long j10, int i10, int i11, String str, int i12) {
        this.f16242f = k8Var;
        this.f16241c = j10;
        this.f16240b = i10;
        this.d = i11;
        this.h = str;
        this.e = i12;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.i8.run():void");
    }

    public i8(is isVar, int i10, long j10, int i11, ArrayList arrayList, int i12) {
        this.f16242f = isVar;
        this.f16240b = i10;
        this.f16241c = j10;
        this.d = i11;
        this.h = arrayList;
        this.e = i12;
    }
}
