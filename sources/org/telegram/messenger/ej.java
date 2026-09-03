package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ej implements Runnable {
    public final int f18602a;
    public final SendMessagesHelper f18603b;
    public final TLRPC.Updates f18604c;

    public ej(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f18602a = i10;
        this.f18603b = sendMessagesHelper;
        this.f18604c = updates;
    }

    @Override
    public final void run() {
        switch (this.f18602a) {
            case 0:
                this.f18603b.lambda$performSendMessageRequest$94(this.f18604c);
                return;
            default:
                this.f18603b.lambda$performSendMessageRequestMulti$72(this.f18604c);
                return;
        }
    }
}
