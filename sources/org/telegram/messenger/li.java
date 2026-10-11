package org.telegram.messenger;

import java.util.ArrayList;
public final class li implements Runnable {
    public final int f18454a;
    public final SendMessagesHelper f18455b;
    public final long f18456c;
    public final ArrayList d;

    public li(SendMessagesHelper sendMessagesHelper, long j3, ArrayList arrayList, int i10) {
        this.f18454a = i10;
        this.f18455b = sendMessagesHelper;
        this.f18456c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18454a) {
            case 0:
                this.f18455b.lambda$performSendMessageRequestMulti$72(this.f18456c, this.d);
                return;
            case 1:
                this.f18455b.lambda$performSendMessageRequest$100(this.f18456c, this.d);
                return;
            default:
                this.f18455b.lambda$sendMessage$14(this.f18456c, this.d);
                return;
        }
    }
}
