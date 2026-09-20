package org.telegram.messenger;

import java.util.ArrayList;
public final class ti implements Runnable {
    public final int f17623a;
    public final SendMessagesHelper f17624b;
    public final long f17625c;
    public final ArrayList d;

    public ti(SendMessagesHelper sendMessagesHelper, long j3, ArrayList arrayList, int i10) {
        this.f17623a = i10;
        this.f17624b = sendMessagesHelper;
        this.f17625c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17623a) {
            case 0:
                SendMessagesHelper.u(this.f17624b, this.f17625c, this.d);
                return;
            case 1:
                this.f17624b.lambda$performSendMessageRequestMulti$69(this.f17625c, this.d);
                return;
            default:
                this.f17624b.lambda$performSendMessageRequest$97(this.f17625c, this.d);
                return;
        }
    }
}
