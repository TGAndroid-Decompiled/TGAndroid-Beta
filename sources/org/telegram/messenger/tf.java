package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class tf implements Runnable {
    public final int f19684a = 0;
    public final int f19685b;
    public final MessagesStorage f19686c;
    public final long d;
    public final long e;
    public final int f19687f;
    public final Object h;

    public tf(int i10, int i11, long j10, long j11, MessagesStorage messagesStorage, TLRPC.InputChannel inputChannel) {
        this.f19686c = messagesStorage;
        this.d = j10;
        this.f19685b = i10;
        this.h = inputChannel;
        this.f19687f = i11;
        this.e = j11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.tf.run():void");
    }

    public tf(org.telegram.ui.Cells.g6 g6Var, int i10, MessagesStorage messagesStorage, long j10, long j11, int i11) {
        this.h = g6Var;
        this.f19685b = i10;
        this.f19686c = messagesStorage;
        this.d = j10;
        this.e = j11;
        this.f19687f = i11;
    }
}
