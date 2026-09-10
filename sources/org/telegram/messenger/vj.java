package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class vj implements Runnable {
    public final int f16666a;
    public final SendMessagesHelper f16667b;
    public final ArrayList f16668c;
    public final int d;
    public final int e;
    public final TLRPC.Message f16669f;
    public final int h;
    public final TLRPC.Message f16670n;
    public final MessageObject f16671r;
    public final int f16672s;

    public vj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f16666a = i14;
        this.f16667b = sendMessagesHelper;
        this.f16668c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f16669f = message;
        this.h = i12;
        this.f16670n = message2;
        this.f16671r = messageObject;
        this.f16672s = i13;
    }

    @Override
    public final void run() {
        switch (this.f16666a) {
            case 0:
                this.f16667b.lambda$sendMessage$9(this.f16668c, this.d, this.e, this.f16669f, this.h, this.f16670n, this.f16671r, this.f16672s);
                return;
            default:
                this.f16667b.lambda$sendMessage$10(this.f16668c, this.d, this.e, this.f16669f, this.h, this.f16670n, this.f16671r, this.f16672s);
                return;
        }
    }
}
