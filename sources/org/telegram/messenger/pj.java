package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pj implements Runnable {
    public final int f19711a;
    public final SendMessagesHelper f19712b;
    public final ArrayList f19713c;
    public final int d;
    public final int f19714e;
    public final TLRPC.Message f19715f;
    public final int h;
    public final TLRPC.Message f19716n;
    public final MessageObject f19717r;
    public final int f19718s;

    public pj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f19711a = i14;
        this.f19712b = sendMessagesHelper;
        this.f19713c = arrayList;
        this.d = i10;
        this.f19714e = i11;
        this.f19715f = message;
        this.h = i12;
        this.f19716n = message2;
        this.f19717r = messageObject;
        this.f19718s = i13;
    }

    @Override
    public final void run() {
        switch (this.f19711a) {
            case 0:
                this.f19712b.lambda$sendMessage$9(this.f19713c, this.d, this.f19714e, this.f19715f, this.h, this.f19716n, this.f19717r, this.f19718s);
                return;
            default:
                this.f19712b.lambda$sendMessage$10(this.f19713c, this.d, this.f19714e, this.f19715f, this.h, this.f19716n, this.f19717r, this.f19718s);
                return;
        }
    }
}
