package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cj implements Runnable {
    public final int f19843a;
    public final SendMessagesHelper f19844b;
    public final TLRPC.Message f19845c;
    public final boolean d;

    public cj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f19843a = i10;
        this.f19844b = sendMessagesHelper;
        this.f19845c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f19843a) {
            case 0:
                this.f19844b.lambda$putToSendingMessages$64(this.f19845c, this.d);
                return;
            case 1:
                this.f19844b.lambda$performSendMessageRequest$90(this.f19845c, this.d);
                return;
            default:
                this.f19844b.lambda$performSendMessageRequest$87(this.f19845c, this.d);
                return;
        }
    }
}
