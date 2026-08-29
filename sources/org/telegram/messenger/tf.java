package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class tf implements Runnable {
    public final int f21658a = 0;
    public final int f21659b;
    public final MessagesStorage f21660c;
    public final long d;
    public final long f21661e;
    public final int f21662f;
    public final Object h;

    public tf(int i10, int i11, long j10, long j11, MessagesStorage messagesStorage, TLRPC.InputChannel inputChannel) {
        this.f21660c = messagesStorage;
        this.d = j10;
        this.f21659b = i10;
        this.h = inputChannel;
        this.f21662f = i11;
        this.f21661e = j11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.tf.run():void");
    }

    public tf(org.telegram.ui.Cells.d6 d6Var, int i10, MessagesStorage messagesStorage, long j10, long j11, int i11) {
        this.h = d6Var;
        this.f21659b = i10;
        this.f21660c = messagesStorage;
        this.d = j10;
        this.f21661e = j11;
        this.f21662f = i11;
    }
}
