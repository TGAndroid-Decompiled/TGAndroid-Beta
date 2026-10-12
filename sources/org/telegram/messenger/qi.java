package org.telegram.messenger;

import java.util.ArrayList;
public final class qi implements Runnable {
    public final int f18720a;
    public final SendMessagesHelper f18721b;
    public final long f18722c;
    public final ArrayList d;

    public qi(SendMessagesHelper sendMessagesHelper, long j3, ArrayList arrayList, int i10) {
        this.f18720a = i10;
        this.f18721b = sendMessagesHelper;
        this.f18722c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18720a) {
            case 0:
                this.f18721b.lambda$performSendMessageRequestMulti$72(this.f18722c, this.d);
                return;
            case 1:
                this.f18721b.lambda$performSendMessageRequest$100(this.f18722c, this.d);
                return;
            default:
                this.f18721b.lambda$sendMessage$14(this.f18722c, this.d);
                return;
        }
    }
}
