package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class te implements Runnable {
    public final int f19284a;
    public final MessagesStorage f19285b;
    public final TLRPC.Message f19286c;
    public final long d;

    public te(int i10, long j3, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f19284a = i10;
        this.f19285b = messagesStorage;
        this.f19286c = message;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19284a) {
            case 0:
                this.f19285b.lambda$updateMessageCustomParams$110(this.f19286c, this.d);
                return;
            default:
                this.f19285b.lambda$markMessageAsSendErrorWithParams$210(this.f19286c, this.d);
                return;
        }
    }
}
