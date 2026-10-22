package org.telegram.messenger;

import java.util.ArrayList;
public final class ki implements Runnable {
    public final int f18791a;
    public final SendMessagesHelper f18792b;
    public final long f18793c;
    public final ArrayList d;

    public ki(SendMessagesHelper sendMessagesHelper, long j10, ArrayList arrayList, int i10) {
        this.f18791a = i10;
        this.f18792b = sendMessagesHelper;
        this.f18793c = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18791a) {
            case 0:
                this.f18792b.lambda$performSendMessageRequestMulti$72(this.f18793c, this.d);
                return;
            case 1:
                this.f18792b.lambda$performSendMessageRequest$100(this.f18793c, this.d);
                return;
            default:
                this.f18792b.lambda$sendMessage$14(this.f18793c, this.d);
                return;
        }
    }
}
