package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jj implements Runnable {
    public final int f18786a;
    public final SendMessagesHelper f18787b;
    public final ArrayList f18788c;
    public final int d;
    public final int e;
    public final TLRPC.Message f18789f;
    public final int h;
    public final TLRPC.Message f18790n;
    public final MessageObject f18791r;
    public final int f18792s;

    public jj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f18786a = i14;
        this.f18787b = sendMessagesHelper;
        this.f18788c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f18789f = message;
        this.h = i12;
        this.f18790n = message2;
        this.f18791r = messageObject;
        this.f18792s = i13;
    }

    @Override
    public final void run() {
        switch (this.f18786a) {
            case 0:
                this.f18787b.lambda$sendMessage$12(this.f18788c, this.d, this.e, this.f18789f, this.h, this.f18790n, this.f18791r, this.f18792s);
                return;
            default:
                this.f18787b.lambda$sendMessage$13(this.f18788c, this.d, this.e, this.f18789f, this.h, this.f18790n, this.f18791r, this.f18792s);
                return;
        }
    }
}
