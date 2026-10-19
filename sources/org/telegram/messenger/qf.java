package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qf implements Runnable {
    public final int f19364a = 0;
    public final int f19365b;
    public final MessagesStorage f19366c;
    public final long d;
    public final long e;
    public final int f19367f;
    public final Object h;

    public qf(int i10, int i11, long j10, long j11, MessagesStorage messagesStorage, TLRPC.InputChannel inputChannel) {
        this.f19366c = messagesStorage;
        this.d = j10;
        this.f19365b = i10;
        this.h = inputChannel;
        this.f19367f = i11;
        this.e = j11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qf.run():void");
    }

    public qf(org.telegram.ui.Cells.f6 f6Var, int i10, MessagesStorage messagesStorage, long j10, long j11, int i11) {
        this.h = f6Var;
        this.f19365b = i10;
        this.f19366c = messagesStorage;
        this.d = j10;
        this.e = j11;
        this.f19367f = i11;
    }
}
