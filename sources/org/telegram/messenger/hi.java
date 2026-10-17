package org.telegram.messenger;

import java.util.ArrayList;
public final class hi implements Runnable {
    public final int f18540a;
    public final SendMessagesHelper f18541b;
    public final long f18542c;
    public final ArrayList d;

    public hi(SendMessagesHelper sendMessagesHelper, long j10, ArrayList arrayList, int i10) {
        this.f18540a = i10;
        this.f18541b = sendMessagesHelper;
        this.f18542c = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18540a) {
            case 0:
                this.f18541b.lambda$performSendMessageRequestMulti$72(this.f18542c, this.d);
                return;
            case 1:
                this.f18541b.lambda$performSendMessageRequest$100(this.f18542c, this.d);
                return;
            default:
                this.f18541b.lambda$sendMessage$14(this.f18542c, this.d);
                return;
        }
    }
}
