package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rf implements Runnable {
    public final int f18934a = 0;
    public final int f18935b;
    public final MessagesStorage f18936c;
    public final long d;
    public final long f18937e;
    public final int f18938f;
    public final Object h;

    public rf(int i10, int i11, long j3, long j10, MessagesStorage messagesStorage, TLRPC.InputChannel inputChannel) {
        this.f18936c = messagesStorage;
        this.d = j3;
        this.f18935b = i10;
        this.h = inputChannel;
        this.f18938f = i11;
        this.f18937e = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.rf.run():void");
    }

    public rf(org.telegram.ui.Cells.f6 f6Var, int i10, MessagesStorage messagesStorage, long j3, long j10, int i11) {
        this.h = f6Var;
        this.f18935b = i10;
        this.f18936c = messagesStorage;
        this.d = j3;
        this.f18937e = j10;
        this.f18938f = i11;
    }
}
