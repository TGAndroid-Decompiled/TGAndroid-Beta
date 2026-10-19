package org.telegram.messenger;

import java.util.ArrayList;
public final class gi implements Runnable {
    public final int f18470a;
    public final SendMessagesHelper f18471b;
    public final long f18472c;
    public final ArrayList d;

    public gi(SendMessagesHelper sendMessagesHelper, long j10, ArrayList arrayList, int i10) {
        this.f18470a = i10;
        this.f18471b = sendMessagesHelper;
        this.f18472c = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18470a) {
            case 0:
                this.f18471b.lambda$performSendMessageRequestMulti$72(this.f18472c, this.d);
                return;
            case 1:
                this.f18471b.lambda$performSendMessageRequest$100(this.f18472c, this.d);
                return;
            default:
                this.f18471b.lambda$sendMessage$14(this.f18472c, this.d);
                return;
        }
    }
}
