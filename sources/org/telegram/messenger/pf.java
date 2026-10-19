package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class pf implements Runnable {
    public final int f19280a = 0;
    public final int f19281b;
    public final MessagesStorage f19282c;
    public final long d;
    public final long e;
    public final int f19283f;
    public final Object h;

    public pf(int i10, int i11, long j10, long j11, MessagesStorage messagesStorage, TLRPC.InputChannel inputChannel) {
        this.f19282c = messagesStorage;
        this.d = j10;
        this.f19281b = i10;
        this.h = inputChannel;
        this.f19283f = i11;
        this.e = j11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.pf.run():void");
    }

    public pf(org.telegram.ui.Cells.f6 f6Var, int i10, MessagesStorage messagesStorage, long j10, long j11, int i11) {
        this.h = f6Var;
        this.f19281b = i10;
        this.f19282c = messagesStorage;
        this.d = j10;
        this.e = j11;
        this.f19283f = i11;
    }
}
