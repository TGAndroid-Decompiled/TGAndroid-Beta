package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ue implements Runnable {
    public final int f19152a;
    public final MessagesStorage f19153b;
    public final TLRPC.Message f19154c;
    public final long d;

    public ue(int i10, long j3, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f19152a = i10;
        this.f19153b = messagesStorage;
        this.f19154c = message;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19152a) {
            case 0:
                this.f19153b.lambda$updateMessageCustomParams$110(this.f19154c, this.d);
                return;
            default:
                this.f19153b.lambda$markMessageAsSendErrorWithParams$210(this.f19154c, this.d);
                return;
        }
    }
}
