package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mj implements Runnable {
    public final int f18601a;
    public final SendMessagesHelper f18602b;
    public final ArrayList f18603c;
    public final int d;
    public final int f18604e;
    public final TLRPC.Message f18605f;
    public final int h;
    public final TLRPC.Message f18606n;
    public final MessageObject f18607r;
    public final int f18608s;

    public mj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f18601a = i14;
        this.f18602b = sendMessagesHelper;
        this.f18603c = arrayList;
        this.d = i10;
        this.f18604e = i11;
        this.f18605f = message;
        this.h = i12;
        this.f18606n = message2;
        this.f18607r = messageObject;
        this.f18608s = i13;
    }

    @Override
    public final void run() {
        switch (this.f18601a) {
            case 0:
                this.f18602b.lambda$sendMessage$9(this.f18603c, this.d, this.f18604e, this.f18605f, this.h, this.f18606n, this.f18607r, this.f18608s);
                return;
            default:
                this.f18602b.lambda$sendMessage$10(this.f18603c, this.d, this.f18604e, this.f18605f, this.h, this.f18606n, this.f18607r, this.f18608s);
                return;
        }
    }
}
