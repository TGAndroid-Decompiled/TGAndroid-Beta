package org.telegram.messenger;

import java.util.ArrayList;
public final class ji implements Runnable {
    public final int f18715a;
    public final SendMessagesHelper f18716b;
    public final long f18717c;
    public final ArrayList d;

    public ji(SendMessagesHelper sendMessagesHelper, long j10, ArrayList arrayList, int i10) {
        this.f18715a = i10;
        this.f18716b = sendMessagesHelper;
        this.f18717c = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18715a) {
            case 0:
                this.f18716b.lambda$performSendMessageRequestMulti$72(this.f18717c, this.d);
                return;
            case 1:
                this.f18716b.lambda$performSendMessageRequest$100(this.f18717c, this.d);
                return;
            default:
                this.f18716b.lambda$sendMessage$14(this.f18717c, this.d);
                return;
        }
    }
}
