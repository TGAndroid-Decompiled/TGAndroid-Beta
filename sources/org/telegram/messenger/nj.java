package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nj implements Runnable {
    public final int f16886a;
    public final SendMessagesHelper f16887b;
    public final ArrayList f16888c;
    public final int d;
    public final int e;
    public final TLRPC.Message f16889f;
    public final int h;
    public final TLRPC.Message f16890n;
    public final MessageObject f16891r;
    public final int f16892s;

    public nj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f16886a = i14;
        this.f16887b = sendMessagesHelper;
        this.f16888c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f16889f = message;
        this.h = i12;
        this.f16890n = message2;
        this.f16891r = messageObject;
        this.f16892s = i13;
    }

    @Override
    public final void run() {
        switch (this.f16886a) {
            case 0:
                this.f16887b.lambda$sendMessage$9(this.f16888c, this.d, this.e, this.f16889f, this.h, this.f16890n, this.f16891r, this.f16892s);
                return;
            default:
                this.f16887b.lambda$sendMessage$10(this.f16888c, this.d, this.e, this.f16889f, this.h, this.f16890n, this.f16891r, this.f16892s);
                return;
        }
    }
}
