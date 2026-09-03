package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pj implements Runnable {
    public final int f19713a;
    public final SendMessagesHelper f19714b;
    public final ArrayList f19715c;
    public final int d;
    public final int f19716e;
    public final TLRPC.Message f19717f;
    public final int h;
    public final TLRPC.Message f19718n;
    public final MessageObject f19719r;
    public final int f19720s;

    public pj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f19713a = i14;
        this.f19714b = sendMessagesHelper;
        this.f19715c = arrayList;
        this.d = i10;
        this.f19716e = i11;
        this.f19717f = message;
        this.h = i12;
        this.f19718n = message2;
        this.f19719r = messageObject;
        this.f19720s = i13;
    }

    @Override
    public final void run() {
        switch (this.f19713a) {
            case 0:
                this.f19714b.lambda$sendMessage$9(this.f19715c, this.d, this.f19716e, this.f19717f, this.h, this.f19718n, this.f19719r, this.f19720s);
                return;
            default:
                this.f19714b.lambda$sendMessage$10(this.f19715c, this.d, this.f19716e, this.f19717f, this.h, this.f19718n, this.f19719r, this.f19720s);
                return;
        }
    }
}
