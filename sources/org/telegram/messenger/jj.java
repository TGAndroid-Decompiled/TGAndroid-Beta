package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jj implements Runnable {
    public final int f18718a;
    public final SendMessagesHelper f18719b;
    public final ArrayList f18720c;
    public final int d;
    public final int e;
    public final TLRPC.Message f18721f;
    public final int h;
    public final TLRPC.Message f18722n;
    public final MessageObject f18723r;
    public final int f18724s;

    public jj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f18718a = i14;
        this.f18719b = sendMessagesHelper;
        this.f18720c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f18721f = message;
        this.h = i12;
        this.f18722n = message2;
        this.f18723r = messageObject;
        this.f18724s = i13;
    }

    @Override
    public final void run() {
        switch (this.f18718a) {
            case 0:
                this.f18719b.lambda$sendMessage$12(this.f18720c, this.d, this.e, this.f18721f, this.h, this.f18722n, this.f18723r, this.f18724s);
                return;
            default:
                this.f18719b.lambda$sendMessage$13(this.f18720c, this.d, this.e, this.f18721f, this.h, this.f18722n, this.f18723r, this.f18724s);
                return;
        }
    }
}
