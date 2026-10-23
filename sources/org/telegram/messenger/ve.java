package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ve implements Runnable {
    public final int f19827a;
    public final MessagesStorage f19828b;
    public final TLRPC.Message f19829c;
    public final long d;

    public ve(int i10, long j10, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f19827a = i10;
        this.f19828b = messagesStorage;
        this.f19829c = message;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19827a) {
            case 0:
                this.f19828b.lambda$updateMessageCustomParams$110(this.f19829c, this.d);
                return;
            default:
                this.f19828b.lambda$markMessageAsSendErrorWithParams$210(this.f19829c, this.d);
                return;
        }
    }
}
