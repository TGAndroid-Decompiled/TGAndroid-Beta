package org.telegram.messenger;

import java.util.ArrayList;
public final class wi implements Runnable {
    public final int f20560a;
    public final SendMessagesHelper f20561b;
    public final long f20562c;
    public final ArrayList d;

    public wi(SendMessagesHelper sendMessagesHelper, long j10, ArrayList arrayList, int i10) {
        this.f20560a = i10;
        this.f20561b = sendMessagesHelper;
        this.f20562c = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20560a) {
            case 0:
                this.f20561b.lambda$sendMessage$11(this.f20562c, this.d);
                return;
            case 1:
                this.f20561b.lambda$performSendMessageRequestMulti$69(this.f20562c, this.d);
                return;
            default:
                this.f20561b.lambda$performSendMessageRequest$97(this.f20562c, this.d);
                return;
        }
    }
}
