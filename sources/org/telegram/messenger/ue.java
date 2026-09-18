package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ue implements Runnable {
    public final int f17473a;
    public final MessagesStorage f17474b;
    public final TLRPC.Message f17475c;
    public final long d;

    public ue(int i10, long j3, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f17473a = i10;
        this.f17474b = messagesStorage;
        this.f17475c = message;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17473a) {
            case 0:
                this.f17474b.lambda$updateMessageCustomParams$110(this.f17475c, this.d);
                return;
            default:
                this.f17474b.lambda$markMessageAsSendErrorWithParams$210(this.f17475c, this.d);
                return;
        }
    }
}
