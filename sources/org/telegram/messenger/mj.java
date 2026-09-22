package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mj implements Runnable {
    public final int f17032a;
    public final SendMessagesHelper f17033b;
    public final ArrayList f17034c;
    public final int d;
    public final int e;
    public final TLRPC.Message f17035f;
    public final int h;
    public final TLRPC.Message f17036n;
    public final MessageObject f17037r;
    public final int f17038s;

    public mj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f17032a = i14;
        this.f17033b = sendMessagesHelper;
        this.f17034c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f17035f = message;
        this.h = i12;
        this.f17036n = message2;
        this.f17037r = messageObject;
        this.f17038s = i13;
    }

    @Override
    public final void run() {
        switch (this.f17032a) {
            case 0:
                this.f17033b.lambda$sendMessage$9(this.f17034c, this.d, this.e, this.f17035f, this.h, this.f17036n, this.f17037r, this.f17038s);
                return;
            default:
                this.f17033b.lambda$sendMessage$10(this.f17034c, this.d, this.e, this.f17035f, this.h, this.f17036n, this.f17037r, this.f17038s);
                return;
        }
    }
}
