package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ve implements Runnable {
    public final int f19764a;
    public final MessagesStorage f19765b;
    public final TLRPC.Message f19766c;
    public final long d;

    public ve(int i10, long j10, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f19764a = i10;
        this.f19765b = messagesStorage;
        this.f19766c = message;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19764a) {
            case 0:
                this.f19765b.lambda$updateMessageCustomParams$110(this.f19766c, this.d);
                return;
            default:
                this.f19765b.lambda$markMessageAsSendErrorWithParams$210(this.f19766c, this.d);
                return;
        }
    }
}
