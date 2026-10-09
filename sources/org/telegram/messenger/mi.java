package org.telegram.messenger;

import java.util.ArrayList;
public final class mi implements Runnable {
    public final int f18546a;
    public final SendMessagesHelper f18547b;
    public final long f18548c;
    public final ArrayList d;

    public mi(SendMessagesHelper sendMessagesHelper, long j3, ArrayList arrayList, int i10) {
        this.f18546a = i10;
        this.f18547b = sendMessagesHelper;
        this.f18548c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18546a) {
            case 0:
                this.f18547b.lambda$performSendMessageRequestMulti$72(this.f18548c, this.d);
                return;
            case 1:
                this.f18547b.lambda$performSendMessageRequest$100(this.f18548c, this.d);
                return;
            default:
                this.f18547b.lambda$sendMessage$14(this.f18548c, this.d);
                return;
        }
    }
}
