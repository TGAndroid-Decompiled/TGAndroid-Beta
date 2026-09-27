package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class te implements Runnable {
    public final int f17619a;
    public final MessagesStorage f17620b;
    public final TLRPC.Message f17621c;
    public final long d;

    public te(int i10, long j3, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f17619a = i10;
        this.f17620b = messagesStorage;
        this.f17621c = message;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17619a) {
            case 0:
                this.f17620b.lambda$updateMessageCustomParams$110(this.f17621c, this.d);
                return;
            default:
                this.f17620b.lambda$markMessageAsSendErrorWithParams$210(this.f17621c, this.d);
                return;
        }
    }
}
