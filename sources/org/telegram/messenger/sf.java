package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sf implements Runnable {
    public final int f18986a = 0;
    public final int f18987b;
    public final MessagesStorage f18988c;
    public final long d;
    public final long f18989e;
    public final int f18990f;
    public final Object h;

    public sf(int i10, int i11, long j3, long j10, MessagesStorage messagesStorage, TLRPC.InputChannel inputChannel) {
        this.f18988c = messagesStorage;
        this.d = j3;
        this.f18987b = i10;
        this.h = inputChannel;
        this.f18990f = i11;
        this.f18989e = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.sf.run():void");
    }

    public sf(org.telegram.ui.Cells.f6 f6Var, int i10, MessagesStorage messagesStorage, long j3, long j10, int i11) {
        this.h = f6Var;
        this.f18987b = i10;
        this.f18988c = messagesStorage;
        this.d = j3;
        this.f18989e = j10;
        this.f18990f = i11;
    }
}
