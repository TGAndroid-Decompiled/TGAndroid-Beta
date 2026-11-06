package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class t8 implements Runnable {
    public final int f25583a;
    public final long f25584b;
    public final long f25585c;
    public final Object d;
    public final Object f25586e;

    public t8(Object obj, long j3, long j10, Object obj2, int i7) {
        this.f25583a = i7;
        this.d = obj;
        this.f25584b = j3;
        this.f25585c = j10;
        this.f25586e = obj2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.t8.run():void");
    }

    public t8(c1 c1Var, long j3, TLObject tLObject, long j10, int i7) {
        this.f25583a = i7;
        this.d = c1Var;
        this.f25584b = j3;
        this.f25586e = tLObject;
        this.f25585c = j10;
    }

    public t8(y8 y8Var, Float f10, long j3, long j10) {
        this.f25583a = 0;
        this.d = y8Var;
        this.f25586e = f10;
        this.f25584b = j3;
        this.f25585c = j10;
    }
}
