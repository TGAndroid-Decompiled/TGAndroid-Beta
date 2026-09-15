package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ue implements Runnable {
    public final int f17464a;
    public final MessagesStorage f17465b;
    public final TLRPC.Message f17466c;
    public final long d;

    public ue(int i10, long j3, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f17464a = i10;
        this.f17465b = messagesStorage;
        this.f17466c = message;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17464a) {
            case 0:
                this.f17465b.lambda$updateMessageCustomParams$110(this.f17466c, this.d);
                return;
            default:
                this.f17465b.lambda$markMessageAsSendErrorWithParams$210(this.f17466c, this.d);
                return;
        }
    }
}
