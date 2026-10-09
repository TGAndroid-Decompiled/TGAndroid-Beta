package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lj implements Runnable {
    public final int f18455a;
    public final SendMessagesHelper f18456b;
    public final ArrayList f18457c;
    public final int d;
    public final int f18458e;
    public final TLRPC.Message f18459f;
    public final int h;
    public final TLRPC.Message f18460n;
    public final MessageObject f18461r;
    public final int f18462s;

    public lj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f18455a = i14;
        this.f18456b = sendMessagesHelper;
        this.f18457c = arrayList;
        this.d = i10;
        this.f18458e = i11;
        this.f18459f = message;
        this.h = i12;
        this.f18460n = message2;
        this.f18461r = messageObject;
        this.f18462s = i13;
    }

    @Override
    public final void run() {
        switch (this.f18455a) {
            case 0:
                this.f18456b.lambda$sendMessage$12(this.f18457c, this.d, this.f18458e, this.f18459f, this.h, this.f18460n, this.f18461r, this.f18462s);
                return;
            default:
                this.f18456b.lambda$sendMessage$13(this.f18457c, this.d, this.f18458e, this.f18459f, this.h, this.f18460n, this.f18461r, this.f18462s);
                return;
        }
    }
}
