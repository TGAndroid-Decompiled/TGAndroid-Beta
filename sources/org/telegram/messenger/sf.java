package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sf implements Runnable {
    public final int f17533a = 0;
    public final int f17534b;
    public final MessagesStorage f17535c;
    public final long d;
    public final long e;
    public final int f17536f;
    public final Object h;

    public sf(int i10, int i11, long j3, long j10, MessagesStorage messagesStorage, TLRPC.InputChannel inputChannel) {
        this.f17535c = messagesStorage;
        this.d = j3;
        this.f17534b = i10;
        this.h = inputChannel;
        this.f17536f = i11;
        this.e = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.sf.run():void");
    }

    public sf(org.telegram.ui.Cells.h6 h6Var, int i10, MessagesStorage messagesStorage, long j3, long j10, int i11) {
        this.h = h6Var;
        this.f17534b = i10;
        this.f17535c = messagesStorage;
        this.d = j3;
        this.e = j10;
        this.f17536f = i11;
    }
}
