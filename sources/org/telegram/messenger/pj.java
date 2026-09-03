package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pj implements Runnable {
    public final int f18130a;
    public final SendMessagesHelper f18131b;
    public final ArrayList f18132c;
    public final int d;
    public final int e;
    public final TLRPC.Message f18133f;
    public final int h;
    public final TLRPC.Message f18134n;
    public final MessageObject f18135r;
    public final int f18136s;

    public pj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f18130a = i14;
        this.f18131b = sendMessagesHelper;
        this.f18132c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f18133f = message;
        this.h = i12;
        this.f18134n = message2;
        this.f18135r = messageObject;
        this.f18136s = i13;
    }

    @Override
    public final void run() {
        switch (this.f18130a) {
            case 0:
                this.f18131b.lambda$sendMessage$9(this.f18132c, this.d, this.e, this.f18133f, this.h, this.f18134n, this.f18135r, this.f18136s);
                return;
            default:
                this.f18131b.lambda$sendMessage$10(this.f18132c, this.d, this.e, this.f18133f, this.h, this.f18134n, this.f18135r, this.f18136s);
                return;
        }
    }
}
