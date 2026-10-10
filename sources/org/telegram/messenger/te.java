package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class te implements Runnable {
    public final int f19246a;
    public final MessagesStorage f19247b;
    public final TLRPC.Message f19248c;
    public final long d;

    public te(int i10, long j3, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f19246a = i10;
        this.f19247b = messagesStorage;
        this.f19248c = message;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19246a) {
            case 0:
                this.f19247b.lambda$updateMessageCustomParams$110(this.f19248c, this.d);
                return;
            default:
                this.f19247b.lambda$markMessageAsSendErrorWithParams$210(this.f19248c, this.d);
                return;
        }
    }
}
