package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class we implements Runnable {
    public final int f19470a;
    public final MessagesStorage f19471b;
    public final TLRPC.Message f19472c;
    public final long d;

    public we(int i10, long j3, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f19470a = i10;
        this.f19471b = messagesStorage;
        this.f19472c = message;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19470a) {
            case 0:
                this.f19471b.lambda$updateMessageCustomParams$110(this.f19472c, this.d);
                return;
            default:
                this.f19471b.lambda$markMessageAsSendErrorWithParams$210(this.f19472c, this.d);
                return;
        }
    }
}
