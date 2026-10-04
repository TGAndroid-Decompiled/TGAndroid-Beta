package org.telegram.messenger;

import java.util.ArrayList;
public final class si implements Runnable {
    public final int f19166a;
    public final SendMessagesHelper f19167b;
    public final long f19168c;
    public final ArrayList d;

    public si(SendMessagesHelper sendMessagesHelper, long j3, ArrayList arrayList, int i10) {
        this.f19166a = i10;
        this.f19167b = sendMessagesHelper;
        this.f19168c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19166a) {
            case 0:
                this.f19167b.lambda$sendMessage$11(this.f19168c, this.d);
                return;
            case 1:
                this.f19167b.lambda$performSendMessageRequestMulti$69(this.f19168c, this.d);
                return;
            default:
                this.f19167b.lambda$performSendMessageRequest$97(this.f19168c, this.d);
                return;
        }
    }
}
