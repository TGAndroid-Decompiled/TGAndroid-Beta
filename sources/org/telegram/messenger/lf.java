package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class lf implements Runnable {
    public final int f20591a = 0;
    public final int f20592b;
    public final MessagesStorage f20593c;
    public final long d;
    public final long e;
    public final int f20594f;
    public final Object h;

    public lf(int i10, int i11, long j10, long j11, MessagesStorage messagesStorage, TLRPC.InputChannel inputChannel) {
        this.f20593c = messagesStorage;
        this.d = j10;
        this.f20592b = i10;
        this.h = inputChannel;
        this.f20594f = i11;
        this.e = j11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.lf.run():void");
    }

    public lf(org.telegram.ui.Cells.k6 k6Var, int i10, MessagesStorage messagesStorage, long j10, long j11, int i11) {
        this.h = k6Var;
        this.f20592b = i10;
        this.f20593c = messagesStorage;
        this.d = j10;
        this.e = j11;
        this.f20594f = i11;
    }
}
