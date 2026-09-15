package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nj implements Runnable {
    public final int f16877a;
    public final SendMessagesHelper f16878b;
    public final ArrayList f16879c;
    public final int d;
    public final int e;
    public final TLRPC.Message f16880f;
    public final int h;
    public final TLRPC.Message f16881n;
    public final MessageObject f16882r;
    public final int f16883s;

    public nj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f16877a = i14;
        this.f16878b = sendMessagesHelper;
        this.f16879c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f16880f = message;
        this.h = i12;
        this.f16881n = message2;
        this.f16882r = messageObject;
        this.f16883s = i13;
    }

    @Override
    public final void run() {
        switch (this.f16877a) {
            case 0:
                this.f16878b.lambda$sendMessage$9(this.f16879c, this.d, this.e, this.f16880f, this.h, this.f16881n, this.f16882r, this.f16883s);
                return;
            default:
                this.f16878b.lambda$sendMessage$10(this.f16879c, this.d, this.e, this.f16880f, this.h, this.f16881n, this.f16882r, this.f16883s);
                return;
        }
    }
}
