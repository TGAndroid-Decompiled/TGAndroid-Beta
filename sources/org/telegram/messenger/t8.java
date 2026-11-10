package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class t8 implements Runnable {
    public final int f25597a;
    public final long f25598b;
    public final long f25599c;
    public final Object d;
    public final Object f25600e;

    public t8(Object obj, long j3, long j10, Object obj2, int i7) {
        this.f25597a = i7;
        this.d = obj;
        this.f25598b = j3;
        this.f25599c = j10;
        this.f25600e = obj2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.t8.run():void");
    }

    public t8(c1 c1Var, long j3, TLObject tLObject, long j10, int i7) {
        this.f25597a = i7;
        this.d = c1Var;
        this.f25598b = j3;
        this.f25600e = tLObject;
        this.f25599c = j10;
    }

    public t8(y8 y8Var, Float f10, long j3, long j10) {
        this.f25597a = 0;
        this.d = y8Var;
        this.f25600e = f10;
        this.f25598b = j3;
        this.f25599c = j10;
    }
}
