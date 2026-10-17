package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hj implements Runnable {
    public final int f18543a;
    public final SendMessagesHelper f18544b;
    public final ArrayList f18545c;
    public final int d;
    public final int e;
    public final TLRPC.Message f18546f;
    public final int h;
    public final TLRPC.Message f18547n;
    public final MessageObject f18548r;
    public final int f18549s;

    public hj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f18543a = i14;
        this.f18544b = sendMessagesHelper;
        this.f18545c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f18546f = message;
        this.h = i12;
        this.f18547n = message2;
        this.f18548r = messageObject;
        this.f18549s = i13;
    }

    @Override
    public final void run() {
        switch (this.f18543a) {
            case 0:
                this.f18544b.lambda$sendMessage$12(this.f18545c, this.d, this.e, this.f18546f, this.h, this.f18547n, this.f18548r, this.f18549s);
                return;
            default:
                this.f18544b.lambda$sendMessage$13(this.f18545c, this.d, this.e, this.f18546f, this.h, this.f18547n, this.f18548r, this.f18549s);
                return;
        }
    }
}
