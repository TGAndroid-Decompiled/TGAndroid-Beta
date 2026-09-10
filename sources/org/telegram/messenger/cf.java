package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cf implements Runnable {
    public final int f14917a;
    public final MessagesStorage f14918b;
    public final TLRPC.Message f14919c;
    public final long d;

    public cf(int i10, long j3, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f14917a = i10;
        this.f14918b = messagesStorage;
        this.f14919c = message;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f14917a) {
            case 0:
                this.f14918b.lambda$updateMessageCustomParams$110(this.f14919c, this.d);
                return;
            default:
                this.f14918b.lambda$markMessageAsSendErrorWithParams$210(this.f14919c, this.d);
                return;
        }
    }
}
