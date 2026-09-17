package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class te implements Runnable {
    public final int f19080a;
    public final MessagesStorage f19081b;
    public final TLRPC.Message f19082c;
    public final long d;

    public te(int i10, long j3, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f19080a = i10;
        this.f19081b = messagesStorage;
        this.f19082c = message;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19080a) {
            case 0:
                this.f19081b.lambda$updateMessageCustomParams$110(this.f19082c, this.d);
                return;
            default:
                this.f19081b.lambda$markMessageAsSendErrorWithParams$210(this.f19082c, this.d);
                return;
        }
    }
}
