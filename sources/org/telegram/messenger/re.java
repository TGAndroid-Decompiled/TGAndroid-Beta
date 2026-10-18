package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class re implements Runnable {
    public final int f19427a;
    public final MessagesStorage f19428b;
    public final TLRPC.Message f19429c;
    public final long d;

    public re(int i10, long j10, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f19427a = i10;
        this.f19428b = messagesStorage;
        this.f19429c = message;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19427a) {
            case 0:
                this.f19428b.lambda$updateMessageCustomParams$110(this.f19429c, this.d);
                return;
            default:
                this.f19428b.lambda$markMessageAsSendErrorWithParams$210(this.f19429c, this.d);
                return;
        }
    }
}
