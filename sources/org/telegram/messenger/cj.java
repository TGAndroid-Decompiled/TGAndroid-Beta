package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cj implements Runnable {
    public final int f16097a;
    public final SendMessagesHelper f16098b;
    public final TLRPC.Updates f16099c;

    public cj(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f16097a = i10;
        this.f16098b = sendMessagesHelper;
        this.f16099c = updates;
    }

    @Override
    public final void run() {
        switch (this.f16097a) {
            case 0:
                this.f16098b.lambda$performSendMessageRequest$94(this.f16099c);
                return;
            default:
                this.f16098b.lambda$performSendMessageRequestMulti$72(this.f16099c);
                return;
        }
    }
}
