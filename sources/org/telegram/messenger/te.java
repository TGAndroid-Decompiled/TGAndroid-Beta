package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class te implements Runnable {
    public final int f19599a;
    public final MessagesStorage f19600b;
    public final TLRPC.Message f19601c;
    public final long d;

    public te(int i10, long j10, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f19599a = i10;
        this.f19600b = messagesStorage;
        this.f19601c = message;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19599a) {
            case 0:
                this.f19600b.lambda$updateMessageCustomParams$110(this.f19601c, this.d);
                return;
            default:
                this.f19600b.lambda$markMessageAsSendErrorWithParams$210(this.f19601c, this.d);
                return;
        }
    }
}
