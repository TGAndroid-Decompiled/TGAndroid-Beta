package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class te implements Runnable {
    public final int f19256a;
    public final MessagesStorage f19257b;
    public final TLRPC.Message f19258c;
    public final long d;

    public te(int i10, long j3, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f19256a = i10;
        this.f19257b = messagesStorage;
        this.f19258c = message;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19256a) {
            case 0:
                this.f19257b.lambda$updateMessageCustomParams$110(this.f19258c, this.d);
                return;
            default:
                this.f19257b.lambda$markMessageAsSendErrorWithParams$210(this.f19258c, this.d);
                return;
        }
    }
}
