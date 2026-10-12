package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class we implements Runnable {
    public final int f18928a;
    public final MessagesStorage f18929b;
    public final TLRPC.Message f18930c;
    public final long d;

    public we(int i10, long j10, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f18928a = i10;
        this.f18929b = messagesStorage;
        this.f18930c = message;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18928a) {
            case 0:
                this.f18929b.lambda$updateMessageCustomParams$110(this.f18930c, this.d);
                return;
            default:
                this.f18929b.lambda$markMessageAsSendErrorWithParams$210(this.f18930c, this.d);
                return;
        }
    }
}
