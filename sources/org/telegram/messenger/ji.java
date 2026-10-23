package org.telegram.messenger;

import java.util.ArrayList;
public final class ji implements Runnable {
    public final int f18781a;
    public final SendMessagesHelper f18782b;
    public final long f18783c;
    public final ArrayList d;

    public ji(SendMessagesHelper sendMessagesHelper, long j10, ArrayList arrayList, int i10) {
        this.f18781a = i10;
        this.f18782b = sendMessagesHelper;
        this.f18783c = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18781a) {
            case 0:
                this.f18782b.lambda$performSendMessageRequestMulti$72(this.f18783c, this.d);
                return;
            case 1:
                this.f18782b.lambda$performSendMessageRequest$100(this.f18783c, this.d);
                return;
            default:
                this.f18782b.lambda$sendMessage$14(this.f18783c, this.d);
                return;
        }
    }
}
