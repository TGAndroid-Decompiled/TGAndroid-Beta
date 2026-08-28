package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mf implements Runnable {
    public final int f20983a = 0;
    public final int f20984b;
    public final MessagesStorage f20985c;
    public final long d;
    public final long f20986e;
    public final int f20987f;
    public final Object h;

    public mf(int i9, int i10, long j10, long j11, MessagesStorage messagesStorage, TLRPC.InputChannel inputChannel) {
        this.f20985c = messagesStorage;
        this.d = j10;
        this.f20984b = i9;
        this.h = inputChannel;
        this.f20987f = i10;
        this.f20986e = j11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.mf.run():void");
    }

    public mf(org.telegram.ui.Cells.f6 f6Var, int i9, MessagesStorage messagesStorage, long j10, long j11, int i10) {
        this.h = f6Var;
        this.f20984b = i9;
        this.f20985c = messagesStorage;
        this.d = j10;
        this.f20986e = j11;
        this.f20987f = i10;
    }
}
