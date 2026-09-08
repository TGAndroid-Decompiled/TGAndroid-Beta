package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nj implements Runnable {
    public final int f18527a;
    public final SendMessagesHelper f18528b;
    public final ArrayList f18529c;
    public final int d;
    public final int f18530e;
    public final TLRPC.Message f18531f;
    public final int h;
    public final TLRPC.Message f18532n;
    public final MessageObject f18533r;
    public final int f18534s;

    public nj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f18527a = i14;
        this.f18528b = sendMessagesHelper;
        this.f18529c = arrayList;
        this.d = i10;
        this.f18530e = i11;
        this.f18531f = message;
        this.h = i12;
        this.f18532n = message2;
        this.f18533r = messageObject;
        this.f18534s = i13;
    }

    @Override
    public final void run() {
        switch (this.f18527a) {
            case 0:
                this.f18528b.lambda$sendMessage$9(this.f18529c, this.d, this.f18530e, this.f18531f, this.h, this.f18532n, this.f18533r, this.f18534s);
                return;
            default:
                this.f18528b.lambda$sendMessage$10(this.f18529c, this.d, this.f18530e, this.f18531f, this.h, this.f18532n, this.f18533r, this.f18534s);
                return;
        }
    }
}
