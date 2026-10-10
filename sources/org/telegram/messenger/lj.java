package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lj implements Runnable {
    public final int f18459a;
    public final SendMessagesHelper f18460b;
    public final ArrayList f18461c;
    public final int d;
    public final int f18462e;
    public final TLRPC.Message f18463f;
    public final int h;
    public final TLRPC.Message f18464n;
    public final MessageObject f18465r;
    public final int f18466s;

    public lj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f18459a = i14;
        this.f18460b = sendMessagesHelper;
        this.f18461c = arrayList;
        this.d = i10;
        this.f18462e = i11;
        this.f18463f = message;
        this.h = i12;
        this.f18464n = message2;
        this.f18465r = messageObject;
        this.f18466s = i13;
    }

    @Override
    public final void run() {
        switch (this.f18459a) {
            case 0:
                this.f18460b.lambda$sendMessage$12(this.f18461c, this.d, this.f18462e, this.f18463f, this.h, this.f18464n, this.f18465r, this.f18466s);
                return;
            default:
                this.f18460b.lambda$sendMessage$13(this.f18461c, this.d, this.f18462e, this.f18463f, this.h, this.f18464n, this.f18465r, this.f18466s);
                return;
        }
    }
}
