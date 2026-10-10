package org.telegram.messenger;

import java.util.ArrayList;
public final class mi implements Runnable {
    public final int f18550a;
    public final SendMessagesHelper f18551b;
    public final long f18552c;
    public final ArrayList d;

    public mi(SendMessagesHelper sendMessagesHelper, long j3, ArrayList arrayList, int i10) {
        this.f18550a = i10;
        this.f18551b = sendMessagesHelper;
        this.f18552c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18550a) {
            case 0:
                this.f18551b.lambda$performSendMessageRequestMulti$72(this.f18552c, this.d);
                return;
            case 1:
                this.f18551b.lambda$performSendMessageRequest$100(this.f18552c, this.d);
                return;
            default:
                this.f18551b.lambda$sendMessage$14(this.f18552c, this.d);
                return;
        }
    }
}
