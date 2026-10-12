package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class uf implements Runnable {
    public final int f19108a = 0;
    public final int f19109b;
    public final MessagesStorage f19110c;
    public final long d;
    public final long f19111e;
    public final int f19112f;
    public final Object h;

    public uf(int i10, int i11, long j3, long j10, MessagesStorage messagesStorage, TLRPC.InputChannel inputChannel) {
        this.f19110c = messagesStorage;
        this.d = j3;
        this.f19109b = i10;
        this.h = inputChannel;
        this.f19112f = i11;
        this.f19111e = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.uf.run():void");
    }

    public uf(org.telegram.ui.Cells.g6 g6Var, int i10, MessagesStorage messagesStorage, long j3, long j10, int i11) {
        this.h = g6Var;
        this.f19109b = i10;
        this.f19110c = messagesStorage;
        this.d = j3;
        this.f19111e = j10;
        this.f19112f = i11;
    }
}
