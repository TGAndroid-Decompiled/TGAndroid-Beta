package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lj implements Runnable {
    public final int f18493a;
    public final SendMessagesHelper f18494b;
    public final ArrayList f18495c;
    public final int d;
    public final int f18496e;
    public final TLRPC.Message f18497f;
    public final int h;
    public final TLRPC.Message f18498n;
    public final MessageObject f18499r;
    public final int f18500s;

    public lj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f18493a = i14;
        this.f18494b = sendMessagesHelper;
        this.f18495c = arrayList;
        this.d = i10;
        this.f18496e = i11;
        this.f18497f = message;
        this.h = i12;
        this.f18498n = message2;
        this.f18499r = messageObject;
        this.f18500s = i13;
    }

    @Override
    public final void run() {
        switch (this.f18493a) {
            case 0:
                this.f18494b.lambda$sendMessage$12(this.f18495c, this.d, this.f18496e, this.f18497f, this.h, this.f18498n, this.f18499r, this.f18500s);
                return;
            default:
                this.f18494b.lambda$sendMessage$13(this.f18495c, this.d, this.f18496e, this.f18497f, this.h, this.f18498n, this.f18499r, this.f18500s);
                return;
        }
    }
}
