package org.telegram.messenger;

import java.util.ArrayList;
public final class ki implements Runnable {
    public final int f18857a;
    public final SendMessagesHelper f18858b;
    public final long f18859c;
    public final ArrayList d;

    public ki(SendMessagesHelper sendMessagesHelper, long j10, ArrayList arrayList, int i10) {
        this.f18857a = i10;
        this.f18858b = sendMessagesHelper;
        this.f18859c = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18857a) {
            case 0:
                this.f18858b.lambda$performSendMessageRequestMulti$72(this.f18859c, this.d);
                return;
            case 1:
                this.f18858b.lambda$performSendMessageRequest$100(this.f18859c, this.d);
                return;
            default:
                this.f18858b.lambda$sendMessage$14(this.f18859c, this.d);
                return;
        }
    }
}
