package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qi implements Runnable {
    public final int f19381a;
    public final SendMessagesHelper f19382b;
    public final TLRPC.Message f19383c;
    public final int d;

    public qi(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f19381a = i11;
        this.f19382b = sendMessagesHelper;
        this.f19383c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19381a) {
            case 0:
                this.f19382b.lambda$performSendMessageRequest$105(this.f19383c, this.d);
                return;
            default:
                this.f19382b.lambda$sendMessage$18(this.f19383c, this.d);
                return;
        }
    }
}
