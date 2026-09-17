package org.telegram.messenger;

import java.util.ArrayList;
public final class si implements Runnable {
    public final int f19037a;
    public final SendMessagesHelper f19038b;
    public final long f19039c;
    public final ArrayList d;

    public si(SendMessagesHelper sendMessagesHelper, long j3, ArrayList arrayList, int i10) {
        this.f19037a = i10;
        this.f19038b = sendMessagesHelper;
        this.f19039c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19037a) {
            case 0:
                this.f19038b.lambda$sendMessage$11(this.f19039c, this.d);
                return;
            case 1:
                this.f19038b.lambda$performSendMessageRequestMulti$69(this.f19039c, this.d);
                return;
            default:
                this.f19038b.lambda$performSendMessageRequest$97(this.f19039c, this.d);
                return;
        }
    }
}
