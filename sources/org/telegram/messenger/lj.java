package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lj implements Runnable {
    public final int f18457a;
    public final SendMessagesHelper f18458b;
    public final ArrayList f18459c;
    public final int d;
    public final int f18460e;
    public final TLRPC.Message f18461f;
    public final int h;
    public final TLRPC.Message f18462n;
    public final MessageObject f18463r;
    public final int f18464s;

    public lj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f18457a = i14;
        this.f18458b = sendMessagesHelper;
        this.f18459c = arrayList;
        this.d = i10;
        this.f18460e = i11;
        this.f18461f = message;
        this.h = i12;
        this.f18462n = message2;
        this.f18463r = messageObject;
        this.f18464s = i13;
    }

    @Override
    public final void run() {
        switch (this.f18457a) {
            case 0:
                this.f18458b.lambda$sendMessage$12(this.f18459c, this.d, this.f18460e, this.f18461f, this.h, this.f18462n, this.f18463r, this.f18464s);
                return;
            default:
                this.f18458b.lambda$sendMessage$13(this.f18459c, this.d, this.f18460e, this.f18461f, this.h, this.f18462n, this.f18463r, this.f18464s);
                return;
        }
    }
}
