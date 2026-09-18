package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nj implements Runnable {
    public final int f17055a;
    public final SendMessagesHelper f17056b;
    public final ArrayList f17057c;
    public final int d;
    public final int e;
    public final TLRPC.Message f17058f;
    public final int h;
    public final TLRPC.Message f17059n;
    public final MessageObject f17060r;
    public final int f17061s;

    public nj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f17055a = i14;
        this.f17056b = sendMessagesHelper;
        this.f17057c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f17058f = message;
        this.h = i12;
        this.f17059n = message2;
        this.f17060r = messageObject;
        this.f17061s = i13;
    }

    @Override
    public final void run() {
        switch (this.f17055a) {
            case 0:
                this.f17056b.lambda$sendMessage$9(this.f17057c, this.d, this.e, this.f17058f, this.h, this.f17059n, this.f17060r, this.f17061s);
                return;
            default:
                this.f17056b.lambda$sendMessage$10(this.f17057c, this.d, this.e, this.f17058f, this.h, this.f17059n, this.f17060r, this.f17061s);
                return;
        }
    }
}
