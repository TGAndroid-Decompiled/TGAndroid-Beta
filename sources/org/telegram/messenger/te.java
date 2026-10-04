package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class te implements Runnable {
    public final int f19249a;
    public final MessagesStorage f19250b;
    public final TLRPC.Message f19251c;
    public final long d;

    public te(int i10, long j3, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f19249a = i10;
        this.f19250b = messagesStorage;
        this.f19251c = message;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19249a) {
            case 0:
                this.f19250b.lambda$updateMessageCustomParams$110(this.f19251c, this.d);
                return;
            default:
                this.f19250b.lambda$markMessageAsSendErrorWithParams$210(this.f19251c, this.d);
                return;
        }
    }
}
