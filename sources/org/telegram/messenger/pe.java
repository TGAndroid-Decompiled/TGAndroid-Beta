package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class pe implements Runnable {
    public final int f21238a;
    public final MessagesStorage f21239b;
    public final TLRPC.Message f21240c;
    public final long d;

    public pe(int i9, long j10, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f21238a = i9;
        this.f21239b = messagesStorage;
        this.f21240c = message;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f21238a) {
            case 0:
                this.f21239b.lambda$updateMessageCustomParams$110(this.f21240c, this.d);
                return;
            default:
                this.f21239b.lambda$markMessageAsSendErrorWithParams$210(this.f21240c, this.d);
                return;
        }
    }
}
