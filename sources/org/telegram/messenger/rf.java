package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rf implements Runnable {
    public final int f17455a = 0;
    public final int f17456b;
    public final MessagesStorage f17457c;
    public final long d;
    public final long e;
    public final int f17458f;
    public final Object h;

    public rf(int i10, int i11, long j3, long j10, MessagesStorage messagesStorage, TLRPC.InputChannel inputChannel) {
        this.f17457c = messagesStorage;
        this.d = j3;
        this.f17456b = i10;
        this.h = inputChannel;
        this.f17458f = i11;
        this.e = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.rf.run():void");
    }

    public rf(org.telegram.ui.Cells.g6 g6Var, int i10, MessagesStorage messagesStorage, long j3, long j10, int i11) {
        this.h = g6Var;
        this.f17456b = i10;
        this.f17457c = messagesStorage;
        this.d = j3;
        this.e = j10;
        this.f17458f = i11;
    }
}
