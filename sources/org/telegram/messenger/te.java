package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class te implements Runnable {
    public final int f19248a;
    public final MessagesStorage f19249b;
    public final TLRPC.Message f19250c;
    public final long d;

    public te(int i10, long j3, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f19248a = i10;
        this.f19249b = messagesStorage;
        this.f19250c = message;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19248a) {
            case 0:
                this.f19249b.lambda$updateMessageCustomParams$110(this.f19250c, this.d);
                return;
            default:
                this.f19249b.lambda$markMessageAsSendErrorWithParams$210(this.f19250c, this.d);
                return;
        }
    }
}
