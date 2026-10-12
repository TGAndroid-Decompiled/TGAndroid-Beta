package org.telegram.messenger;

import java.util.ArrayList;
public final class qi implements Runnable {
    public final int f18721a;
    public final SendMessagesHelper f18722b;
    public final long f18723c;
    public final ArrayList d;

    public qi(SendMessagesHelper sendMessagesHelper, long j3, ArrayList arrayList, int i10) {
        this.f18721a = i10;
        this.f18722b = sendMessagesHelper;
        this.f18723c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18721a) {
            case 0:
                this.f18722b.lambda$performSendMessageRequestMulti$72(this.f18723c, this.d);
                return;
            case 1:
                this.f18722b.lambda$performSendMessageRequest$100(this.f18723c, this.d);
                return;
            default:
                this.f18722b.lambda$sendMessage$14(this.f18723c, this.d);
                return;
        }
    }
}
