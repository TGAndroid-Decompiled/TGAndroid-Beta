package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class rj implements Runnable {
    public final int f18810a;
    public final SendMessagesHelper f18811b;
    public final ArrayList f18812c;
    public final int d;
    public final int f18813e;
    public final TLRPC.Message f18814f;
    public final int h;
    public final TLRPC.Message f18815n;
    public final MessageObject f18816r;
    public final int f18817s;

    public rj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f18810a = i14;
        this.f18811b = sendMessagesHelper;
        this.f18812c = arrayList;
        this.d = i10;
        this.f18813e = i11;
        this.f18814f = message;
        this.h = i12;
        this.f18815n = message2;
        this.f18816r = messageObject;
        this.f18817s = i13;
    }

    @Override
    public final void run() {
        switch (this.f18810a) {
            case 0:
                this.f18811b.lambda$sendMessage$12(this.f18812c, this.d, this.f18813e, this.f18814f, this.h, this.f18815n, this.f18816r, this.f18817s);
                return;
            default:
                this.f18811b.lambda$sendMessage$13(this.f18812c, this.d, this.f18813e, this.f18814f, this.h, this.f18815n, this.f18816r, this.f18817s);
                return;
        }
    }
}
