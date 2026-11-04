package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class xp implements Runnable {
    public final int f26420a = 0;
    public final qr f26421b;
    public final long f26422c;
    public final long d;
    public final int f26423e;
    public final int f26424f;
    public final Object h;

    public xp(int i3, int i10, long j10, long j11, qr qrVar, TLRPC.InputChannel inputChannel) {
        this.f26421b = qrVar;
        this.f26422c = j10;
        this.f26423e = i3;
        this.h = inputChannel;
        this.f26424f = i10;
        this.d = j11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xp.run():void");
    }

    public xp(qr qrVar, long j10, long j11, Integer num, int i3, int i10) {
        this.f26421b = qrVar;
        this.f26422c = j10;
        this.d = j11;
        this.h = num;
        this.f26423e = i3;
        this.f26424f = i10;
    }

    public xp(org.telegram.ui.Cells.d6 d6Var, int i3, qr qrVar, long j10, long j11, int i10) {
        this.h = d6Var;
        this.f26423e = i3;
        this.f26421b = qrVar;
        this.f26422c = j10;
        this.d = j11;
        this.f26424f = i10;
    }
}
