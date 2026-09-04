package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nj implements Runnable {
    public final int f18500a;
    public final SendMessagesHelper f18501b;
    public final ArrayList f18502c;
    public final int d;
    public final int f18503e;
    public final TLRPC.Message f18504f;
    public final int h;
    public final TLRPC.Message f18505n;
    public final MessageObject f18506r;
    public final int f18507s;

    public nj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f18500a = i14;
        this.f18501b = sendMessagesHelper;
        this.f18502c = arrayList;
        this.d = i10;
        this.f18503e = i11;
        this.f18504f = message;
        this.h = i12;
        this.f18505n = message2;
        this.f18506r = messageObject;
        this.f18507s = i13;
    }

    @Override
    public final void run() {
        switch (this.f18500a) {
            case 0:
                this.f18501b.lambda$sendMessage$9(this.f18502c, this.d, this.f18503e, this.f18504f, this.h, this.f18505n, this.f18506r, this.f18507s);
                return;
            default:
                this.f18501b.lambda$sendMessage$10(this.f18502c, this.d, this.f18503e, this.f18504f, this.h, this.f18505n, this.f18506r, this.f18507s);
                return;
        }
    }
}
