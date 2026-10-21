package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rf implements Runnable {
    public final int f19453a = 0;
    public final int f19454b;
    public final MessagesStorage f19455c;
    public final long d;
    public final long e;
    public final int f19456f;
    public final Object h;

    public rf(int i10, int i11, long j10, long j11, MessagesStorage messagesStorage, TLRPC.InputChannel inputChannel) {
        this.f19455c = messagesStorage;
        this.d = j10;
        this.f19454b = i10;
        this.h = inputChannel;
        this.f19456f = i11;
        this.e = j11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.rf.run():void");
    }

    public rf(org.telegram.ui.Cells.f6 f6Var, int i10, MessagesStorage messagesStorage, long j10, long j11, int i11) {
        this.h = f6Var;
        this.f19454b = i10;
        this.f19455c = messagesStorage;
        this.d = j10;
        this.e = j11;
        this.f19456f = i11;
    }
}
