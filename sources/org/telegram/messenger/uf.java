package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class uf implements Runnable {
    public final int f18594a = 0;
    public final int f18595b;
    public final MessagesStorage f18596c;
    public final long d;
    public final long e;
    public final int f18597f;
    public final Object h;

    public uf(int i10, int i11, long j10, long j11, MessagesStorage messagesStorage, TLRPC.InputChannel inputChannel) {
        this.f18596c = messagesStorage;
        this.d = j10;
        this.f18595b = i10;
        this.h = inputChannel;
        this.f18597f = i11;
        this.e = j11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.uf.run():void");
    }

    public uf(org.telegram.ui.Cells.g6 g6Var, int i10, MessagesStorage messagesStorage, long j10, long j11, int i11) {
        this.h = g6Var;
        this.f18595b = i10;
        this.f18596c = messagesStorage;
        this.d = j10;
        this.e = j11;
        this.f18597f = i11;
    }
}
