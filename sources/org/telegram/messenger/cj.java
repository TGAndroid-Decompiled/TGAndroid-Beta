package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cj implements Runnable {
    public final int f17620a;
    public final SendMessagesHelper f17621b;
    public final TLRPC.Message f17622c;
    public final boolean d;

    public cj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f17620a = i10;
        this.f17621b = sendMessagesHelper;
        this.f17622c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17620a) {
            case 0:
                this.f17621b.lambda$putToSendingMessages$64(this.f17622c, this.d);
                return;
            case 1:
                this.f17621b.lambda$performSendMessageRequest$90(this.f17622c, this.d);
                return;
            default:
                this.f17621b.lambda$performSendMessageRequest$87(this.f17622c, this.d);
                return;
        }
    }
}
