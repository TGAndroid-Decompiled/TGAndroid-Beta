package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class we implements Runnable {
    public final int f22093a;
    public final MessagesStorage f22094b;
    public final TLRPC.Message f22095c;
    public final long d;

    public we(int i10, long j10, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f22093a = i10;
        this.f22094b = messagesStorage;
        this.f22095c = message;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f22093a) {
            case 0:
                this.f22094b.lambda$updateMessageCustomParams$110(this.f22095c, this.d);
                return;
            default:
                this.f22094b.lambda$markMessageAsSendErrorWithParams$210(this.f22095c, this.d);
                return;
        }
    }
}
