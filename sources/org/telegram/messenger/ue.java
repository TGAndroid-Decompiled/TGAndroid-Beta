package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ue implements Runnable {
    public final int f19179a;
    public final MessagesStorage f19180b;
    public final TLRPC.Message f19181c;
    public final long d;

    public ue(int i10, long j3, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f19179a = i10;
        this.f19180b = messagesStorage;
        this.f19181c = message;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19179a) {
            case 0:
                this.f19180b.lambda$updateMessageCustomParams$110(this.f19181c, this.d);
                return;
            default:
                this.f19180b.lambda$markMessageAsSendErrorWithParams$210(this.f19181c, this.d);
                return;
        }
    }
}
