package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class tf implements Runnable {
    public final int f19619a = 0;
    public final int f19620b;
    public final MessagesStorage f19621c;
    public final long d;
    public final long e;
    public final int f19622f;
    public final Object h;

    public tf(int i10, int i11, long j10, long j11, MessagesStorage messagesStorage, TLRPC.InputChannel inputChannel) {
        this.f19621c = messagesStorage;
        this.d = j10;
        this.f19620b = i10;
        this.h = inputChannel;
        this.f19622f = i11;
        this.e = j11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.tf.run():void");
    }

    public tf(org.telegram.ui.Cells.f6 f6Var, int i10, MessagesStorage messagesStorage, long j10, long j11, int i11) {
        this.h = f6Var;
        this.f19620b = i10;
        this.f19621c = messagesStorage;
        this.d = j10;
        this.e = j11;
        this.f19622f = i11;
    }
}
