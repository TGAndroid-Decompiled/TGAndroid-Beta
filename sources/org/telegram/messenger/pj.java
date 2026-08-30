package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pj implements Runnable {
    public final int f18156a;
    public final SendMessagesHelper f18157b;
    public final ArrayList f18158c;
    public final int d;
    public final int e;
    public final TLRPC.Message f18159f;
    public final int h;
    public final TLRPC.Message f18160n;
    public final MessageObject f18161r;
    public final int f18162s;

    public pj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f18156a = i14;
        this.f18157b = sendMessagesHelper;
        this.f18158c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f18159f = message;
        this.h = i12;
        this.f18160n = message2;
        this.f18161r = messageObject;
        this.f18162s = i13;
    }

    @Override
    public final void run() {
        switch (this.f18156a) {
            case 0:
                this.f18157b.lambda$sendMessage$9(this.f18158c, this.d, this.e, this.f18159f, this.h, this.f18160n, this.f18161r, this.f18162s);
                return;
            default:
                this.f18157b.lambda$sendMessage$10(this.f18158c, this.d, this.e, this.f18159f, this.h, this.f18160n, this.f18161r, this.f18162s);
                return;
        }
    }
}
