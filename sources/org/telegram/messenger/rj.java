package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class rj implements Runnable {
    public final int f18811a;
    public final SendMessagesHelper f18812b;
    public final ArrayList f18813c;
    public final int d;
    public final int f18814e;
    public final TLRPC.Message f18815f;
    public final int h;
    public final TLRPC.Message f18816n;
    public final MessageObject f18817r;
    public final int f18818s;

    public rj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f18811a = i14;
        this.f18812b = sendMessagesHelper;
        this.f18813c = arrayList;
        this.d = i10;
        this.f18814e = i11;
        this.f18815f = message;
        this.h = i12;
        this.f18816n = message2;
        this.f18817r = messageObject;
        this.f18818s = i13;
    }

    @Override
    public final void run() {
        switch (this.f18811a) {
            case 0:
                this.f18812b.lambda$sendMessage$12(this.f18813c, this.d, this.f18814e, this.f18815f, this.h, this.f18816n, this.f18817r, this.f18818s);
                return;
            default:
                this.f18812b.lambda$sendMessage$13(this.f18813c, this.d, this.f18814e, this.f18815f, this.h, this.f18816n, this.f18817r, this.f18818s);
                return;
        }
    }
}
