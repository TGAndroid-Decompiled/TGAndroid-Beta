package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vf implements Runnable {
    public final int f20292a = 0;
    public final int f20293b;
    public final MessagesStorage f20294c;
    public final long d;
    public final long f20295e;
    public final int f20296f;
    public final Object h;

    public vf(int i10, int i11, long j10, long j11, MessagesStorage messagesStorage, TLRPC.InputChannel inputChannel) {
        this.f20294c = messagesStorage;
        this.d = j10;
        this.f20293b = i10;
        this.h = inputChannel;
        this.f20296f = i11;
        this.f20295e = j11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vf.run():void");
    }

    public vf(org.telegram.ui.Cells.f6 f6Var, int i10, MessagesStorage messagesStorage, long j10, long j11, int i11) {
        this.h = f6Var;
        this.f20293b = i10;
        this.f20294c = messagesStorage;
        this.d = j10;
        this.f20295e = j11;
        this.f20296f = i11;
    }
}
