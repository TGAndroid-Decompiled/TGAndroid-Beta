package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hj implements Runnable {
    public final int f18551a;
    public final SendMessagesHelper f18552b;
    public final ArrayList f18553c;
    public final int d;
    public final int e;
    public final TLRPC.Message f18554f;
    public final int h;
    public final TLRPC.Message f18555n;
    public final MessageObject f18556r;
    public final int f18557s;

    public hj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f18551a = i14;
        this.f18552b = sendMessagesHelper;
        this.f18553c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f18554f = message;
        this.h = i12;
        this.f18555n = message2;
        this.f18556r = messageObject;
        this.f18557s = i13;
    }

    @Override
    public final void run() {
        switch (this.f18551a) {
            case 0:
                this.f18552b.lambda$sendMessage$12(this.f18553c, this.d, this.e, this.f18554f, this.h, this.f18555n, this.f18556r, this.f18557s);
                return;
            default:
                this.f18552b.lambda$sendMessage$13(this.f18553c, this.d, this.e, this.f18554f, this.h, this.f18555n, this.f18556r, this.f18557s);
                return;
        }
    }
}
