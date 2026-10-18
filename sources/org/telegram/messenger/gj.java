package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gj implements Runnable {
    public final int f18476a;
    public final SendMessagesHelper f18477b;
    public final ArrayList f18478c;
    public final int d;
    public final int e;
    public final TLRPC.Message f18479f;
    public final int h;
    public final TLRPC.Message f18480n;
    public final MessageObject f18481r;
    public final int f18482s;

    public gj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f18476a = i14;
        this.f18477b = sendMessagesHelper;
        this.f18478c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f18479f = message;
        this.h = i12;
        this.f18480n = message2;
        this.f18481r = messageObject;
        this.f18482s = i13;
    }

    @Override
    public final void run() {
        switch (this.f18476a) {
            case 0:
                this.f18477b.lambda$sendMessage$12(this.f18478c, this.d, this.e, this.f18479f, this.h, this.f18480n, this.f18481r, this.f18482s);
                return;
            default:
                this.f18477b.lambda$sendMessage$13(this.f18478c, this.d, this.e, this.f18479f, this.h, this.f18480n, this.f18481r, this.f18482s);
                return;
        }
    }
}
