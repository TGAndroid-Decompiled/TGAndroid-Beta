package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class oj implements Runnable {
    public final int f18041a;
    public final SendMessagesHelper f18042b;
    public final ArrayList f18043c;
    public final int d;
    public final int e;
    public final TLRPC.Message f18044f;
    public final int h;
    public final TLRPC.Message f18045n;
    public final MessageObject f18046r;
    public final int f18047s;

    public oj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f18041a = i14;
        this.f18042b = sendMessagesHelper;
        this.f18043c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f18044f = message;
        this.h = i12;
        this.f18045n = message2;
        this.f18046r = messageObject;
        this.f18047s = i13;
    }

    @Override
    public final void run() {
        switch (this.f18041a) {
            case 0:
                this.f18042b.lambda$sendMessage$12(this.f18043c, this.d, this.e, this.f18044f, this.h, this.f18045n, this.f18046r, this.f18047s);
                return;
            default:
                this.f18042b.lambda$sendMessage$13(this.f18043c, this.d, this.e, this.f18044f, this.h, this.f18045n, this.f18046r, this.f18047s);
                return;
        }
    }
}
