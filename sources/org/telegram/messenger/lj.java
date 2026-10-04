package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lj implements Runnable {
    public final int f18506a;
    public final SendMessagesHelper f18507b;
    public final ArrayList f18508c;
    public final int d;
    public final int f18509e;
    public final TLRPC.Message f18510f;
    public final int h;
    public final TLRPC.Message f18511n;
    public final MessageObject f18512r;
    public final int f18513s;

    public lj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f18506a = i14;
        this.f18507b = sendMessagesHelper;
        this.f18508c = arrayList;
        this.d = i10;
        this.f18509e = i11;
        this.f18510f = message;
        this.h = i12;
        this.f18511n = message2;
        this.f18512r = messageObject;
        this.f18513s = i13;
    }

    @Override
    public final void run() {
        switch (this.f18506a) {
            case 0:
                this.f18507b.lambda$sendMessage$9(this.f18508c, this.d, this.f18509e, this.f18510f, this.h, this.f18511n, this.f18512r, this.f18513s);
                return;
            default:
                this.f18507b.lambda$sendMessage$10(this.f18508c, this.d, this.f18509e, this.f18510f, this.h, this.f18511n, this.f18512r, this.f18513s);
                return;
        }
    }
}
