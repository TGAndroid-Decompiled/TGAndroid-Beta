package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rf implements Runnable {
    public final int f19081a = 0;
    public final int f19082b;
    public final MessagesStorage f19083c;
    public final long d;
    public final long f19084e;
    public final int f19085f;
    public final Object h;

    public rf(int i10, int i11, long j3, long j10, MessagesStorage messagesStorage, TLRPC.InputChannel inputChannel) {
        this.f19083c = messagesStorage;
        this.d = j3;
        this.f19082b = i10;
        this.h = inputChannel;
        this.f19085f = i11;
        this.f19084e = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.rf.run():void");
    }

    public rf(org.telegram.ui.Cells.g6 g6Var, int i10, MessagesStorage messagesStorage, long j3, long j10, int i11) {
        this.h = g6Var;
        this.f19082b = i10;
        this.f19083c = messagesStorage;
        this.d = j3;
        this.f19084e = j10;
        this.f19085f = i11;
    }
}
