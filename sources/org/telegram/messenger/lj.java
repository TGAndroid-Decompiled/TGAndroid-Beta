package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lj implements Runnable {
    public final int f16950a;
    public final SendMessagesHelper f16951b;
    public final ArrayList f16952c;
    public final int d;
    public final int e;
    public final TLRPC.Message f16953f;
    public final int h;
    public final TLRPC.Message f16954n;
    public final MessageObject f16955r;
    public final int f16956s;

    public lj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f16950a = i14;
        this.f16951b = sendMessagesHelper;
        this.f16952c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f16953f = message;
        this.h = i12;
        this.f16954n = message2;
        this.f16955r = messageObject;
        this.f16956s = i13;
    }

    @Override
    public final void run() {
        switch (this.f16950a) {
            case 0:
                this.f16951b.lambda$sendMessage$9(this.f16952c, this.d, this.e, this.f16953f, this.h, this.f16954n, this.f16955r, this.f16956s);
                return;
            default:
                this.f16951b.lambda$sendMessage$10(this.f16952c, this.d, this.e, this.f16953f, this.h, this.f16954n, this.f16955r, this.f16956s);
                return;
        }
    }
}
