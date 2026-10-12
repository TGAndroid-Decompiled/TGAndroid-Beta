package org.telegram.messenger;

import java.util.ArrayList;
public final class oi implements Runnable {
    public final int f18038a;
    public final SendMessagesHelper f18039b;
    public final long f18040c;
    public final ArrayList d;

    public oi(SendMessagesHelper sendMessagesHelper, long j10, ArrayList arrayList, int i10) {
        this.f18038a = i10;
        this.f18039b = sendMessagesHelper;
        this.f18040c = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18038a) {
            case 0:
                this.f18039b.lambda$performSendMessageRequestMulti$72(this.f18040c, this.d);
                return;
            case 1:
                this.f18039b.lambda$performSendMessageRequest$100(this.f18040c, this.d);
                return;
            default:
                this.f18039b.lambda$sendMessage$14(this.f18040c, this.d);
                return;
        }
    }
}
