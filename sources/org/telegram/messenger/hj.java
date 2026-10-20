package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hj implements Runnable {
    public final int f18559a;
    public final SendMessagesHelper f18560b;
    public final ArrayList f18561c;
    public final int d;
    public final int e;
    public final TLRPC.Message f18562f;
    public final int h;
    public final TLRPC.Message f18563n;
    public final MessageObject f18564r;
    public final int f18565s;

    public hj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f18559a = i14;
        this.f18560b = sendMessagesHelper;
        this.f18561c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f18562f = message;
        this.h = i12;
        this.f18563n = message2;
        this.f18564r = messageObject;
        this.f18565s = i13;
    }

    @Override
    public final void run() {
        switch (this.f18559a) {
            case 0:
                this.f18560b.lambda$sendMessage$12(this.f18561c, this.d, this.e, this.f18562f, this.h, this.f18563n, this.f18564r, this.f18565s);
                return;
            default:
                this.f18560b.lambda$sendMessage$13(this.f18561c, this.d, this.e, this.f18562f, this.h, this.f18563n, this.f18564r, this.f18565s);
                return;
        }
    }
}
