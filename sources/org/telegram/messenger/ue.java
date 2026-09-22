package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ue implements Runnable {
    public final int f17462a;
    public final MessagesStorage f17463b;
    public final TLRPC.Message f17464c;
    public final long d;

    public ue(int i10, long j3, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f17462a = i10;
        this.f17463b = messagesStorage;
        this.f17464c = message;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17462a) {
            case 0:
                this.f17463b.lambda$updateMessageCustomParams$110(this.f17464c, this.d);
                return;
            default:
                this.f17463b.lambda$markMessageAsSendErrorWithParams$210(this.f17464c, this.d);
                return;
        }
    }
}
