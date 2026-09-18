package org.telegram.messenger;

import java.util.ArrayList;
public final class ui implements Runnable {
    public final int f17662a;
    public final SendMessagesHelper f17663b;
    public final long f17664c;
    public final ArrayList d;

    public ui(SendMessagesHelper sendMessagesHelper, long j3, ArrayList arrayList, int i10) {
        this.f17662a = i10;
        this.f17663b = sendMessagesHelper;
        this.f17664c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17662a) {
            case 0:
                this.f17663b.lambda$sendMessage$11(this.f17664c, this.d);
                return;
            case 1:
                this.f17663b.lambda$performSendMessageRequestMulti$69(this.f17664c, this.d);
                return;
            default:
                this.f17663b.lambda$performSendMessageRequest$97(this.f17664c, this.d);
                return;
        }
    }
}
