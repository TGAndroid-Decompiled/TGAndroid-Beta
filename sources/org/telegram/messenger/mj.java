package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mj implements Runnable {
    public final int f18424a;
    public final SendMessagesHelper f18425b;
    public final ArrayList f18426c;
    public final int d;
    public final int f18427e;
    public final TLRPC.Message f18428f;
    public final int h;
    public final TLRPC.Message f18429n;
    public final MessageObject f18430r;
    public final int f18431s;

    public mj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f18424a = i14;
        this.f18425b = sendMessagesHelper;
        this.f18426c = arrayList;
        this.d = i10;
        this.f18427e = i11;
        this.f18428f = message;
        this.h = i12;
        this.f18429n = message2;
        this.f18430r = messageObject;
        this.f18431s = i13;
    }

    @Override
    public final void run() {
        switch (this.f18424a) {
            case 0:
                this.f18425b.lambda$sendMessage$9(this.f18426c, this.d, this.f18427e, this.f18428f, this.h, this.f18429n, this.f18430r, this.f18431s);
                return;
            default:
                this.f18425b.lambda$sendMessage$10(this.f18426c, this.d, this.f18427e, this.f18428f, this.h, this.f18429n, this.f18430r, this.f18431s);
                return;
        }
    }
}
