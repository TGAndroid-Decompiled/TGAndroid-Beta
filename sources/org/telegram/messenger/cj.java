package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cj implements Runnable {
    public final int f17335a;
    public final SendMessagesHelper f17336b;
    public final TLRPC.Updates f17337c;

    public cj(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f17335a = i10;
        this.f17336b = sendMessagesHelper;
        this.f17337c = updates;
    }

    @Override
    public final void run() {
        switch (this.f17335a) {
            case 0:
                this.f17336b.lambda$performSendMessageRequest$97(this.f17337c);
                return;
            default:
                this.f17336b.lambda$performSendMessageRequestMulti$75(this.f17337c);
                return;
        }
    }
}
