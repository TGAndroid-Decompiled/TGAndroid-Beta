package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ue implements Runnable {
    public final int f17647a;
    public final MessagesStorage f17648b;
    public final TLRPC.Message f17649c;
    public final long d;

    public ue(int i10, long j3, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f17647a = i10;
        this.f17648b = messagesStorage;
        this.f17649c = message;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17647a) {
            case 0:
                this.f17648b.lambda$updateMessageCustomParams$110(this.f17649c, this.d);
                return;
            default:
                this.f17648b.lambda$markMessageAsSendErrorWithParams$210(this.f17649c, this.d);
                return;
        }
    }
}
