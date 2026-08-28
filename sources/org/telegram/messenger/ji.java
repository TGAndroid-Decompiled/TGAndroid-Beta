package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ji implements Runnable {
    public final int f20723a;
    public final SendMessagesHelper f20724b;
    public final TLRPC.Message f20725c;
    public final int d;

    public ji(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i9, int i10) {
        this.f20723a = i10;
        this.f20724b = sendMessagesHelper;
        this.f20725c = message;
        this.d = i9;
    }

    @Override
    public final void run() {
        switch (this.f20723a) {
            case 0:
                this.f20724b.lambda$performSendMessageRequest$102(this.f20725c, this.d);
                return;
            default:
                this.f20724b.lambda$sendMessage$15(this.f20725c, this.d);
                return;
        }
    }
}
