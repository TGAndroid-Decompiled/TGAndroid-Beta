package org.telegram.messenger;

import java.util.ArrayList;
public final class gi implements Runnable {
    public final int f18473a;
    public final SendMessagesHelper f18474b;
    public final long f18475c;
    public final ArrayList d;

    public gi(SendMessagesHelper sendMessagesHelper, long j10, ArrayList arrayList, int i10) {
        this.f18473a = i10;
        this.f18474b = sendMessagesHelper;
        this.f18475c = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18473a) {
            case 0:
                this.f18474b.lambda$performSendMessageRequestMulti$72(this.f18475c, this.d);
                return;
            case 1:
                this.f18474b.lambda$performSendMessageRequest$100(this.f18475c, this.d);
                return;
            default:
                this.f18474b.lambda$sendMessage$14(this.f18475c, this.d);
                return;
        }
    }
}
