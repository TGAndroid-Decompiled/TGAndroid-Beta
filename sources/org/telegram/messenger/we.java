package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class we implements Runnable {
    public final int f18628a;
    public final MessagesStorage f18629b;
    public final TLRPC.Message f18630c;
    public final long d;

    public we(int i10, long j10, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f18628a = i10;
        this.f18629b = messagesStorage;
        this.f18630c = message;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18628a) {
            case 0:
                this.f18629b.lambda$updateMessageCustomParams$110(this.f18630c, this.d);
                return;
            default:
                this.f18629b.lambda$markMessageAsSendErrorWithParams$210(this.f18630c, this.d);
                return;
        }
    }
}
