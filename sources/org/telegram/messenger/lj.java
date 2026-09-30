package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lj implements Runnable {
    public final int f16971a;
    public final SendMessagesHelper f16972b;
    public final ArrayList f16973c;
    public final int d;
    public final int e;
    public final TLRPC.Message f16974f;
    public final int h;
    public final TLRPC.Message f16975n;
    public final MessageObject f16976r;
    public final int f16977s;

    public lj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f16971a = i14;
        this.f16972b = sendMessagesHelper;
        this.f16973c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f16974f = message;
        this.h = i12;
        this.f16975n = message2;
        this.f16976r = messageObject;
        this.f16977s = i13;
    }

    @Override
    public final void run() {
        switch (this.f16971a) {
            case 0:
                this.f16972b.lambda$sendMessage$9(this.f16973c, this.d, this.e, this.f16974f, this.h, this.f16975n, this.f16976r, this.f16977s);
                return;
            default:
                this.f16972b.lambda$sendMessage$10(this.f16973c, this.d, this.e, this.f16974f, this.h, this.f16975n, this.f16976r, this.f16977s);
                return;
        }
    }
}
