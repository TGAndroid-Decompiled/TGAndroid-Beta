package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hj implements Runnable {
    public final int f18556a;
    public final SendMessagesHelper f18557b;
    public final ArrayList f18558c;
    public final int d;
    public final int e;
    public final TLRPC.Message f18559f;
    public final int h;
    public final TLRPC.Message f18560n;
    public final MessageObject f18561r;
    public final int f18562s;

    public hj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f18556a = i14;
        this.f18557b = sendMessagesHelper;
        this.f18558c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f18559f = message;
        this.h = i12;
        this.f18560n = message2;
        this.f18561r = messageObject;
        this.f18562s = i13;
    }

    @Override
    public final void run() {
        switch (this.f18556a) {
            case 0:
                this.f18557b.lambda$sendMessage$12(this.f18558c, this.d, this.e, this.f18559f, this.h, this.f18560n, this.f18561r, this.f18562s);
                return;
            default:
                this.f18557b.lambda$sendMessage$13(this.f18558c, this.d, this.e, this.f18559f, this.h, this.f18560n, this.f18561r, this.f18562s);
                return;
        }
    }
}
