package org.telegram.messenger;

import java.util.ArrayList;
public final class hi implements Runnable {
    public final int f18548a;
    public final SendMessagesHelper f18549b;
    public final long f18550c;
    public final ArrayList d;

    public hi(SendMessagesHelper sendMessagesHelper, long j10, ArrayList arrayList, int i10) {
        this.f18548a = i10;
        this.f18549b = sendMessagesHelper;
        this.f18550c = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18548a) {
            case 0:
                this.f18549b.lambda$performSendMessageRequestMulti$72(this.f18550c, this.d);
                return;
            case 1:
                this.f18549b.lambda$performSendMessageRequest$100(this.f18550c, this.d);
                return;
            default:
                this.f18549b.lambda$sendMessage$14(this.f18550c, this.d);
                return;
        }
    }
}
