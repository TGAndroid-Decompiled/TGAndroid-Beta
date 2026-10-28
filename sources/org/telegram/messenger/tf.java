package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class tf implements Runnable {
    public final int f21328a = 0;
    public final int f21329b;
    public final MessagesStorage f21330c;
    public final long d;
    public final long e;
    public final int f21331f;
    public final Object h;

    public tf(int i10, int i11, long j10, long j11, MessagesStorage messagesStorage, TLRPC.InputChannel inputChannel) {
        this.f21330c = messagesStorage;
        this.d = j10;
        this.f21329b = i10;
        this.h = inputChannel;
        this.f21331f = i11;
        this.e = j11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.tf.run():void");
    }

    public tf(org.telegram.ui.Cells.k6 k6Var, int i10, MessagesStorage messagesStorage, long j10, long j11, int i11) {
        this.h = k6Var;
        this.f21329b = i10;
        this.f21330c = messagesStorage;
        this.d = j10;
        this.e = j11;
        this.f21331f = i11;
    }
}
