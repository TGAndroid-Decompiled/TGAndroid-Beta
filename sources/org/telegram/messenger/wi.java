package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class wi implements Runnable {

    public final int f22072a;

    public final SendMessagesHelper f22073b;

    public final TLRPC.Updates f22074c;

    public wi(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f22072a = i10;
        this.f22073b = sendMessagesHelper;
        this.f22074c = updates;
    }

    @Override
    public final void run() {
        switch (this.f22072a) {
            case 0:
                this.f22073b.lambda$performSendMessageRequest$94(this.f22074c);
                break;
            default:
                this.f22073b.lambda$performSendMessageRequestMulti$72(this.f22074c);
                break;
        }
    }
}
