package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class we implements Runnable {
    public final int f19994a;
    public final MessagesStorage f19995b;
    public final TLRPC.Message f19996c;
    public final long d;

    public we(int i10, long j10, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f19994a = i10;
        this.f19995b = messagesStorage;
        this.f19996c = message;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19994a) {
            case 0:
                this.f19995b.lambda$updateMessageCustomParams$110(this.f19996c, this.d);
                return;
            default:
                this.f19995b.lambda$markMessageAsSendErrorWithParams$210(this.f19996c, this.d);
                return;
        }
    }
}
