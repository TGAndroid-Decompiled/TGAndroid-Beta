package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class re implements Runnable {
    public final int f19424a;
    public final MessagesStorage f19425b;
    public final TLRPC.Message f19426c;
    public final long d;

    public re(int i10, long j10, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f19424a = i10;
        this.f19425b = messagesStorage;
        this.f19426c = message;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19424a) {
            case 0:
                this.f19425b.lambda$updateMessageCustomParams$110(this.f19426c, this.d);
                return;
            default:
                this.f19425b.lambda$markMessageAsSendErrorWithParams$210(this.f19426c, this.d);
                return;
        }
    }
}
