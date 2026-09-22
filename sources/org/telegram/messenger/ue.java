package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ue implements Runnable {
    public final int f17699a;
    public final MessagesStorage f17700b;
    public final TLRPC.Message f17701c;
    public final long d;

    public ue(int i10, long j3, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f17699a = i10;
        this.f17700b = messagesStorage;
        this.f17701c = message;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17699a) {
            case 0:
                this.f17700b.lambda$updateMessageCustomParams$110(this.f17701c, this.d);
                return;
            default:
                this.f17700b.lambda$markMessageAsSendErrorWithParams$210(this.f17701c, this.d);
                return;
        }
    }
}
