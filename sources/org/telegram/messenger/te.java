package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class te implements Runnable {
    public final int f19242a;
    public final MessagesStorage f19243b;
    public final TLRPC.Message f19244c;
    public final long d;

    public te(int i10, long j3, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f19242a = i10;
        this.f19243b = messagesStorage;
        this.f19244c = message;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19242a) {
            case 0:
                this.f19243b.lambda$updateMessageCustomParams$110(this.f19244c, this.d);
                return;
            default:
                this.f19243b.lambda$markMessageAsSendErrorWithParams$210(this.f19244c, this.d);
                return;
        }
    }
}
