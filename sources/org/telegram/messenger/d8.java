package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class d8 implements Runnable {
    public final int f23047a = 0;
    public final int f23048b;
    public final long f23049c;
    public final int d;
    public final int f23050e;
    public final Object f23051f;
    public final Serializable h;

    public d8(f8 f8Var, long j3, int i7, int i10, String str, int i11) {
        this.f23051f = f8Var;
        this.f23049c = j3;
        this.f23048b = i7;
        this.d = i10;
        this.h = str;
        this.f23050e = i11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.d8.run():void");
    }

    public d8(vr vrVar, int i7, long j3, int i10, ArrayList arrayList, int i11) {
        this.f23051f = vrVar;
        this.f23048b = i7;
        this.f23049c = j3;
        this.d = i10;
        this.h = arrayList;
        this.f23050e = i11;
    }
}
