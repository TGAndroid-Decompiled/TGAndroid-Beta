package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class te implements Runnable {
    public final int f19107a;
    public final MessagesStorage f19108b;
    public final TLRPC.Message f19109c;
    public final long d;

    public te(int i10, long j3, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f19107a = i10;
        this.f19108b = messagesStorage;
        this.f19109c = message;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19107a) {
            case 0:
                this.f19108b.lambda$updateMessageCustomParams$110(this.f19109c, this.d);
                return;
            default:
                this.f19108b.lambda$markMessageAsSendErrorWithParams$210(this.f19109c, this.d);
                return;
        }
    }
}
