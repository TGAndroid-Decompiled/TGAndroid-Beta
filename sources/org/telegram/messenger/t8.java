package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class t8 implements Runnable {
    public final int f26973a;
    public final long f26974b;
    public final long f26975c;
    public final Object d;
    public final Object f26976e;

    public t8(Object obj, long j3, long j10, Object obj2, int i7) {
        this.f26973a = i7;
        this.d = obj;
        this.f26974b = j3;
        this.f26975c = j10;
        this.f26976e = obj2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.t8.run():void");
    }

    public t8(c1 c1Var, long j3, TLObject tLObject, long j10, int i7) {
        this.f26973a = i7;
        this.d = c1Var;
        this.f26974b = j3;
        this.f26976e = tLObject;
        this.f26975c = j10;
    }

    public t8(y8 y8Var, Float f10, long j3, long j10) {
        this.f26973a = 0;
        this.d = y8Var;
        this.f26976e = f10;
        this.f26974b = j3;
        this.f26975c = j10;
    }
}
