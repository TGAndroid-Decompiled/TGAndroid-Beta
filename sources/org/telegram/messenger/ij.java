package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ij implements Runnable {
    public final int f18648a;
    public final SendMessagesHelper f18649b;
    public final ArrayList f18650c;
    public final int d;
    public final int e;
    public final TLRPC.Message f18651f;
    public final int h;
    public final TLRPC.Message f18652n;
    public final MessageObject f18653r;
    public final int f18654s;

    public ij(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f18648a = i14;
        this.f18649b = sendMessagesHelper;
        this.f18650c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f18651f = message;
        this.h = i12;
        this.f18652n = message2;
        this.f18653r = messageObject;
        this.f18654s = i13;
    }

    @Override
    public final void run() {
        switch (this.f18648a) {
            case 0:
                this.f18649b.lambda$sendMessage$12(this.f18650c, this.d, this.e, this.f18651f, this.h, this.f18652n, this.f18653r, this.f18654s);
                return;
            default:
                this.f18649b.lambda$sendMessage$13(this.f18650c, this.d, this.e, this.f18651f, this.h, this.f18652n, this.f18653r, this.f18654s);
                return;
        }
    }
}
