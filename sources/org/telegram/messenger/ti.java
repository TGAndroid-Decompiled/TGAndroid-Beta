package org.telegram.messenger;

import java.util.ArrayList;
public final class ti implements Runnable {
    public final int f19273a;
    public final SendMessagesHelper f19274b;
    public final long f19275c;
    public final ArrayList d;

    public ti(SendMessagesHelper sendMessagesHelper, long j3, ArrayList arrayList, int i10) {
        this.f19273a = i10;
        this.f19274b = sendMessagesHelper;
        this.f19275c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19273a) {
            case 0:
                this.f19274b.lambda$sendMessage$11(this.f19275c, this.d);
                return;
            case 1:
                this.f19274b.lambda$performSendMessageRequestMulti$69(this.f19275c, this.d);
                return;
            default:
                this.f19274b.lambda$performSendMessageRequest$97(this.f19275c, this.d);
                return;
        }
    }
}
