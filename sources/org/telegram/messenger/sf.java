package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sf implements Runnable {
    public final int f19013a = 0;
    public final int f19014b;
    public final MessagesStorage f19015c;
    public final long d;
    public final long f19016e;
    public final int f19017f;
    public final Object h;

    public sf(int i10, int i11, long j3, long j10, MessagesStorage messagesStorage, TLRPC.InputChannel inputChannel) {
        this.f19015c = messagesStorage;
        this.d = j3;
        this.f19014b = i10;
        this.h = inputChannel;
        this.f19017f = i11;
        this.f19016e = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.sf.run():void");
    }

    public sf(org.telegram.ui.Cells.f6 f6Var, int i10, MessagesStorage messagesStorage, long j3, long j10, int i11) {
        this.h = f6Var;
        this.f19014b = i10;
        this.f19015c = messagesStorage;
        this.d = j3;
        this.f19016e = j10;
        this.f19017f = i11;
    }
}
