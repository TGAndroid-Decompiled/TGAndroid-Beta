package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class s8 implements Runnable {
    public final int f26859a;
    public final long f26860b;
    public final long f26861c;
    public final Object d;
    public final Object f26862e;

    public s8(Object obj, long j3, long j10, Object obj2, int i7) {
        this.f26859a = i7;
        this.d = obj;
        this.f26860b = j3;
        this.f26861c = j10;
        this.f26862e = obj2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.s8.run():void");
    }

    public s8(c1 c1Var, long j3, TLObject tLObject, long j10, int i7) {
        this.f26859a = i7;
        this.d = c1Var;
        this.f26860b = j3;
        this.f26862e = tLObject;
        this.f26861c = j10;
    }

    public s8(x8 x8Var, Float f10, long j3, long j10) {
        this.f26859a = 0;
        this.d = x8Var;
        this.f26862e = f10;
        this.f26860b = j3;
        this.f26861c = j10;
    }
}
