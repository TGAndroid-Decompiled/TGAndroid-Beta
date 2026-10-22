package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class aj implements Runnable {
    public final int f17886a;
    public final SendMessagesHelper f17887b;
    public final TLRPC.Message f17888c;
    public final boolean d;

    public aj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f17886a = i10;
        this.f17887b = sendMessagesHelper;
        this.f17888c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17886a) {
            case 0:
                this.f17887b.lambda$putToSendingMessages$64(this.f17888c, this.d);
                return;
            case 1:
                this.f17887b.lambda$performSendMessageRequest$90(this.f17888c, this.d);
                return;
            default:
                this.f17887b.lambda$performSendMessageRequest$87(this.f17888c, this.d);
                return;
        }
    }
}
