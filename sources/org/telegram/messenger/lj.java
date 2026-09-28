package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lj implements Runnable {
    public final int f16955a;
    public final SendMessagesHelper f16956b;
    public final ArrayList f16957c;
    public final int d;
    public final int e;
    public final TLRPC.Message f16958f;
    public final int h;
    public final TLRPC.Message f16959n;
    public final MessageObject f16960r;
    public final int f16961s;

    public lj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f16955a = i14;
        this.f16956b = sendMessagesHelper;
        this.f16957c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f16958f = message;
        this.h = i12;
        this.f16959n = message2;
        this.f16960r = messageObject;
        this.f16961s = i13;
    }

    @Override
    public final void run() {
        switch (this.f16955a) {
            case 0:
                this.f16956b.lambda$sendMessage$9(this.f16957c, this.d, this.e, this.f16958f, this.h, this.f16959n, this.f16960r, this.f16961s);
                return;
            default:
                this.f16956b.lambda$sendMessage$10(this.f16957c, this.d, this.e, this.f16958f, this.h, this.f16959n, this.f16960r, this.f16961s);
                return;
        }
    }
}
