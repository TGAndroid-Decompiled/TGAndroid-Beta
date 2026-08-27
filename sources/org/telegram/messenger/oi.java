package org.telegram.messenger;

import java.util.ArrayList;

public final class oi implements Runnable {

    public final int f21192a;

    public final SendMessagesHelper f21193b;

    public final long f21194c;
    public final ArrayList d;

    public oi(SendMessagesHelper sendMessagesHelper, long j10, ArrayList arrayList, int i10) {
        this.f21192a = i10;
        this.f21193b = sendMessagesHelper;
        this.f21194c = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f21192a) {
            case 0:
                this.f21193b.lambda$sendMessage$11(this.f21194c, this.d);
                break;
            case 1:
                this.f21193b.lambda$performSendMessageRequestMulti$69(this.f21194c, this.d);
                break;
            default:
                this.f21193b.lambda$performSendMessageRequest$97(this.f21194c, this.d);
                break;
        }
    }
}
