package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ag implements Runnable {
    public final int f14717a = 0;
    public final int f14718b;
    public final MessagesStorage f14719c;
    public final long d;
    public final long e;
    public final int f14720f;
    public final Object h;

    public ag(int i10, int i11, long j3, long j10, MessagesStorage messagesStorage, TLRPC.InputChannel inputChannel) {
        this.f14719c = messagesStorage;
        this.d = j3;
        this.f14718b = i10;
        this.h = inputChannel;
        this.f14720f = i11;
        this.e = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ag.run():void");
    }

    public ag(org.telegram.ui.Cells.h6 h6Var, int i10, MessagesStorage messagesStorage, long j3, long j10, int i11) {
        this.h = h6Var;
        this.f14718b = i10;
        this.f14719c = messagesStorage;
        this.d = j3;
        this.e = j10;
        this.f14720f = i11;
    }
}
