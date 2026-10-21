package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class te implements Runnable {
    public final int f19598a;
    public final MessagesStorage f19599b;
    public final TLRPC.Message f19600c;
    public final long d;

    public te(int i10, long j10, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f19598a = i10;
        this.f19599b = messagesStorage;
        this.f19600c = message;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19598a) {
            case 0:
                this.f19599b.lambda$updateMessageCustomParams$110(this.f19600c, this.d);
                return;
            default:
                this.f19599b.lambda$markMessageAsSendErrorWithParams$210(this.f19600c, this.d);
                return;
        }
    }
}
