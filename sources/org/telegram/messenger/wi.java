package org.telegram.messenger;

import java.util.ArrayList;
public final class wi implements Runnable {
    public final int f20562a;
    public final SendMessagesHelper f20563b;
    public final long f20564c;
    public final ArrayList d;

    public wi(SendMessagesHelper sendMessagesHelper, long j10, ArrayList arrayList, int i10) {
        this.f20562a = i10;
        this.f20563b = sendMessagesHelper;
        this.f20564c = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20562a) {
            case 0:
                this.f20563b.lambda$sendMessage$11(this.f20564c, this.d);
                return;
            case 1:
                this.f20563b.lambda$performSendMessageRequestMulti$69(this.f20564c, this.d);
                return;
            default:
                this.f20563b.lambda$performSendMessageRequest$97(this.f20564c, this.d);
                return;
        }
    }
}
