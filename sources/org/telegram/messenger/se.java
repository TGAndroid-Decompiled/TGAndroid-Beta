package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class se implements Runnable {
    public final int f19504a;
    public final MessagesStorage f19505b;
    public final TLRPC.Message f19506c;
    public final long d;

    public se(int i10, long j10, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f19504a = i10;
        this.f19505b = messagesStorage;
        this.f19506c = message;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19504a) {
            case 0:
                this.f19505b.lambda$updateMessageCustomParams$110(this.f19506c, this.d);
                return;
            default:
                this.f19505b.lambda$markMessageAsSendErrorWithParams$210(this.f19506c, this.d);
                return;
        }
    }
}
