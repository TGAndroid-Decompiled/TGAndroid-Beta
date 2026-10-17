package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class pf implements Runnable {
    public final int f19281a = 0;
    public final int f19282b;
    public final MessagesStorage f19283c;
    public final long d;
    public final long e;
    public final int f19284f;
    public final Object h;

    public pf(int i10, int i11, long j10, long j11, MessagesStorage messagesStorage, TLRPC.InputChannel inputChannel) {
        this.f19283c = messagesStorage;
        this.d = j10;
        this.f19282b = i10;
        this.h = inputChannel;
        this.f19284f = i11;
        this.e = j11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.pf.run():void");
    }

    public pf(org.telegram.ui.Cells.f6 f6Var, int i10, MessagesStorage messagesStorage, long j10, long j11, int i11) {
        this.h = f6Var;
        this.f19282b = i10;
        this.f19283c = messagesStorage;
        this.d = j10;
        this.e = j11;
        this.f19284f = i11;
    }
}
