package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nj implements Runnable {
    public final int f16873a;
    public final SendMessagesHelper f16874b;
    public final ArrayList f16875c;
    public final int d;
    public final int e;
    public final TLRPC.Message f16876f;
    public final int h;
    public final TLRPC.Message f16877n;
    public final MessageObject f16878r;
    public final int f16879s;

    public nj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f16873a = i14;
        this.f16874b = sendMessagesHelper;
        this.f16875c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f16876f = message;
        this.h = i12;
        this.f16877n = message2;
        this.f16878r = messageObject;
        this.f16879s = i13;
    }

    @Override
    public final void run() {
        switch (this.f16873a) {
            case 0:
                this.f16874b.lambda$sendMessage$9(this.f16875c, this.d, this.e, this.f16876f, this.h, this.f16877n, this.f16878r, this.f16879s);
                return;
            default:
                this.f16874b.lambda$sendMessage$10(this.f16875c, this.d, this.e, this.f16876f, this.h, this.f16877n, this.f16878r, this.f16879s);
                return;
        }
    }
}
