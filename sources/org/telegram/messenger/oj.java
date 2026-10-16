package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class oj implements Runnable {
    public final int f17743a;
    public final SendMessagesHelper f17744b;
    public final ArrayList f17745c;
    public final int d;
    public final int e;
    public final TLRPC.Message f17746f;
    public final int h;
    public final TLRPC.Message f17747n;
    public final MessageObject f17748r;
    public final int f17749s;

    public oj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f17743a = i14;
        this.f17744b = sendMessagesHelper;
        this.f17745c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f17746f = message;
        this.h = i12;
        this.f17747n = message2;
        this.f17748r = messageObject;
        this.f17749s = i13;
    }

    @Override
    public final void run() {
        switch (this.f17743a) {
            case 0:
                this.f17744b.lambda$sendMessage$12(this.f17745c, this.d, this.e, this.f17746f, this.h, this.f17747n, this.f17748r, this.f17749s);
                return;
            default:
                this.f17744b.lambda$sendMessage$13(this.f17745c, this.d, this.e, this.f17746f, this.h, this.f17747n, this.f17748r, this.f17749s);
                return;
        }
    }
}
