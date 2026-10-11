package org.telegram.messenger;

import java.util.ArrayList;
public final class li implements Runnable {
    public final int f18490a;
    public final SendMessagesHelper f18491b;
    public final long f18492c;
    public final ArrayList d;

    public li(SendMessagesHelper sendMessagesHelper, long j3, ArrayList arrayList, int i10) {
        this.f18490a = i10;
        this.f18491b = sendMessagesHelper;
        this.f18492c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18490a) {
            case 0:
                this.f18491b.lambda$performSendMessageRequestMulti$72(this.f18492c, this.d);
                return;
            case 1:
                this.f18491b.lambda$performSendMessageRequest$100(this.f18492c, this.d);
                return;
            default:
                this.f18491b.lambda$sendMessage$14(this.f18492c, this.d);
                return;
        }
    }
}
