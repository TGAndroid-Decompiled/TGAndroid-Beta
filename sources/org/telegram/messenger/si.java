package org.telegram.messenger;

import java.util.ArrayList;
public final class si implements Runnable {
    public final int f19167a;
    public final SendMessagesHelper f19168b;
    public final long f19169c;
    public final ArrayList d;

    public si(SendMessagesHelper sendMessagesHelper, long j3, ArrayList arrayList, int i10) {
        this.f19167a = i10;
        this.f19168b = sendMessagesHelper;
        this.f19169c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19167a) {
            case 0:
                this.f19168b.lambda$sendMessage$11(this.f19169c, this.d);
                return;
            case 1:
                this.f19168b.lambda$performSendMessageRequestMulti$69(this.f19169c, this.d);
                return;
            default:
                this.f19168b.lambda$performSendMessageRequest$97(this.f19169c, this.d);
                return;
        }
    }
}
