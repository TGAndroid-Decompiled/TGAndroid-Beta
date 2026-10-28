package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class jf implements Runnable {
    public final int f20438a;
    public final MessagesStorage f20439b;
    public final TLRPC.Message f20440c;
    public final long d;

    public jf(int i10, long j10, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f20438a = i10;
        this.f20439b = messagesStorage;
        this.f20440c = message;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f20438a) {
            case 0:
                this.f20439b.lambda$markMessageAsSendErrorWithParams$214(this.f20440c, this.d);
                return;
            default:
                this.f20439b.lambda$updateMessageCustomParams$114(this.f20440c, this.d);
                return;
        }
    }
}
