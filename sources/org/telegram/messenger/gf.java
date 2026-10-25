package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gf implements Runnable {
    public final int f20177a;
    public final MessagesStorage f20178b;
    public final TLRPC.Message f20179c;
    public final long d;

    public gf(int i10, long j10, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f20177a = i10;
        this.f20178b = messagesStorage;
        this.f20179c = message;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f20177a) {
            case 0:
                this.f20178b.lambda$markMessageAsSendErrorWithParams$213(this.f20179c, this.d);
                return;
            default:
                this.f20178b.lambda$updateMessageCustomParams$113(this.f20179c, this.d);
                return;
        }
    }
}
