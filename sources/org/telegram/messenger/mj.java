package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mj implements Runnable {
    public final int f18451a;
    public final SendMessagesHelper f18452b;
    public final ArrayList f18453c;
    public final int d;
    public final int f18454e;
    public final TLRPC.Message f18455f;
    public final int h;
    public final TLRPC.Message f18456n;
    public final MessageObject f18457r;
    public final int f18458s;

    public mj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f18451a = i14;
        this.f18452b = sendMessagesHelper;
        this.f18453c = arrayList;
        this.d = i10;
        this.f18454e = i11;
        this.f18455f = message;
        this.h = i12;
        this.f18456n = message2;
        this.f18457r = messageObject;
        this.f18458s = i13;
    }

    @Override
    public final void run() {
        switch (this.f18451a) {
            case 0:
                this.f18452b.lambda$sendMessage$9(this.f18453c, this.d, this.f18454e, this.f18455f, this.h, this.f18456n, this.f18457r, this.f18458s);
                return;
            default:
                this.f18452b.lambda$sendMessage$10(this.f18453c, this.d, this.f18454e, this.f18455f, this.h, this.f18456n, this.f18457r, this.f18458s);
                return;
        }
    }
}
