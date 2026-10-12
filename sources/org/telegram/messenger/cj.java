package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cj implements Runnable {
    public final int f17334a;
    public final SendMessagesHelper f17335b;
    public final TLRPC.Updates f17336c;

    public cj(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f17334a = i10;
        this.f17335b = sendMessagesHelper;
        this.f17336c = updates;
    }

    @Override
    public final void run() {
        switch (this.f17334a) {
            case 0:
                this.f17335b.lambda$performSendMessageRequest$97(this.f17336c);
                return;
            default:
                this.f17335b.lambda$performSendMessageRequestMulti$75(this.f17336c);
                return;
        }
    }
}
