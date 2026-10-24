package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class we implements Runnable {
    public final int f20057a;
    public final MessagesStorage f20058b;
    public final TLRPC.Message f20059c;
    public final long d;

    public we(int i10, long j10, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f20057a = i10;
        this.f20058b = messagesStorage;
        this.f20059c = message;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f20057a) {
            case 0:
                this.f20058b.lambda$updateMessageCustomParams$110(this.f20059c, this.d);
                return;
            default:
                this.f20058b.lambda$markMessageAsSendErrorWithParams$210(this.f20059c, this.d);
                return;
        }
    }
}
