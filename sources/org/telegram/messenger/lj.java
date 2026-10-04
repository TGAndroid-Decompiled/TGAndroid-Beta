package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lj implements Runnable {
    public final int f18507a;
    public final SendMessagesHelper f18508b;
    public final ArrayList f18509c;
    public final int d;
    public final int f18510e;
    public final TLRPC.Message f18511f;
    public final int h;
    public final TLRPC.Message f18512n;
    public final MessageObject f18513r;
    public final int f18514s;

    public lj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f18507a = i14;
        this.f18508b = sendMessagesHelper;
        this.f18509c = arrayList;
        this.d = i10;
        this.f18510e = i11;
        this.f18511f = message;
        this.h = i12;
        this.f18512n = message2;
        this.f18513r = messageObject;
        this.f18514s = i13;
    }

    @Override
    public final void run() {
        switch (this.f18507a) {
            case 0:
                this.f18508b.lambda$sendMessage$9(this.f18509c, this.d, this.f18510e, this.f18511f, this.h, this.f18512n, this.f18513r, this.f18514s);
                return;
            default:
                this.f18508b.lambda$sendMessage$10(this.f18509c, this.d, this.f18510e, this.f18511f, this.h, this.f18512n, this.f18513r, this.f18514s);
                return;
        }
    }
}
