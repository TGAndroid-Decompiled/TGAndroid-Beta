package org.telegram.messenger;

import java.util.ArrayList;
public final class si implements Runnable {
    public final int f17551a;
    public final SendMessagesHelper f17552b;
    public final long f17553c;
    public final ArrayList d;

    public si(SendMessagesHelper sendMessagesHelper, long j3, ArrayList arrayList, int i10) {
        this.f17551a = i10;
        this.f17552b = sendMessagesHelper;
        this.f17553c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17551a) {
            case 0:
                this.f17552b.lambda$sendMessage$11(this.f17553c, this.d);
                return;
            case 1:
                this.f17552b.lambda$performSendMessageRequestMulti$69(this.f17553c, this.d);
                return;
            default:
                this.f17552b.lambda$performSendMessageRequest$97(this.f17553c, this.d);
                return;
        }
    }
}
