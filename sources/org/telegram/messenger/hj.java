package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hj implements Runnable {
    public final int f18554a;
    public final SendMessagesHelper f18555b;
    public final ArrayList f18556c;
    public final int d;
    public final int e;
    public final TLRPC.Message f18557f;
    public final int h;
    public final TLRPC.Message f18558n;
    public final MessageObject f18559r;
    public final int f18560s;

    public hj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f18554a = i14;
        this.f18555b = sendMessagesHelper;
        this.f18556c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f18557f = message;
        this.h = i12;
        this.f18558n = message2;
        this.f18559r = messageObject;
        this.f18560s = i13;
    }

    @Override
    public final void run() {
        switch (this.f18554a) {
            case 0:
                this.f18555b.lambda$sendMessage$12(this.f18556c, this.d, this.e, this.f18557f, this.h, this.f18558n, this.f18559r, this.f18560s);
                return;
            default:
                this.f18555b.lambda$sendMessage$13(this.f18556c, this.d, this.e, this.f18557f, this.h, this.f18558n, this.f18559r, this.f18560s);
                return;
        }
    }
}
