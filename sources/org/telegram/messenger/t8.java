package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class t8 implements Runnable {
    public final int f25488a;
    public final long f25489b;
    public final long f25490c;
    public final Object d;
    public final Object f25491e;

    public t8(Object obj, long j10, long j11, Object obj2, int i3) {
        this.f25488a = i3;
        this.d = obj;
        this.f25489b = j10;
        this.f25490c = j11;
        this.f25491e = obj2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.t8.run():void");
    }

    public t8(c1 c1Var, long j10, TLObject tLObject, long j11, int i3) {
        this.f25488a = i3;
        this.d = c1Var;
        this.f25489b = j10;
        this.f25491e = tLObject;
        this.f25490c = j11;
    }

    public t8(y8 y8Var, Float f10, long j10, long j11) {
        this.f25488a = 0;
        this.d = y8Var;
        this.f25491e = f10;
        this.f25489b = j10;
        this.f25490c = j11;
    }
}
