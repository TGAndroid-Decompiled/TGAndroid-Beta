package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mj implements Runnable {
    public final int f18596a;
    public final SendMessagesHelper f18597b;
    public final ArrayList f18598c;
    public final int d;
    public final int f18599e;
    public final TLRPC.Message f18600f;
    public final int h;
    public final TLRPC.Message f18601n;
    public final MessageObject f18602r;
    public final int f18603s;

    public mj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f18596a = i14;
        this.f18597b = sendMessagesHelper;
        this.f18598c = arrayList;
        this.d = i10;
        this.f18599e = i11;
        this.f18600f = message;
        this.h = i12;
        this.f18601n = message2;
        this.f18602r = messageObject;
        this.f18603s = i13;
    }

    @Override
    public final void run() {
        switch (this.f18596a) {
            case 0:
                this.f18597b.lambda$sendMessage$9(this.f18598c, this.d, this.f18599e, this.f18600f, this.h, this.f18601n, this.f18602r, this.f18603s);
                return;
            default:
                this.f18597b.lambda$sendMessage$10(this.f18598c, this.d, this.f18599e, this.f18600f, this.h, this.f18601n, this.f18602r, this.f18603s);
                return;
        }
    }
}
