package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lj implements Runnable {
    public final int f16954a;
    public final SendMessagesHelper f16955b;
    public final ArrayList f16956c;
    public final int d;
    public final int e;
    public final TLRPC.Message f16957f;
    public final int h;
    public final TLRPC.Message f16958n;
    public final MessageObject f16959r;
    public final int f16960s;

    public lj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f16954a = i14;
        this.f16955b = sendMessagesHelper;
        this.f16956c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f16957f = message;
        this.h = i12;
        this.f16958n = message2;
        this.f16959r = messageObject;
        this.f16960s = i13;
    }

    @Override
    public final void run() {
        switch (this.f16954a) {
            case 0:
                this.f16955b.lambda$sendMessage$9(this.f16956c, this.d, this.e, this.f16957f, this.h, this.f16958n, this.f16959r, this.f16960s);
                return;
            default:
                this.f16955b.lambda$sendMessage$10(this.f16956c, this.d, this.e, this.f16957f, this.h, this.f16958n, this.f16959r, this.f16960s);
                return;
        }
    }
}
