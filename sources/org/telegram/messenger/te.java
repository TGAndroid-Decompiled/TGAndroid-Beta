package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class te implements Runnable {
    public final int f17625a;
    public final MessagesStorage f17626b;
    public final TLRPC.Message f17627c;
    public final long d;

    public te(int i10, long j3, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f17625a = i10;
        this.f17626b = messagesStorage;
        this.f17627c = message;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17625a) {
            case 0:
                this.f17626b.lambda$updateMessageCustomParams$110(this.f17627c, this.d);
                return;
            default:
                this.f17626b.lambda$markMessageAsSendErrorWithParams$210(this.f17627c, this.d);
                return;
        }
    }
}
