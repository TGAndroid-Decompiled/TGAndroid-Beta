package org.telegram.messenger;

import java.util.ArrayList;
public final class wi implements Runnable {
    public final int f18900a;
    public final SendMessagesHelper f18901b;
    public final long f18902c;
    public final ArrayList d;

    public wi(SendMessagesHelper sendMessagesHelper, long j10, ArrayList arrayList, int i10) {
        this.f18900a = i10;
        this.f18901b = sendMessagesHelper;
        this.f18902c = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18900a) {
            case 0:
                this.f18901b.lambda$sendMessage$11(this.f18902c, this.d);
                return;
            case 1:
                this.f18901b.lambda$performSendMessageRequestMulti$69(this.f18902c, this.d);
                return;
            default:
                this.f18901b.lambda$performSendMessageRequest$97(this.f18902c, this.d);
                return;
        }
    }
}
