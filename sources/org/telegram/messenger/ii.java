package org.telegram.messenger;

import java.util.ArrayList;
public final class ii implements Runnable {
    public final int f18636a;
    public final SendMessagesHelper f18637b;
    public final long f18638c;
    public final ArrayList d;

    public ii(SendMessagesHelper sendMessagesHelper, long j10, ArrayList arrayList, int i10) {
        this.f18636a = i10;
        this.f18637b = sendMessagesHelper;
        this.f18638c = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18636a) {
            case 0:
                this.f18637b.lambda$performSendMessageRequestMulti$72(this.f18638c, this.d);
                return;
            case 1:
                this.f18637b.lambda$performSendMessageRequest$100(this.f18638c, this.d);
                return;
            default:
                this.f18637b.lambda$sendMessage$14(this.f18638c, this.d);
                return;
        }
    }
}
