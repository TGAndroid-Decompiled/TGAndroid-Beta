package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ue implements Runnable {
    public final int f17684a;
    public final MessagesStorage f17685b;
    public final TLRPC.Message f17686c;
    public final long d;

    public ue(int i10, long j3, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f17684a = i10;
        this.f17685b = messagesStorage;
        this.f17686c = message;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17684a) {
            case 0:
                this.f17685b.lambda$updateMessageCustomParams$110(this.f17686c, this.d);
                return;
            default:
                this.f17685b.lambda$markMessageAsSendErrorWithParams$210(this.f17686c, this.d);
                return;
        }
    }
}
