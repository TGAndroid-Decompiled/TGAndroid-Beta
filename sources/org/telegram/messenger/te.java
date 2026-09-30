package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class te implements Runnable {
    public final int f17641a;
    public final MessagesStorage f17642b;
    public final TLRPC.Message f17643c;
    public final long d;

    public te(int i10, long j3, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f17641a = i10;
        this.f17642b = messagesStorage;
        this.f17643c = message;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17641a) {
            case 0:
                this.f17642b.lambda$updateMessageCustomParams$110(this.f17643c, this.d);
                return;
            default:
                this.f17642b.lambda$markMessageAsSendErrorWithParams$210(this.f17643c, this.d);
                return;
        }
    }
}
