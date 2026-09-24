package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class te implements Runnable {
    public final int f17610a;
    public final MessagesStorage f17611b;
    public final TLRPC.Message f17612c;
    public final long d;

    public te(int i10, long j3, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f17610a = i10;
        this.f17611b = messagesStorage;
        this.f17612c = message;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17610a) {
            case 0:
                this.f17611b.lambda$updateMessageCustomParams$110(this.f17612c, this.d);
                return;
            default:
                this.f17611b.lambda$markMessageAsSendErrorWithParams$210(this.f17612c, this.d);
                return;
        }
    }
}
