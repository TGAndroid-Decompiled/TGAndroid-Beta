package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class te implements Runnable {
    public final int f17372a;
    public final MessagesStorage f17373b;
    public final TLRPC.Message f17374c;
    public final long d;

    public te(int i10, long j3, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f17372a = i10;
        this.f17373b = messagesStorage;
        this.f17374c = message;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17372a) {
            case 0:
                this.f17373b.lambda$updateMessageCustomParams$110(this.f17374c, this.d);
                return;
            default:
                this.f17373b.lambda$markMessageAsSendErrorWithParams$210(this.f17374c, this.d);
                return;
        }
    }
}
