package org.telegram.messenger;

import java.util.ArrayList;
public final class ii implements Runnable {
    public final int f18638a;
    public final SendMessagesHelper f18639b;
    public final long f18640c;
    public final ArrayList d;

    public ii(SendMessagesHelper sendMessagesHelper, long j10, ArrayList arrayList, int i10) {
        this.f18638a = i10;
        this.f18639b = sendMessagesHelper;
        this.f18640c = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18638a) {
            case 0:
                this.f18639b.lambda$performSendMessageRequestMulti$72(this.f18640c, this.d);
                return;
            case 1:
                this.f18639b.lambda$performSendMessageRequest$100(this.f18640c, this.d);
                return;
            default:
                this.f18639b.lambda$sendMessage$14(this.f18640c, this.d);
                return;
        }
    }
}
