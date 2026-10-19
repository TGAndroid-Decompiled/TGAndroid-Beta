package org.telegram.messenger;

import java.util.ArrayList;
public final class hi implements Runnable {
    public final int f18551a;
    public final SendMessagesHelper f18552b;
    public final long f18553c;
    public final ArrayList d;

    public hi(SendMessagesHelper sendMessagesHelper, long j10, ArrayList arrayList, int i10) {
        this.f18551a = i10;
        this.f18552b = sendMessagesHelper;
        this.f18553c = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18551a) {
            case 0:
                this.f18552b.lambda$performSendMessageRequestMulti$72(this.f18553c, this.d);
                return;
            case 1:
                this.f18552b.lambda$performSendMessageRequest$100(this.f18553c, this.d);
                return;
            default:
                this.f18552b.lambda$sendMessage$14(this.f18553c, this.d);
                return;
        }
    }
}
