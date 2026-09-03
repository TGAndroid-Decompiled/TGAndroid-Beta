package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vf implements Runnable {
    public final int f18652a = 0;
    public final int f18653b;
    public final MessagesStorage f18654c;
    public final long d;
    public final long e;
    public final int f18655f;
    public final Object h;

    public vf(int i10, int i11, long j10, long j11, MessagesStorage messagesStorage, TLRPC.InputChannel inputChannel) {
        this.f18654c = messagesStorage;
        this.d = j10;
        this.f18653b = i10;
        this.h = inputChannel;
        this.f18655f = i11;
        this.e = j11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vf.run():void");
    }

    public vf(org.telegram.ui.Cells.e6 e6Var, int i10, MessagesStorage messagesStorage, long j10, long j11, int i11) {
        this.h = e6Var;
        this.f18653b = i10;
        this.f18654c = messagesStorage;
        this.d = j10;
        this.e = j11;
        this.f18655f = i11;
    }
}
