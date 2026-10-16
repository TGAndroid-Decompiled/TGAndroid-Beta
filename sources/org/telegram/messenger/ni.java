package org.telegram.messenger;

import java.util.ArrayList;
public final class ni implements Runnable {
    public final int f17666a;
    public final SendMessagesHelper f17667b;
    public final long f17668c;
    public final ArrayList d;

    public ni(SendMessagesHelper sendMessagesHelper, long j10, ArrayList arrayList, int i10) {
        this.f17666a = i10;
        this.f17667b = sendMessagesHelper;
        this.f17668c = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17666a) {
            case 0:
                this.f17667b.lambda$performSendMessageRequestMulti$72(this.f17668c, this.d);
                return;
            case 1:
                this.f17667b.lambda$performSendMessageRequest$100(this.f17668c, this.d);
                return;
            default:
                this.f17667b.lambda$sendMessage$14(this.f17668c, this.d);
                return;
        }
    }
}
