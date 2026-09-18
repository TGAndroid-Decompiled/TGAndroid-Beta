package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sf implements Runnable {
    public final int f17499a = 0;
    public final int f17500b;
    public final MessagesStorage f17501c;
    public final long d;
    public final long e;
    public final int f17502f;
    public final Object h;

    public sf(int i10, int i11, long j3, long j10, MessagesStorage messagesStorage, TLRPC.InputChannel inputChannel) {
        this.f17501c = messagesStorage;
        this.d = j3;
        this.f17500b = i10;
        this.h = inputChannel;
        this.f17502f = i11;
        this.e = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.sf.run():void");
    }

    public sf(org.telegram.ui.Cells.g6 g6Var, int i10, MessagesStorage messagesStorage, long j3, long j10, int i11) {
        this.h = g6Var;
        this.f17500b = i10;
        this.f17501c = messagesStorage;
        this.d = j3;
        this.e = j10;
        this.f17502f = i11;
    }
}
