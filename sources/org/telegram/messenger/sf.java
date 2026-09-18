package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sf implements Runnable {
    public final int f17327a = 0;
    public final int f17328b;
    public final MessagesStorage f17329c;
    public final long d;
    public final long e;
    public final int f17330f;
    public final Object h;

    public sf(int i10, int i11, long j3, long j10, MessagesStorage messagesStorage, TLRPC.InputChannel inputChannel) {
        this.f17329c = messagesStorage;
        this.d = j3;
        this.f17328b = i10;
        this.h = inputChannel;
        this.f17330f = i11;
        this.e = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.sf.run():void");
    }

    public sf(org.telegram.ui.Cells.f6 f6Var, int i10, MessagesStorage messagesStorage, long j3, long j10, int i11) {
        this.h = f6Var;
        this.f17328b = i10;
        this.f17329c = messagesStorage;
        this.d = j3;
        this.e = j10;
        this.f17330f = i11;
    }
}
