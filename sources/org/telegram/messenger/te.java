package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class te implements Runnable {
    public final int f17624a;
    public final MessagesStorage f17625b;
    public final TLRPC.Message f17626c;
    public final long d;

    public te(int i10, long j3, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f17624a = i10;
        this.f17625b = messagesStorage;
        this.f17626c = message;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17624a) {
            case 0:
                this.f17625b.lambda$updateMessageCustomParams$110(this.f17626c, this.d);
                return;
            default:
                this.f17625b.lambda$markMessageAsSendErrorWithParams$210(this.f17626c, this.d);
                return;
        }
    }
}
