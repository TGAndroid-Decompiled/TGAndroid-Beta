package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class d8 implements Runnable {
    public final int f21972a = 0;
    public final int f21973b;
    public final long f21974c;
    public final int d;
    public final int f21975e;
    public final Object f21976f;
    public final Serializable h;

    public d8(f8 f8Var, long j3, int i7, int i10, String str, int i11) {
        this.f21976f = f8Var;
        this.f21974c = j3;
        this.f21973b = i7;
        this.d = i10;
        this.h = str;
        this.f21975e = i11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.d8.run():void");
    }

    public d8(yr yrVar, int i7, long j3, int i10, ArrayList arrayList, int i11) {
        this.f21976f = yrVar;
        this.f21973b = i7;
        this.f21974c = j3;
        this.d = i10;
        this.h = arrayList;
        this.f21975e = i11;
    }
}
