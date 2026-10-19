package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class se implements Runnable {
    public final int f19507a;
    public final MessagesStorage f19508b;
    public final TLRPC.Message f19509c;
    public final long d;

    public se(int i10, long j10, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f19507a = i10;
        this.f19508b = messagesStorage;
        this.f19509c = message;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19507a) {
            case 0:
                this.f19508b.lambda$updateMessageCustomParams$110(this.f19509c, this.d);
                return;
            default:
                this.f19508b.lambda$markMessageAsSendErrorWithParams$210(this.f19509c, this.d);
                return;
        }
    }
}
