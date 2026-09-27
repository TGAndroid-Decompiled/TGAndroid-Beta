package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lj implements Runnable {
    public final int f16944a;
    public final SendMessagesHelper f16945b;
    public final ArrayList f16946c;
    public final int d;
    public final int e;
    public final TLRPC.Message f16947f;
    public final int h;
    public final TLRPC.Message f16948n;
    public final MessageObject f16949r;
    public final int f16950s;

    public lj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f16944a = i14;
        this.f16945b = sendMessagesHelper;
        this.f16946c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f16947f = message;
        this.h = i12;
        this.f16948n = message2;
        this.f16949r = messageObject;
        this.f16950s = i13;
    }

    @Override
    public final void run() {
        switch (this.f16944a) {
            case 0:
                this.f16945b.lambda$sendMessage$9(this.f16946c, this.d, this.e, this.f16947f, this.h, this.f16948n, this.f16949r, this.f16950s);
                return;
            default:
                this.f16945b.lambda$sendMessage$10(this.f16946c, this.d, this.e, this.f16947f, this.h, this.f16948n, this.f16949r, this.f16950s);
                return;
        }
    }
}
