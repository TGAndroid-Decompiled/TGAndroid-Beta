package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lj implements Runnable {
    public final int f16935a;
    public final SendMessagesHelper f16936b;
    public final ArrayList f16937c;
    public final int d;
    public final int e;
    public final TLRPC.Message f16938f;
    public final int h;
    public final TLRPC.Message f16939n;
    public final MessageObject f16940r;
    public final int f16941s;

    public lj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f16935a = i14;
        this.f16936b = sendMessagesHelper;
        this.f16937c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f16938f = message;
        this.h = i12;
        this.f16939n = message2;
        this.f16940r = messageObject;
        this.f16941s = i13;
    }

    @Override
    public final void run() {
        switch (this.f16935a) {
            case 0:
                this.f16936b.lambda$sendMessage$9(this.f16937c, this.d, this.e, this.f16938f, this.h, this.f16939n, this.f16940r, this.f16941s);
                return;
            default:
                this.f16936b.lambda$sendMessage$10(this.f16937c, this.d, this.e, this.f16938f, this.h, this.f16939n, this.f16940r, this.f16941s);
                return;
        }
    }
}
