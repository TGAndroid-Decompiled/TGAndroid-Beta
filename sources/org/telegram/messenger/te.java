package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class te implements Runnable {

    public final int f21635a;

    public final MessagesStorage f21636b;

    public final TLRPC.Message f21637c;
    public final long d;

    public te(int i10, long j10, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f21635a = i10;
        this.f21636b = messagesStorage;
        this.f21637c = message;
        this.d = j10;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f21635a) {
            case 0:
                this.f21636b.lambda$updateMessageCustomParams$110(this.f21637c, this.d);
                break;
            default:
                this.f21636b.lambda$markMessageAsSendErrorWithParams$210(this.f21637c, this.d);
                break;
        }
    }
}
