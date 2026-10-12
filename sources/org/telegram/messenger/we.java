package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class we implements Runnable {
    public final int f19471a;
    public final MessagesStorage f19472b;
    public final TLRPC.Message f19473c;
    public final long d;

    public we(int i10, long j3, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f19471a = i10;
        this.f19472b = messagesStorage;
        this.f19473c = message;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19471a) {
            case 0:
                this.f19472b.lambda$updateMessageCustomParams$110(this.f19473c, this.d);
                return;
            default:
                this.f19472b.lambda$markMessageAsSendErrorWithParams$210(this.f19473c, this.d);
                return;
        }
    }
}
