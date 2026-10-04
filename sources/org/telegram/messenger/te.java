package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class te implements Runnable {
    public final int f19251a;
    public final MessagesStorage f19252b;
    public final TLRPC.Message f19253c;
    public final long d;

    public te(int i10, long j3, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f19251a = i10;
        this.f19252b = messagesStorage;
        this.f19253c = message;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19251a) {
            case 0:
                this.f19252b.lambda$updateMessageCustomParams$110(this.f19253c, this.d);
                return;
            default:
                this.f19252b.lambda$markMessageAsSendErrorWithParams$210(this.f19253c, this.d);
                return;
        }
    }
}
